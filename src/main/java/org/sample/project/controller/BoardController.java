package org.sample.project.controller;

import java.util.List;

import org.sample.project.mapper.BoardMapper;
import org.sample.project.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	BoardMapper mapper;
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		//보드 전체 반환
		List<BoardDTO> list = mapper.showAllBoard();
		model.addAttribute("list", list);
		return "/board/boardList";
	}
	
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "/board/boardInsert";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsertProcess(BoardDTO dto) {
		System.out.println(dto);
		mapper.boardInsert(dto);
		return "redirect:/boardList";
	}
	
	@GetMapping("/aContentRead")
	public String aBoardDetail(@RequestParam("b_no") String b_no, Model model) {
		BoardDTO dto = mapper.aContent(b_no);
		model.addAttribute("dto", dto);
		return "/board/aBoardDetail";
	}
	
	@PostMapping("/ContentUpdate")
	public String ContnetUpdateCtrl(BoardDTO dto) {
		mapper.aContentUpdate(dto);
		return "redirect:/aContentRead?b_no=" + dto.getB_no();
	}
	
	@GetMapping("/aContentDelete")
	public String ContentDelete(@RequestParam("b_no") String b_no) {
		mapper.aContentDelete(b_no);
		return "redirect:/boardList";
	}
	
}
