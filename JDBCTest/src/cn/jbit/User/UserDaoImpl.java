package cn.jbit.User;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mysql.jdbc.Driver;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<User>();
		try {
			java.sql.Connection con = getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "Select * from t_user";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				User en = new User();
				en.setId(rs.getLong("id"));
				en.setEmail(rs.getString("Email"));
				en.setPassword(rs.getString("Password"));
				en.setPhone(rs.getString("Phone"));
				en.setRealName(rs.getString("Real_Name"));
				en.setRealName(rs.getString("id_card"));
				en.setRiskEvaluation(rs.getString("Risk_Evaluation"));
				en.setTransactionPassword(rs.getString("Transaction_Password"));
				  
				list.add(en);
			}

			rs.close();
			ps.close();
			con.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
	
	
	public Integer insertUser(User user) {
		try {
			java.sql.Connection con = getConnection();
			PreparedStatement ps = null;
			
			String sql = "INSERT INTO t_user( Real_Name,id_card,Phone,Password,Transaction_Password,Email,Risk_Evaluation)"
					+ " VALUES (				 		?,		?,		?,		?,					?,		?,?);";
			ps = con.prepareStatement(sql);
			//ps.setLong(0, user.getId());
			ps.setString(1, user.getRealName());
			ps.setString(2, user.getIdCard());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getTransactionPassword());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getRiskEvaluation());
			int num = ps.executeUpdate();

			ps.close();
			con.close();
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	public RsTable getRsTable() {
		RsTable rsTable  = new RsTable();
		
		List<Map<String, Object>> list = new ArrayList<>();
		try {
			java.sql.Connection con = getConnection();
			PreparedStatement ps = null;
			PreparedStatement ps1 = null;
			ResultSet rs = null;
			ResultSet rs1 = null;
			String sql1 = "select COUNT(*) FROM t_student";
			String sql = "Select * from t_student";
			ps = con.prepareStatement(sql);
			ps1 = con.prepareStatement(sql1);
			rs = ps.executeQuery();
			
			rs1 = ps1.executeQuery();
			rs1.next();
			int gt =rs1.getInt(1);
			System.out.println("条数"+gt);
			
			ResultSetMetaData getMetaData = rs.getMetaData();
//			System.out.println(getMetaData.getColumnName(1)+" | "+getMetaData.getColumnName(2));
			
			ArrayList<String> columnList = new ArrayList<>();
			int getColumnCount = getMetaData.getColumnCount();
			for(int i=1;i<=getColumnCount;i++){
				columnList.add(getMetaData.getColumnName(i));
			}
			rsTable.setColumnNameList(columnList);
			while (rs.next()) {
//				System.out.println(rs.getLong(1)+" | "+rs.getString(2));
				HashMap<String, Object> row = new HashMap<>();
				//id | Real_Name | id_card | Phone | Password | Transaction_Password | Email | Risk_Evaluation | 
				
				for(String colName : columnList){
					try {
						row.put(colName, rs.getString(colName));
					} catch (Exception e) {
						row.put(colName, rs.getLong(colName));
					}
				}
				
				/*row.put("Email", rs.getString("Email"));
				row.put("Password", rs.getString("Password"));
				row.put("Phone", rs.getString("Phone"));
				row.put("Real_Name", rs.getString("Real_Name"));
				row.put("id_card", rs.getString("id_card"));
				row.put("Risk_Evaluation", rs.getString("Risk_Evaluation"));
				row.put("Transaction_Password", rs.getString("Transaction_Password"));*/
				  
				list.add(row);
			}
			rsTable.setDataList(list);
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rsTable;
	}
	
	public List<Map<String,Object>> pagingList(Long pageNo,Long pageSize) {
		long offset = (pageNo -1)*pageSize;
		List<Map<String,Object>> list = new ArrayList<>();
		try {
			java.sql.Connection con = getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "Select * from t_student limit ? ,?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, offset);
			ps.setLong(2, pageSize);
			rs = ps.executeQuery();
			
			ResultSetMetaData getMetaData = rs.getMetaData();
			ArrayList<String> columnList = new ArrayList<>();
			int getColumnCount = getMetaData.getColumnCount();
			for(int i=1;i<=getColumnCount;i++){
				columnList.add(getMetaData.getColumnName(i));
			}
			
			while (rs.next()) {
//				System.out.println(rs.getLong(1)+" | "+rs.getString(2));
				HashMap<String, Object> row = new HashMap<>();
				//id | Real_Name | id_card | Phone | Password | Transaction_Password | Email | Risk_Evaluation | 
				
				for(String colName : columnList){
					try {
						row.put(colName, rs.getString(colName));
					} catch (Exception e) {
						row.put(colName, rs.getLong(colName));
					}
				}
				list.add(row);
			}

			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
	
	
	public List<Map<String,Object>> joinPagingList(Long pageNo,Long pageSize) {
		long offset = (pageNo -1)*pageSize;
		List<Map<String,Object>> list = new ArrayList<>();
		try {
			java.sql.Connection con = getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "SELECT  t_student.name, t_score.score FROM t_student  INNER JOIN t_score  ON t_student.studentId = t_score.studentId WHERE t_student.name = ? limit ?,?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "谢雄辉");
			ps.setLong(2, offset);
			ps.setLong(3, pageSize);
			rs = ps.executeQuery();
			
			ResultSetMetaData getMetaData = rs.getMetaData();
			ArrayList<String> columnList = new ArrayList<>();
			int getColumnCount = getMetaData.getColumnCount();
			for(int i=1;i<=getColumnCount;i++){
				columnList.add(getMetaData.getColumnName(i));
			}
			
			while (rs.next()) {
//				System.out.println(rs.getLong(1)+" | "+rs.getString(2));
				HashMap<String, Object> row = new HashMap<>();
				//id | Real_Name | id_card | Phone | Password | Transaction_Password | Email | Risk_Evaluation | 
				
				for(String colName : columnList){
					try {
						row.put(colName, rs.getString(colName));
					} catch (Exception e) {
						row.put(colName, rs.getLong(colName));
					}
				}
				list.add(row);
			}

			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
	
	
	public static void main(String[] args) {
		List<Map<String, Object>> mapList = new UserDaoImpl().joinPagingList(1L,3L);
		

		for(Map<String, Object> row : mapList){
			//System.out.println(row );
			
			Set<String> keySet = row.keySet();
			for(String k: keySet){
				System.out.print(k+":"+row.get(k)+" |");
			}
			System.out.println("");
		}
		
		
			
		
	}
	
	
	private java.sql.Connection getConnection() {
		try {
			// 先注册驱动com.mysql.jdbc.Driver
			DriverManager.registerDriver(new Driver());
			// 获取
			String url = "jdbc:mysql://160.19.50.221:3306/xxh?useUnicode=true&characterEncoding=utf8";
			java.sql.Connection conn = DriverManager.getConnection(url, "xxh2017", "xxh2017");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
