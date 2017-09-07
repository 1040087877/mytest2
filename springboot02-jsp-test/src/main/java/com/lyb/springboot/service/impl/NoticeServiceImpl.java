package com.lyb.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyb.springboot.domain.Notice;
import com.lyb.springboot.mappers.NoticeMapper;
import com.lyb.springboot.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll() {
		// TODO Auto-generated method stub
		return noticeMapper.findAll();
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return noticeMapper.count();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		/** 创建Map集合封装响应数据 */
		Map<String,Object> data = new HashMap<>();
		/** 统计查询 */
		long count = noticeMapper.count();
		data.put("total", count);
		/** 分页查询 */
		List<Notice> notices = noticeMapper.findByPage(page, rows);
		data.put("rows", notices);
		return data;
	}

}
