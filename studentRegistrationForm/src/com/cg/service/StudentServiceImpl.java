package com.cg.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.bean.RegisterBean;


public class StudentServiceImpl implements StudentService {

	
	public boolean isValid(String percent) {

		Pattern ptrn=Pattern.compile("[1-100]");
		Matcher match=ptrn.matcher(percent);
		if(match.matches())
			return true;
		else
			return false;	
	}

	
	

}
