package himedia.myportal.exceptions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import himedia.myportal.repositories.vo.BoardVo;

public class BoardDaoException extends RuntimeException{
	private static final Logger logger = (Logger)LoggerFactory.getLogger(BoardDaoException.class); 
	private BoardVo boardVo = null;
	
	public BoardDaoException() {
	}
	
	public BoardDaoException(String message) {
		super(message);
		logger.error(message);
	}

	public BoardDaoException(String message, BoardVo vo) {
		super(message);
		boardVo = vo;
	}

	public BoardVo getBoardVo() {
		return boardVo;
	}

	public void setBoardVo(BoardVo boardVo) {
		this.boardVo = boardVo;
	}
}
