package com.lyf.demo;

import com.github.pagehelper.PageInfo;
import com.lyf.demo.entity.User;
import com.lyf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 永锋 on 2017/10/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("paging")
	public PageInfo<User> paging(@RequestParam("page") int page){
		return userService.paging(page);
	}
}
