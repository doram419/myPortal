package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.repositories.vo.BoardVo;
import himedia.myportal.repositories.vo.UserVo;
import himedia.myportal.services.BoardService;
import jakarta.servlet.http.HttpSession;

// 게시판은 사용자 기반 서비스
//	- 목록은 로그인 상관 없이 접속 가능
//	- 게시물 조회/작성/수정 등은 로그인 해야 사용 가능하도록 한다
@RequestMapping("/board")
@Controller("boardController")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 게시판 목록 가져오기
	@GetMapping({"", "/", "/list"})
	public String list(Model model) {
		List<BoardVo> list = boardService.getList();
		model.addAttribute("list", list);
		
		return "/board/list";
	}
	
	// 게시글 조회
	@GetMapping("/{no}")
	public String view(@PathVariable("no") Long no,
			Model model,
			HttpSession httpSession) {
		UserVo authUser = null;
		
		if(httpSession.getAttribute("authUser") instanceof UserVo) {
			authUser = (UserVo)httpSession.getAttribute("authUser");
			
			BoardVo boardVo = boardService.getContent(no);
			model.addAttribute("vo", boardVo);
			
			return "/board/view";
		} else {
			return "redirect:/users/login";
		}
	}
	
	// 작성 폼
	@GetMapping("/write")
	public String write(HttpSession httpSession) {
		UserVo authUser = null;
		
		if(httpSession.getAttribute("authUser") instanceof UserVo) {
			authUser = (UserVo)httpSession.getAttribute("authUser");
			
			return "/board/write";
		} else {
			return "redirect:/users/login";
		}
	}
	
	// 작성 액션
	@PostMapping("/write")
	public String writeAction(
			@ModelAttribute BoardVo boardVo,
			HttpSession httpSession) {
		UserVo authUser = null;
		
		if(httpSession.getAttribute("authUser") instanceof UserVo) {
			authUser = (UserVo)httpSession.getAttribute("authUser");
			boardVo.setUserNo(authUser.getNo());
			boardService.write(boardVo);
			
			return "redirect:/board/list";
		} else {
			return "redirect:/users/login";
		}
	}
}
