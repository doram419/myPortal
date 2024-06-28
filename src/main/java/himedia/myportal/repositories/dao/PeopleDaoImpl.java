package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.PeopleVo;

@Repository("peopleDao")
public class PeopleDaoImpl implements PeopleDao{
	@Autowired
	private SqlSession session;

	@Override
	public List<PeopleVo> getList() {
		return session.selectList("getList");
	}

	@Override
	public int insert(PeopleVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PeopleVo searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Long no) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
