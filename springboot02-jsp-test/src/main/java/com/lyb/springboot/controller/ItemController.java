package com.lyb.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyb.springboot.domain.Notice;
import com.lyb.springboot.service.NoticeService;

@Controller
public class ItemController {
	@Autowired
	private NoticeService noticeService;
	@GetMapping("item")
	public String item(Model model){
		model.addAttribute("itemArr",	new String[]{"iphone7手机","华为手机","小米手机"});
		return "item";
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@GetMapping("show")
	public String show(){
//		return "/WEB-INF/html/notice.jsp";
		System.out.println("测试");
		return "/html/notice.html";
	}
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPages(Integer page,
			Integer rows){
		System.out.println("=============");
		System.out.println((page-1)*rows);
		System.out.println(rows);
		return noticeService.findByPage((page-1)*rows, rows);
	}
}
