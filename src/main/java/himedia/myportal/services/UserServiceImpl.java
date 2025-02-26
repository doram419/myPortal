package himedia.myportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.UserDao;
import himedia.myportal.repositories.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean join(UserVo vo) {
		return 1 == userDao.insert(vo);
	}

	@Override
	public UserVo getUser(String email) {
		UserVo vo = userDao.selectUser(email);
		return vo;
	}

	@Override
	public UserVo getUser(String email, String password) {
		UserVo userVo = userDao.selectUser(email, password);
		
		return userVo;
	}

}
