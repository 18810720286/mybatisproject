package org.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.entity.AllCollectionType;
import org.test.entity.Course;
import org.test.entity.Student;
import org.test.factory.CourseFactory;
import org.test.newinstance.Icourse;

public class Test {
	
	public static void springIoc() {
//		Student student = new Student();
//		student.setStuName("zs");
//		student.setStuAge(20);
//		student.setStuNo(1);
//		System.out.println(student);
		
//		spring上下文对象
		ApplicationContext contxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)contxt.getBean("student");
		System.out.println(student);
//		1.new
//		2.
	}
	
	public static void learnCourse() {
//		这种方式的创建对象十分分散，造成后期维护困难
//		改进方式1.创建简单工厂，将对象的创建代码进行集中
		Student student = new Student();
		student.learnHtml();
		student.learnJava();
	}
	
	public static void learnCourseWithFactory() {
//		改进方式1.创建简单工厂，将对象的创建代码进行集中,方便后期维护
//		虽然简单工厂集中了代码，但是代码仍然比较分散，不彻底，依然可以改进
		Student student = new Student();
		student.learn("java");
	}
	
	public static void learnCourseWithIoc() {
//		改进方式2.创建IOC，配置bean而后拿对象
//		该方法本质上只是对new进行了替换，并未真实的用到ioc的技术
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		student.learn("javaCourse");
		
	}

	public static void testDI() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course = (Course)context.getBean("course");
		course.showInfo();
		
	}
	
	public static void allCollectionDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllCollectionType ss = (AllCollectionType)context.getBean("collectionDemo");
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
//		learnCourse();
//		learnCourseWithFactory();
//		learnCourseWithIoc();
//		springIoc();
		testDI();
//		allCollectionDemo();
	}
}
