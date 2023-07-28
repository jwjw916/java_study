package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.CityDto;
import com.example.demo.model.entity.City;
import com.example.demo.model.repo.CityRepo;
import com.example.demo.model.service.RepoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/city") // 이 컨트롤러의 request prefix
@Slf4j
public class CityController {
	
	RepoService service;
	
	@Autowired
	public CityController(RepoService service) {
		this.service = service;
	}
	
	@RequestMapping("/select")
	public String selectCity(@RequestParam long no, Model model) {
		City city = service.selectCity(no);
		model.addAttribute("city", city);
		return "city/cityinfo";	
	}
	
	
	@RequestMapping("/select2")
	public String selectCity2(@RequestParam long no, Model model) {
		City city = service.selectCity(no);
		model.addAttribute("city", city);
		return "redirect:/"; // root로 가라 (여기서는 root가 index.jsp일뿐)	
	}

	@GetMapping("/regist")
	public String getForm() {
		return "city/cityregist";
	}
	
	
	@PostMapping("/regist") //new CityDto(), 파라미터의 이름을 이용해서 setter 호출
	public String registCity(@ModelAttribute CityDto dto, Model model) {
		log.debug("파라미터 city 확인:{}", dto);
		CityDto registed = service.registCity(dto);
		if(registed==null) {
			// 실패 메시지 전달 - 다시 그 페이지
			model.addAttribute("msg", "자료 저장 실패");
			return "city/cityregist";
		}else {
//			return "redirect:/";
			return "redirect:/city/list";
		}
	
	}
	@GetMapping("/list")
	public String list(Model model) {
		List<CityDto> cities = service.list();
		model.addAttribute("city",cities);
		return "city/list";
	}
	
}
