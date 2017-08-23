package cn.jbit.User;

import java.util.List;

public interface UserService {
	
	public List<User> findAll();

	public Integer insertUser(User user) ;
}
