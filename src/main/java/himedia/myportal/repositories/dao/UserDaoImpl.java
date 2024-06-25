package himedia.myportal.repositories.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exceptions.UserDaoException;
import himedia.myportal.repositories.vo.UserVo;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(UserVo vo) {
		try {
			return sqlSession.insert("users.insert", vo);
		} catch (Exception e) {
			throw new UserDaoException("회원 가입 중 에러!", vo);
		}
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
