package com.lyf.demo.mapper;

import com.lyf.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

import java.util.Map;

/**
 * Created by 永锋 on 2017/10/12.
 */
public interface UserMapper{

	User find(@Param("id") int id);

	void insert(User user);

	Page<User> paging(Map<String, Object> params);
}
