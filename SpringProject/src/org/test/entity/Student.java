package org.test.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.factory.CourseFactory;
import org.test.newinstance.HtmlCourse;
import org.test.newinstance.Icourse;
import org.test.newinstance.JavaCourse;

public class Student {
	private int stuNo;
	private String stuName;
	private int stuAge;

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.stuName + this.stuAge + this.stuNo;
	}

	public void learn(String name) {
//		从自己编写的简单工厂中获取对象
//		Icourse icourse = (Icourse)CourseFactory.getCourse(name);
		
//		从Ioc超级工厂中拿对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Icourse icourse = (Icourse)context.getBean(name);
		icourse.learn();
	}
	
	public void learnJava() {
		Icourse course = new JavaCourse();
		course.learn();
	}

	public void learnHtml() {
		Icourse course = new HtmlCourse();
		course.learn();
	}
}
