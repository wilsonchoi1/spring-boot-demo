package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	public static Map<String, UserInfo> userInfos = new HashMap<String, UserInfo>();
	static {
		UserInfo user1 = UserInfo.createUser(1).setUsername("tmchan").setPassword("pass1").setAddress("address1");
		userInfos.put(user1.getUsername(), user1);
		UserInfo user2 = UserInfo.createUser(1).setUsername("tmchan1").setPassword("pass2").setAddress("address3");
		userInfos.put(user2.getUsername(), user2);
	}
	
	
	@RequestMapping("/user/{username}")
	public UserInfo get(@PathVariable("username") String username) {
        return userInfos.get(username);
    }
	
}
