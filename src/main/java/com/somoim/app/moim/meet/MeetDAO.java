package com.somoim.app.moim.meet;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.somoim.app.member.MemberDTO;


@Repository
public class MeetDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.somoim.app.moim.meet.MeetDAO.";
	
	//list
	public List<MeetDTO> getList(MeetDTO meetDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE+"getList", meetDTO);
	}
	
	//add
		//정모 개설
	public int add(MeetDTO meetDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", meetDTO);
	}
		//정모이미지 저장
	public int fileAdd(MeetFileDTO meetFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"fileAdd", meetFileDTO);
	}
	
	
}
