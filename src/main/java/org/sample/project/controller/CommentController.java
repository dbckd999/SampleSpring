package org.sample.project.controller;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

//import org.apache.ibatis.session.SqlSession;
//import org.sample.project.mapper.CommentMapper;
import org.sample.project.model.CommentDTO;
import org.sample.project.sevice.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController{// extends SqlSessionDaoSupport {
	
	@Autowired
	private CommentService service;

	//	private SqlSession sqlSession;
	
	@RequestMapping(value = "/commentEvent", method = RequestMethod.GET)
	@ResponseBody
	public void commentEvent(@RequestParam("b_no") String b_no) {
		
		List<CommentDTO> list = service.allComment(); 
		//sqlSession.selectList("comment.allComment", dto);
		for(CommentDTO dto : list) {
			System.out.println(dto.toString());
		}
		//return "";
	}
	
}
