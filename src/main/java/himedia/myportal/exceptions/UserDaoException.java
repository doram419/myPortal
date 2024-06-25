package himedia.myportal.exceptions;

import himedia.myportal.repositories.vo.UserVo;

public class UserDaoException extends RuntimeException{
	private UserVo userVo = null;
	
	// Constructor
	public UserDaoException() {
	}
	
	public UserDaoException(String message) {
		super(message);
	}
	
	public UserDaoException(String message, UserVo userVo) {
		super(message);
		this.userVo = userVo;
	}

	// Getter / Setter
	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}
}
