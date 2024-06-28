package himedia.myportal.repositories.dao;

import java.util.List;

import himedia.myportal.repositories.vo.PeopleVo;

public interface PeopleDao {
	public List<PeopleVo> getList();
	public int insert(PeopleVo vo);
	public PeopleVo searchByName(String name);
	public int delete(Long no);
}
