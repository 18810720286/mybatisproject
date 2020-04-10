package org.test.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.IStudentDao;
import org.test.dao.impl.StudentDaoImpl;
import org.test.entity.Student;
import org.test.service.IStudentService;

public class StudentServiceImpl implements IStudentService{

	IStudentDao studentDao = new StudentDaoImpl();

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

 
//	在需要称为事务的方法前增加@Transactional注解
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED)
	@Override
	public void addStudent(Student student) {
//		判断学生是否存在
//		添加
		studentDao.addStudent(student);
		
	}
	
}
