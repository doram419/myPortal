package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exceptions.BoardDaoException;
import himedia.myportal.repositories.vo.BoardVo;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BoardVo> selectAll() {
		List<BoardVo> list = sqlSession.selectList("board.selectAll");
		
		return list;
	}

	@Override
	public int insert(BoardVo boardVo) {
		try {
			int insertCount = sqlSession.insert("board.insert", boardVo);
			return insertCount;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BoardDaoException("게시물 입력 중 예외 발생!!", boardVo);
		}
	}

	@Override
	public BoardVo getContent(Long no) {
		BoardVo boardVo = sqlSession.selectOne("board.getContent", no);

		return boardVo;
	}

	@Override
	public int update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int increaseHitCount(Long no) {
		return sqlSession.update("board.increaseHitCount", no);
	}
}
