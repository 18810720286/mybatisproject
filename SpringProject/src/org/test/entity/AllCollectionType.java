package org.test.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollectionType {
	private List<String> list;
	private Map<String,String> map;
	private Set<String> set;
	private String[] array;
	private Properties props;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public String toString() {
		String strContent = null;
		for(String str:this.array) {
			if(strContent == null) {
				strContent = str + ",";
			}else {
				strContent = strContent + str + ",";
			}
		}
		System.out.println(strContent);
		return "list:"+this.list + "\nmap:" + this.map + "\nprops:" + this.props + "\nset:" + this.set +"\narray:" +strContent;
	}
}
