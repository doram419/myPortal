package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.PeopleDao;
import himedia.myportal.repositories.vo.PeopleVo;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
	@Autowired
	private PeopleDao peopleDao;
	
	@Override
	public List<PeopleVo> list() {
		return peopleDao.getList();
	}

	@Override
	public Boolean insert(PeopleVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PeopleVo search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Long no) {
		// TODO Auto-generated method stub
		return null;
	}

}
