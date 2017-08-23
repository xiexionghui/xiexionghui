package cn.jbit.User;

import java.util.List;
import java.util.Map;

public class RsTable {

	List<String> columnNameList;
	List<Map<String, Object>> dataList;

	public List<String> getColumnNameList() {
		return columnNameList;
	}

	public void setColumnNameList(List<String> columnNameList) {
		this.columnNameList = columnNameList;
	}

	public List<Map<String, Object>> getDataList() {
		return dataList;
	}

	public void setDataList(List<Map<String, Object>> dataList) {
		this.dataList = dataList;
	}

}
