package org.mybatis.entity;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMyBatis {
	public static void main(String[] args) throws IOException {
		//加载MyBatis配置文件(为了访问数据库)
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//创建一个SqlSessionFactory对象
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		String statement = "org.mybatis.entity.Person.queryPersonById";
		Person person = session.selectOne(statement,1);
		System.out.println(person);
		session.close();
	}
}
/**
 * 开发mybatis程序的步骤：
 * 1.配置MyBatis
 * 	conf.xml:配置数据库信息和需要加载的映射文件
 * 	表->类
 * 	写映射文件xxMapper.xml:增删改查标签<selete>
 * 	测试类：session.seleteOne("需要查询的namespace+selete的id值","需要的参数")
 */
