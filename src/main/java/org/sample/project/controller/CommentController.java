package org.sample.project.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.sample.project.model.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController extends SqlSessionDaoSupport {
	@Autowired
	public CommentController(SqlSessionFactory factory) {
		this.setSqlSessionFactory(factory);
	}
	
	public List<CommentDTO> commentList(String c_content_no) {
		List<CommentDTO> list = getSqlSession().selectList("Comment", c_content_no);
		return list;
	}
}
