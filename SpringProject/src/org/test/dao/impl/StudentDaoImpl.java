package org.test.dao.impl;

import org.springframework.stereotype.Repository;
import org.test.dao.IStudentDao;
import org.test.entity.Student;

//@Component("studentDao")
@Repository("studentDao")
/**
 * @Component("studentDao")/@Repository("studentDao")相当于下面的语句
 * <bean id="studentDao" class="org.test.dao.StudentDaoImpl">
 * @author ASUS
 *
 */
public class StudentDaoImpl implements IStudentDao{
	public void addStudent(Student student) {
		System.out.println("增加学生。。。");
	}
}
/**
 * @component细化：
 * dao层注解：@repository
 * service层注解：@Service
 * 控制器层注解：@Controller
 */
