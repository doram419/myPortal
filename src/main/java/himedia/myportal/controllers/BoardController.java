package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.repositories.vo.BoardVo;
import himedia.myportal.services.BoardService;

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
	
	//
	@GetMapping("/{no}")
	public String view(@PathVariable("no") Long no,
			Model model) {
		System.out.println("BoardController::view() - no:" + no);
		BoardVo boardVo = boardService.getContent(no);
		System.out.println("BoardController::view() - vo:" + boardVo);
		model.addAttribute("vo", boardVo);
		
		return "/board/view";
	}
}
