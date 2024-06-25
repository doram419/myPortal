package himedia.myportal.repositories.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.UserVo;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(UserVo vo) {
		
		return 1;
	}

	@Override
	public UserVo selectUser(String email) {
		return null;
	}

	@Override
	public UserVo selectUser(String email, String password) {
		return null;
	}

}
