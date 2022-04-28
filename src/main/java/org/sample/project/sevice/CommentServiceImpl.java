package org.sample.project.sevice;

import java.util.List;
import org.sample.project.mapper.CommentMapper;
import org.sample.project.model.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentMapper mapper;
	
	@Override
	public List<CommentDTO> allComment(int b_no){
		return mapper.showAllComment(b_no);
	}

	@Override
	public void insertComment(CommentDTO dto) {
		// TODO Auto-generated method stub
		//System.out.println(m_id + ", " + c_content_no + ", " + c_comment);
		mapper.commentInsert(dto);
	}

	@Override
	public void deleteComment(int c_no) {
		// TODO Auto-generated method stub
		mapper.aCommentDelete(c_no);
	}
}
