package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.entity.City;
import com.example.demo.model.service.RepoService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

	private RepoService service;

	@Autowired
	public UserController(RepoService service) {
		this.service = service;
	}

	@GetMapping("/login")
	public String loginform() {
		return "user/loginform";
	}

	@PostMapping("/login")
	public String dologin(@RequestParam String id, @RequestParam String pass, HttpSession session) {
		// 파라미터 받은거 자동형변환 해줌 개꿀
		City result = service.login(id, pass);
		if (result == null) { // 로그인 실패
			return "user/loginform";
		} else {
			// 로그인 성공
			session.setAttribute("loginName", result.getName());
			return "redirect:/";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/join")
	public String join(@RequestParam(required = false) List<String> hobby) {
		log.debug("전달된 취미: {}", hobby);
		return "index";
	}
	
}