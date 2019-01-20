package com.ssafy.movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class MemberManage implements IManage {
	
	Collection<Member> list = new HashSet();
	
	@Override
	public boolean add(Object o) {
		return list.add((Member)o);
	}

	@Override
	public Collection<Object> search() {
		Collection<Object> temp = new ArrayList();
		for(Member m : list)
			temp.add(m);
		return temp;
	}
	
	public Object searchByName(String name) {
		Collection<Object> temp = new ArrayList();
		for(Member m : list)
			if(m.getName().equals(name))
				temp.add(m);
		return temp;
	}	
	
	public Object searchByNum(String num) {
		for(Member m : list)
			if(m.getNum().equals(num))
				return m;
		return null;
	}
	
	@Override
	public boolean update(Object before, Object after) {
		
		for(Member m : list) {
			if(m.equals(before)) {
				m = (Member)after;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean remove(Object o) {
		return list.remove(o);
	}

}
