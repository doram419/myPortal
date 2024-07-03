package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import himedia.myportal.repositories.vo.AttachVo;

@Repository("attachDao")
public class AttachDaoImpl implements AttachDao{	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertAttach(AttachVo vo) {	
		System.out.println(vo);
		int result = sqlSession.insert("attach.insert", vo);
		
		return result;
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
