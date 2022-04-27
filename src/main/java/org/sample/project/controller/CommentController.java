package org.sample.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.sample.project.model.CommentDTO;
import org.sample.project.sevice.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController{
	
	@Autowired
	private CommentService service;

	
	@RequestMapping(value = "/commentEvent", method = RequestMethod.GET)
	@ResponseBody
	public List<CommentDTO> commentEvent(@RequestParam("b_no") String b_no) {
		List<CommentDTO> list = service.allComment(Integer.parseInt(b_no));
		return list;
	}
	
	@RequestMapping(value = "/addCommentEvent", method = RequestMethod.POST)
	@ResponseBody
	public boolean addCommentEvent(HttpServletRequest request) {
		String m_id = request.getParameter("m_id");
		String c_content_no = request.getParameter("c_content_no");
		String c_comment = request.getParameter("c_comment");
		
		service.insertComment(m_id, c_content_no, c_comment);
		
		return true;
	}
	
	@RequestMapping(value = "/deleteCommentEvent", method = RequestMethod.POST)
	@ResponseBody
	public boolean deleteCommentEvent(HttpServletRequest request) {
		String c_no = request.getParameter("c_no");
		service.deleteComment(Integer.parseInt(c_no));
		return false;
	}
	
}
