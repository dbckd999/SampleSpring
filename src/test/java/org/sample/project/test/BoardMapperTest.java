package org.sample.project.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.project.mapper.BoardMapper;
import org.sample.project.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
	//@Test
	public void BoardInsertTest() {
		BoardDTO dto = new BoardDTO();
		dto.setB_title("testTitle");
		dto.setB_content("testContent");
		dto.setB_writer("ppp");
		boardMapper.boardInsert(dto);
	}
	
	//@Test
	public void BoardListTest() {
		List<BoardDTO> list = boardMapper.showAllBoard();
		for(BoardDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	//@Test
	public void aBoardTest() {
		BoardDTO dto = boardMapper.aContent("1");
		log.info(dto);
	}
	
	//@Test
	public void aContentUpdateTest() {
		BoardDTO dto = new BoardDTO();
		dto.setB_no(1);
		dto.setB_title("modify");
		dto.setB_content("mod_content");
		boardMapper.aContentUpdate(dto);
	}
	
	@Test
	public void aContentDelete() {
		boardMapper.aContentDelete("1");
	}
}