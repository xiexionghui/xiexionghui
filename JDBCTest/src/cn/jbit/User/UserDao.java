package cn.jbit.User;

import java.util.List;

public interface UserDao {
	
	public List<User> findAll();
	
	public Integer insertUser(User user) ;

}
