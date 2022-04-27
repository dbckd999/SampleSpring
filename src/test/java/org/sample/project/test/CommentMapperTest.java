package org.sample.project.test;

import java.util.List;	

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.project.mapper.CommentMapper;
import org.sample.project.model.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CommentMapperTest {
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Test
	public void BoardListTest() {
		List<CommentDTO> list = commentMapper.showAllComment(0);
		for(CommentDTO dto : list) {
			log.info(dto);
		}
	}
	
}