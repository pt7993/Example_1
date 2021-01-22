package com.personal.kakaoLogin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.personal.kakaoLogin.service.KakaoService;

@Controller
public class KakaoController {

	@Autowired
	private KakaoService kakaoService;
	
//	@RequestMapping(value = "/")
//	public String index() {
//		return "home";
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@RequestParam(value = "code", required = false) String code) throws Exception{
		System.out.println("<code> : " + code);
        String access_Token = kakaoService.getAccessToken(code);
        HashMap<String, Object> userInfo = kakaoService.getUserInfo(access_Token);
        System.out.println("<access_Token> : " + access_Token);
        System.out.println("<birthday> : " + userInfo.get("birthday"));
        System.out.println("<nickname> : " + userInfo.get("nickname"));
        System.out.println("<profile_image> : " + userInfo.get("profile_image"));
        return "home";
	}
	
//	@RequestMapping("/login")
//	public String home(@RequestParam(value = "code", required = false) String code) throws Exception{
//	    System.out.println("#########" + code);
//	    return "home";
//	}
	
}
