package org.sample.project.mapper;

import java.util.List;	

import org.apache.ibatis.annotations.Mapper;
import org.sample.project.model.CommentDTO;

@Mapper
public interface CommentMapper {
	public void commentInsert(CommentDTO dto);
	public List<CommentDTO> showAllComment(int b_no);
	public void aCommentUpdate(CommentDTO dto);
	public void aCommentDelete(int c_no);
}
