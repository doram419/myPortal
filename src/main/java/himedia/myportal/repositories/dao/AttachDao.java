package himedia.myportal.repositories.dao;

import java.util.List;

import himedia.myportal.repositories.vo.AttachVo;

public interface AttachDao {
	public int insertAttach(AttachVo vo, Long postNo);
	public List<AttachVo> getAttaches();
	public int deleteAttaches(Long postNo);
}
