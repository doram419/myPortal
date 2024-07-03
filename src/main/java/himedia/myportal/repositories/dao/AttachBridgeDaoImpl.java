package himedia.myportal.repositories.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("attachBridgeDao")
public class AttachBridgeDaoImpl implements AttachBridgeDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(Long postNo, Long attachNo) {
		Map<String, Long> bridgeMap = new HashMap<String, Long>();
		bridgeMap.put("postNo", postNo);
		bridgeMap.put("attachNo", attachNo);
		
		int insertResult = sqlSession.insert("attachBridge.insert", bridgeMap);
		
		return insertResult;
	}

	@Override
	public int delete(Long postNo) {
		return 0;
	}

}
