package com.lyb.springboot.service;

import java.util.List;
import java.util.Map;

import com.lyb.springboot.domain.Notice;

public interface NoticeService {
	public List<Notice> findAll();
	public Long count();
	public Map<String, Object> findByPage(Integer page,Integer rows);
	
}
