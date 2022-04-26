package org.sample.project.sevice;

import java.util.List;

import org.sample.project.model.MemberDTO;

public interface MemberService {

	void memberInsert(MemberDTO dto);
	List<MemberDTO> memberList();
	void memberDelete(String m_no);
	MemberDTO memberRead(String m_no);
	public void memberUpdate(MemberDTO dto);
	String login(MemberDTO dto);
}
