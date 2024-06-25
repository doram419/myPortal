package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.repositories.vo.UserVo;

@RequestMapping("/users")
@Controller
public class UsersController {
	
	// 가입 폼
	@GetMapping({"/", "/join"})
	public String join() {
		return "users/joinform";
	}
	
	// 가입 처리(액션)
	@PostMapping("join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("회원 가입 폼 : " + userVo);
		
		return "users/joinsuccess";
	}
}
