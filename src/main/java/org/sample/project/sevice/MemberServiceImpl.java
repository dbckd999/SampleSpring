package org.sample.project.sevice;

import java.util.List;

import org.sample.project.mapper.MemberMapper;
import org.sample.project.model.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//root-context: <context:component-scan base-package="org.sample.project.service"> 참조됨
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private BCryptPasswordEncoder pwEncoder;
	
	@Override
	public void memberInsert(MemberDTO dto) {
		// TODO Auto-generated method stub
		//어디로 보내지
		dto.setM_pw(pwEncoder.encode(dto.getM_pw()));
		memberMapper.memberInsert(dto);
	}

	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return memberMapper.memberList();
	}

	@Override
	public void memberDelete(String m_no) {
		// TODO Auto-generated method stub
		memberMapper.memberDelete(m_no);
	}

	@Override
	public MemberDTO memberRead(String m_no) {
		// TODO Auto-generated method stub
		return memberMapper.memberRead(m_no);
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		// TODO Auto-generated method stub
		memberMapper.memberUpdate(dto);
	}

	@Override
	public String login(MemberDTO dto) {
		// TODO Auto-generated method stub
		String resPW = memberMapper.getRealPassword(dto.getM_id());
		boolean loginFilter = pwEncoder.matches(dto.getM_pw(), resPW);
		if(loginFilter) {
			return "SUCCESS";
		}else {
			return "FAIL";
		}
	}
}
