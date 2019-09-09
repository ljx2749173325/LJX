package com.lijixing.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lijixing.service.MyService;
import com.ljx.utils.StringUtils;

@Controller
public class MyController {

	@Resource
	private MyService service;

	@RequestMapping("toAdd.do")
	public String toAdd() {
		return "add";
	}
	@RequestMapping("add.do")
	@ResponseBody
	public Object add(String txt){
		if(StringUtils.isNull(txt)){
			
		}else{
			return false;
		}
		return true;
	}
}
