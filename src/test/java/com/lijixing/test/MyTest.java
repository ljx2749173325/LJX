package com.lijixing.test;

import org.junit.Test;

import com.ljx.utils.StringUtils;

public class MyTest {

	/**
	 * 测试是否是合法手机号
	 */
	@Test
	public void isPhone(){
		String ph1="12012345678";
		boolean phone1 = StringUtils.isPhone(ph1);
		System.out.println("是否是合法的手机号："+phone1);
		String ph2="13612345678";
		boolean phone2 = StringUtils.isPhone(ph2);
		System.out.println("是否是合法的手机号："+phone2);
	}
	
	/**
	 * 测试是否是邮箱
	 */
	@Test
	public void isEmail(){
		String em1="12qq.com";
		boolean falg1 = StringUtils.isEmail(em1);
		System.out.println("是否是合法的邮箱"+falg1);
		
		String em2="123456@qq.com";
		boolean falg2 = StringUtils.isEmail(em2);
		System.out.println("是否是合法的邮箱"+falg2);
	}
}
