package com.lijixing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lijixing.mapper.MyMapperDao;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private MyMapperDao dao;
}
