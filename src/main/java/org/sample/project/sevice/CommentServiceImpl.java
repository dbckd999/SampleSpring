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
	
	public List<CommentDTO> allComment(){
		return mapper.showAllComment();
	}
	
}
