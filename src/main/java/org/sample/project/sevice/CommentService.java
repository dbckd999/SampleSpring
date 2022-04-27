package org.sample.project.sevice;

import java.util.List;

import org.sample.project.model.CommentDTO;

public interface CommentService {

	public List<CommentDTO> allComment(int b_no);
	public void insertComment(String m_id, String c_content_no, String c_comment);
	public void deleteComment(int c_no);
}