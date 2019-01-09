package test.com.ssafy.movie;

import com.ssafy.movie.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie("극장판 포켓몬스터 모두의 이야기", "야지마 테츠오", 0, "애니메이션", "함께라면 두려울 것 없는 우리들의 모험이 시작된다!");
//		생성자로 정보를 초기화 한 경우.
		
		
//		Movie m = new Movie();
//		
//		m.setTitle("title");
//		m.setDirector("director");
//		m.setGrade(15);
//		m.setGenre("genre");
//		m.setSummary("summary");
//		생성자에 매개인자를 넘겨주어 초기화 하지 않고 set 함수를 이용해 초기화 한 경우.		
		
		m.movieInfo();
		
	}
}
