package edu.dao.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tbj.edu.dao.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class Test {
	
	@Autowired
	private UserMapper userMapper;
	
	@org.junit.Test
	public void tbj1(){
		System.out.println(userMapper.batchSelect(null).size());
	}
	
}
