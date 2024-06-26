package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.BoardDao;
import himedia.myportal.repositories.vo.BoardVo;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao; 
	
	@Override
	public List<BoardVo> getList() {
		return boardDao.selectAll();
	}

	@Override
	public BoardVo getContent(Long no) {
		boardDao.increaseHitCount(no);
		return boardDao.getContent(no);
	}

	@Override
	public boolean write(BoardVo boardVo) {
		return 1 == boardDao.insert(boardVo);
	}

	@Override
	public boolean update(BoardVo boardVo) {
		return 1 == boardDao.update(boardVo);
	}

	@Override
	public boolean delete(Long no, Long userNo) {
		return 1 == boardDao.delete(no, userNo);
	}

}
