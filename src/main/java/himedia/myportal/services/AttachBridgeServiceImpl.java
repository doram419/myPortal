package himedia.myportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.AttachBridgeDao;

@Service("attachBridgeService")
public class AttachBridgeServiceImpl implements AttachBridgeService{
	@Autowired
	private AttachBridgeDao attachBridgeDao;
	
	@Override
	public boolean insert(Long postNo, Long attachNo) {
		return 1 == attachBridgeDao.insert(postNo, attachNo);
	}

	@Override
	public boolean delete(Long postNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
