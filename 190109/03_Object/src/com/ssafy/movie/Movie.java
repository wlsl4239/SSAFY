package com.ssafy.movie;

public class Movie {
	//member data
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;
	
	//constructor
	public Movie() {}
	public Movie(String title, String director, int grade, String genre, String summary) {
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	//method
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getGrade() {
		return grade;
	}
	public String getGenre() {
		return genre;
	}
	public String getSummary() {
		return summary;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	
	public void movieInfo() {
		System.out.println("* 제목 : " + title +"\n* 감독 : "+director+"\n* 등급 : "+grade+"\n* 장르 : "+genre+"\n* 줄거리 : "+summary);
	
	}

}
