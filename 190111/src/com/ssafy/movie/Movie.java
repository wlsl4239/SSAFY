package com.ssafy.movie;

public class Movie {

	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;

	Movie(){}
	public Movie(String title, String director, int grade, String genre, String summary) {
		setTitle(title);
		setDirector(director);
		setGrade(grade);
		setGenre(genre);
		setSummary(summary);
	}
	public Movie(String title, String director, int grade, String genre) {
		this(title, director, grade, genre, "");
	}

	private void setTitle(String title) {
		this.title = title;
	}
	private void setDirector(String director) {
		this.director = director;
	}
	private void setGrade(int grade) {
		this.grade = grade;
	}
	private void setGenre(String genre) {
		this.genre = genre;
	}	
	private void setSummary(String summary) {
		this.summary = summary;
	}


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


	@Override
	public String toString() {
		return "제목 : " + title + ", 감독 : " + director + ", 평점 : " + grade + ", 장르 : " + genre
				+ ", 줄거리 : " + summary;
	};

}
