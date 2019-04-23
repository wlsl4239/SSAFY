package com.ssafy.movie;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index;

	public void add(Movie m) {
		if(m == null || index >= 100) return;
		//if(search(m.getTitle()) != null) return;

		movies[index] = m;
		index ++;
	}

	public Movie[] search() {
		Movie[] temp = new Movie[100];
		for(int i=0;i<index;i++)
			temp[i] = movies[i];
		return temp;

	}

	public Movie[] search(String title) {
		Movie[] temp = new Movie[100];
		int count = 0;
		for(int i=0;i<index;i++)
			if(movies[i].getTitle().contains(title)) {
				temp[count] = movies[i];
				count++;
			}
		return temp;
	}

	public Movie[] searchDirector(String name) {
		Movie[] temp = new Movie[100];
		int count = 0;
		for(int i=0;i<index;i++)
			if(movies[i].getDirector().equals(name)) {
				temp[count] = movies[i];
				count++;
			}
		return temp;

	}

	public Movie[] searchGenre(String genre) {
		Movie[] temp = new Movie[100];
		int count = 0;
		for(int i=0;i<index;i++)
			if(movies[i].getGenre().equals(genre)) {
				temp[count] = movies[i];
				count++;
			}
		return temp;

	}

	public void delete(String title) {
		int count = 0;
		for(int i=0;i<index;i++)
			if(movies[i].getTitle().equals(title)){
				count = i;
				break;
			}

		for(int i=count;i<index-1;i++)
			movies[i] = movies[i+1];
		movies[index] = null;
		index--;
	}

	public int getSize() {
		return index;
	}

}
