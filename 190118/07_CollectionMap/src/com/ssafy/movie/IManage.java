package com.ssafy.movie;

import java.util.Collection;

public interface IManage {
	boolean add(Object o);
	Collection<Object> search();
	boolean update(Object before, Object after);
	boolean remove(Object o);
}
