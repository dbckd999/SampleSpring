package org.sample.project.mapper;

import java.util.List;
import org.sample.project.model.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberList();
	public void memberDelete(String m_no);
	public MemberDTO memberRead(String m_no);
	public void memberUpdate(MemberDTO dto);
	public MemberDTO login(MemberDTO dto);
	public String getRealPassword(String m_id);
}
