package org.zl.entity;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlsession.openSession();
		String statement = "org.zl.entity.Student.queryStudentByStuNo";
		Student student = session.selectOne(statement,1);
		System.out.println(student);
		session.close();
		/**
		 * 	Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlsession.openSession();
			String statement = "org.zl.entity.Student.queryStudentByStuNo";
			Student student = session.selectOne(statement,1);
			System.out.println(student);
			session.close();
		 */
	}
}
