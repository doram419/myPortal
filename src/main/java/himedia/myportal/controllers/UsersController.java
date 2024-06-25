package himedia.myportal.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import himedia.myportal.repositories.vo.UserVo;
import himedia.myportal.services.UserService;
import jakarta.servlet.http.HttpSession;

@RequestMapping("/users")
@Controller
public class UsersController {
	@Autowired
	private UserService userService;
	
	// 가입 폼
	@GetMapping({"/", "/join"})
	public String join() {
		return "users/joinform";
	}
	
	// 가입 처리(액션)
	@PostMapping("join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("회원 가입 폼 : " + userVo);
		
		boolean success = userService.join(userVo);
		
		if(success) { // 가입 성공
			// 가입 성공 페이지로 리다이렉트
			System.out.println("Log:UserContoller, Msg:회원 가입 성공");
			return "redirect:/users/joinsuccess";
		}
		else {
			// 다시 가입 폼으로 
			System.out.println("Log:UserContoller, Msg:회원 가입 실패");
			return "redirect:/users/join";
		}
	}
	
	@GetMapping("/joinsuccess")
	public String joinSuccess() {
		return "users/joinsuccess";
	}
	
	// 로그인 폼 페이지
	@GetMapping("/login")
	public String login() {
		return "users/loginform";
	}
	
	// 로그인
	@PostMapping("/login")
	public String login(
			@RequestParam(value="email", required = false, defaultValue="") String email,
			@RequestParam(value="password", required = false,  defaultValue="") String password,
			HttpSession session) {
		if(0 == email.length() || 0 == password.length()) {
			System.out.println("이메일 혹은 패스워드가 입력되지 않았습니다.");
			System.out.println("login tried: email("+ email +"), password(" + password + ")");
			return "redirect:/users/login";
		} 
		
		// email과 password 이용, 사용자 정보 질의
		UserVo authUser = userService.getUser(email, password);
		
		if(authUser != null) {
			// 로그인 처리
			session.setAttribute("authUser", authUser);
			// 홈페이지로 이동
			System.out.println("로그인 성공!");
			return "redirect:/";
		} else {
			System.out.println("login tried: email("+ email +"), password(" + password + ")");
			System.out.println("이메일 혹은 패스워드가 일치하지 않거나, 가입된 계정이 없습니다");
			return "redirect:/users/login";
		}
	}
	
	// 로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		System.out.println("로그아웃 됨!");
		session.removeAttribute("authUser");
		session.invalidate();
		
		return "redirect:/";
	}
	
	// 중복 이메일 체크 (API) -> 응답을 json으로 돌려줘야함
	@ResponseBody	// -> MessageConverter 사용
	@RequestMapping("/checkEmail")
	public Object checkEmail(
			@RequestParam(value="email", required=true, defaultValue="") String email) {
		UserVo vo = userService.getUser(email); 
		
		boolean exists = vo!= null ? true : false;
		
		Map<String, Object> json = new HashMap<>();
		json.put("result", "success");
		json.put("exists", exists);
		
		return json;
	}
}
