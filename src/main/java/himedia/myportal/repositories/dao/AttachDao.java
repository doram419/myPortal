package himedia.myportal.repositories.dao;

import java.util.List;

import himedia.myportal.repositories.vo.AttachVo;

public interface AttachDao {
	public int insertAttach(AttachVo vo);
	public Long selectPk(Long attachNo);
	public List<AttachVo> selectAll();
	public int deleteAttaches(Long postNo);
}
