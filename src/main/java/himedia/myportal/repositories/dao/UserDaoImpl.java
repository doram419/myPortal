package himedia.myportal.repositories.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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
			if(e instanceof SQLException) {
				throw new UserDaoException("회원 가입 중 에러! : SQLException", vo);
			}
			else {
				throw new UserDaoException("회원 가입 중 에러!", vo);
			}
		}
	}

	@Override
	public UserVo selectUser(String email) {
		return null;
	}
	
	// 로그인
	@Override
	public UserVo selectUser(String email, String password) {
		try {
			// myBatis parameterType="map"으로 전달하기
			Map<String, String> userMap = new HashMap<>();
			userMap.put("email", email);
			userMap.put("password", password);
			
			UserVo userVo = 
					sqlSession.selectOne("users.selectUserByEmailAndPassword", userMap);
			
			return userVo;
		} catch (Exception e) {
			if(e instanceof SQLException) {
				throw new UserDaoException("로그인 중 에러! : SQLException");
			}
			else {
				throw new UserDaoException("로그인 중 에러!");
			}
		}
	}
}
