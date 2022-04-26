package org.sample.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sample.project.model.MemberDTO;
import org.sample.project.sevice.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberInsert")
	public String memberInsert() {
		return "member/memberInsert";
	}
	
	@PostMapping("/memberInsert")
	public String memberInsertProcess(MemberDTO dto) {
		
		System.out.println("회원가입: " + dto);
		memberService.memberInsert(dto);
		
		return "redirect:/";
	}
	
	@GetMapping("/memberList")
	public String memberList(Model model) {
		List<MemberDTO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/memberList";
	}
	
	@GetMapping("/memberDelete")
	public String memberDelete(@RequestParam("m_no") String m_no) {
		memberService.memberDelete(m_no);
		
		return "redirect:/memberList";
	}
	
	@GetMapping("/memberRead")
	public String memberRead(@RequestParam("m_no") String m_no, Model model) {
		MemberDTO dto = memberService.memberRead(m_no);
		model.addAttribute("dto", dto);
		return "member/aMemberRead";
	}
	
	@PostMapping("/memberUpdate")
	public String memberUpdateProcess(MemberDTO dto) {
		memberService.memberUpdate(dto);
		return "redirect:/memberRead?m_no="+dto.getM_no();
	}
	
	@PostMapping("/login")
	public String memberLogin(MemberDTO dto, HttpServletRequest request, RedirectAttributes rttr) {
		String result = memberService.login(dto);
		if(result.equals("SUCCESS")) {
			HttpSession session = request.getSession();
			session.setAttribute("m_id", dto.getM_id());
			return "redirect:/";
		}else {
			rttr.addFlashAttribute("msg", false);
			return "redirect:/";
		}
	}
	
	@GetMapping("/logout")
	public String memberLogout(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:/";
	}
	
}
