package com.ty.shop.TestMappers;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ty.shop.entities.Employee;
import com.ty.shop.mappers.EmployeeMapper;

import tk.mybatis.mapper.mapperhelper.MapperHelper;
/**
* @Description: 测试类
* @ClassName: TestEmp.java
* @version: v1.0.0
* @author: 
* @date: 2018年1月1日 下午4:18:22
 */
public class TestEmp {
	SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	SqlSession session = null;
	{
		InputStream inputStream = TestEmp.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		System.out.println(inputStream);
		session = builder.build(inputStream).openSession();
	}
	@Test
	public void test() {
		System.out.println("session----------"+session);
		//获取通用的Mapper的方法
		//i:创建MapperHelper对象
		MapperHelper mapperHelper = new MapperHelper();
		//ii:通过MapperHelper对象对mybatis原生的configuration对象进行处理
		Configuration configuration = session.getConfiguration();
		//iii:将configuration放进mapperHelper的processConfiguration
		mapperHelper.processConfiguration(configuration);
		//iiii:按照java获取mapper的方式进行获取mapper
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		//iiiii:进行全部员工的查询
		List<Employee> employees = employeeMapper.selectAll();
		System.out.println(employees);
}
	@Test
	public void test01(){
		
	}
}
