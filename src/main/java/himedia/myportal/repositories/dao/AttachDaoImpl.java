package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.AttachVo;

@Repository("attachDao")
public class AttachDaoImpl implements AttachDao{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertAttach(AttachVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long selectPk(Long attachNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttachVo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAttaches(Long postNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
