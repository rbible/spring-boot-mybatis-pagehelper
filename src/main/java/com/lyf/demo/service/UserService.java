package com.lyf.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.Page;
import com.lyf.demo.entity.User;
import com.lyf.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 永锋 on 2017/10/12.
 */
@Service("userService")
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public PageInfo<User> paging(int page){
		PageHelper.startPage(page, 20);
		Page<User> dbResult = userMapper.paging(null);
		PageInfo<User> result = new PageInfo<>(dbResult);
		return result;
	}
}
