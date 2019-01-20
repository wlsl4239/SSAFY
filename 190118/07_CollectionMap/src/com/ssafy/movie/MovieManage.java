package com.ssafy.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MovieManage implements IManage {

	Collection<Movie> list = new HashSet();
	
	@Override
	public boolean add(Object o) {
		return list.add((Movie)o);
	}

	@Override
	public Collection<Object> search() {
		Collection<Object> temp = new ArrayList();
		for(Movie m : list)
			temp.add(m);
		return temp;
	}
	
	public Object searchByTitle(String title) {
		for(Movie m : list)
			if(m.getTitle().equals(title))
				return m;
		return null;
	}	
	
	public Object searchByTime(String time) {
		for(Movie m : list)
			if(m.getTime().equals(time))
				return m;
		return null;
	}
	
	public Collection<Movie> sortedListTitle(String title) {
		ArrayList<Movie> temp = (ArrayList)list;
		Collections.sort(temp, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.getTitle().compareTo(o2.getTitle()) < 0)
					return 1;
				else if(o1.getTitle().compareTo(o2.getTitle()) > 0)
					return -1;
				
				return 0;
			}	
		});
		return temp;
	}	
	
	
	public Collection<Movie> sortedListTime(String time) {
		ArrayList<Movie> temp = (ArrayList)list;
		Collections.sort(temp, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.getTime().compareTo(o2.getTime()) < 0)
					return 1;
				else if(o1.getTime().compareTo(o2.getTime()) > 0)
					return -1;
				return 0;
			}	
		});
		return temp;
	}	
	
	@Override
	public boolean update(Object before, Object after) {
		
		for(Movie m : list) {
			if(m.equals(before)) {
				m = (Movie)after;
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
