package cn.jbit.User;

import java.util.List;

public class UserController {

	static UserService userService = new UserServiceImpl();
	public static void main(String[] args) {
		
		User user = new User();
		user.setEmail("123123123@qq.com");
		user.setId(11L);
		user.setIdCard("441622199001011234");
		user.setPassword("123123");
		user.setPhone("13312341234");
		user.setRealName("谢雄辉");
		user.setRiskEvaluation("等级1");
		user.setTransactionPassword("123123");
		Integer num = userService.insertUser(user );
		System.out.println("插入数量:"+num);
		
		
		List<User> list = userService.findAll();
		for(User tmp: list){
			System.out.println(tmp.getId()+" | "+tmp.getPhone());
		}
	}
}
