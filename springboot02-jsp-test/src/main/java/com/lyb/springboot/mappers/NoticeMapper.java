package com.lyb.springboot.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lyb.springboot.domain.Notice;
@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	public List<Notice> findAll();
	public Long count();
	public List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
	
}
