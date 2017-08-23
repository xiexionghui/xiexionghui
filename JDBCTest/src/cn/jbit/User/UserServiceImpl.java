package cn.jbit.User;

import java.util.List;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}


	@Override
	public Integer insertUser(User user) {
		return userDao.insertUser(user);
	}

}
