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
		return boardDao.getContent(no);
	}

	@Override
	public boolean write(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
