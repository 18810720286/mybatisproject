package org.mybatis.entity;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMyBatis {
	public static void main(String[] args) throws IOException {
		//����MyBatis�����ļ�(Ϊ�˷������ݿ�)
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//����һ��SqlSessionFactory����
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		String statement = "org.mybatis.entity.Person.queryPersonById";
		Person person = session.selectOne(statement,1);
		System.out.println(person);
		session.close();
	}
}
/**
 * ����mybatis����Ĳ��裺
 * 1.����MyBatis
 * 	conf.xml:�������ݿ���Ϣ����Ҫ���ص�ӳ���ļ�
 * 	��->��
 * 	дӳ���ļ�xxMapper.xml:��ɾ�Ĳ��ǩ<selete>
 * 	�����ࣺsession.seleteOne("��Ҫ��ѯ��namespace+selete��idֵ","��Ҫ�Ĳ���")
 */
