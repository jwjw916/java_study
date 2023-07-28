package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.service.RepoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	RepoService service;

	@Autowired
	public HomeController(RepoService service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// /hello?name=hong
	@RequestMapping("/hello")
	public String hello(@RequestParam String name, Model model) { // 1.파라미터 처리
		log.debug("hello의 파라미터: {}", name);
		// 2. 모델 연결
		String msg = service.helloService(name);
		// 화면에 전달할값 저장
		// model 영역 - request scope
		model.addAttribute("msg", msg);
		// 3. forward로 페이지 전환: return 되는 페이지에 forward로 호출
		return "hello";
		// redirect: 를 붙이면 된다 - container root가 아닌 context root이다

	}
	
	@RequestMapping(value="/onlypost", method = RequestMethod.POST)
	public String onlyPost() {
		return "/";
	}

}
