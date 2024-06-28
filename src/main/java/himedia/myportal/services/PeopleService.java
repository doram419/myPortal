package himedia.myportal.services;

import java.util.List;

import himedia.myportal.repositories.vo.PeopleVo;

public interface PeopleService {
	public List<PeopleVo> list();
	public Boolean insert(PeopleVo vo);
	public PeopleVo search(String name);
	public Boolean delete(Long no);
}
