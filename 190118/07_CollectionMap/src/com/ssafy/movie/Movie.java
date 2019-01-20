package com.ssafy.movie;

import java.util.ArrayList;
import java.util.Collection;

public class Movie {
	private String title;
	private String time;
	private Collection<Member> list;		//이 영화를 예매한 회원
	
	public Movie(String title, String time) {
		super();
		setTitle(title);
		setTime(time);
		list = new ArrayList<>();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Collection<Member> getList() {
		return list;
	}

	public void setList(Collection<Member> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("영화 제목 : ");
		builder.append(title);
		builder.append(", 상영 시각 : ");
		builder.append(time);
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
