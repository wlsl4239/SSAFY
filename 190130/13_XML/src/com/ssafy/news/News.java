package com.ssafy.news;

public class News {
	private String title;
	private String desc;
	private String link;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(title);
		return builder.toString();
	}
}
