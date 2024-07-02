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
		int result = sqlSession.insert("attach.insert", vo);
		System.out.println("AttachDaoImpl::insertAttach(vo) : " + vo);
		System.out.println("AttachDaoImpl::queryResult : " + result);
		return result;
	}

	@Override
	public Long selectPk(Long attachNo) {
		Long pk = sqlSession.selectOne("attach.selectPk", attachNo);
		System.out.println("AttachDaoImpl::selectPk(no) : " + pk);
		return pk;
	}

	@Override
	public List<AttachVo> selectAll() {
		return null;
	}

	@Override
	public int deleteAttaches(Long postNo) {
		return 0;
	}

}
