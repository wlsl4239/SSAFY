package test.com.ssafy.movie;

import java.util.Scanner;

import com.ssafy.movie.MovieMgr;
import com.ssafy.movie.Movie;

public class MovieTest {
	private Scanner sc;
	private MovieMgr mgr;

	public MovieTest() {
		sc = new Scanner(System.in);
		mgr = new MovieMgr();
		startUI();
	}

	private void startUI() {
		
		while(true) {
			System.out.println("<<< 영화 관리 프로그램 >>>\r\n" + 
					"1. 영화 정보 입력\r\n" + 
					"2. 영화 정보 전체 검색\r\n" + 
					"3. 영화명 검색\r\n" + 
					"4. 영화 장르별 검색\r\n" + 
					"5. 영화 감독별 검색\r\n" + 
					"6. 영화 정보 삭제\r\n" + 
					"0. 종료");
			System.out.print("원하는 번호를 선택하세요 : ");
			
			String menuFlag = sc.nextLine();
			
			switch(menuFlag) {
			case "1":
				addMovie();
				break;
			case "2":
				searchAll();
				break;
			case "3":
				searchByTitle();
				break;
			case "4":
				searchByGenre();
				break;
			case "5":
				searchByDirector();
				break;
			case "6":
				deleteMovie();
				break;
				
			case "0":
				exitUI();					
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}//switch

		}
	}

	private String getInput(String title) {
		System.out.print(title + " : ");
		return sc.nextLine();
	}

	private void addMovie() {
		System.out.println("영화 정보를 입력합니다.");
		char flag = getInput("줄거리를 추가하시겠습니까?(Y/N)").charAt(0);

		switch(flag) {
		case 'y': case 'Y' :
			mgr.add(new Movie(
					getInput("제목을 입력하세요"),
					getInput("감독명을 입력하세요"),
					Integer.parseInt(getInput("평점을 입력하세요")),
					getInput("장르을 입력하세요"),
					getInput("줄거리를 입력하세요")));
			
			System.out.println("입력이 완료되었습니다.");
			break;
			
		case 'n': case 'N' :
			mgr.add(new Movie(
					getInput("제목을 입력하세요"),
					getInput("감독명을 입력하세요"),
					Integer.parseInt(getInput("평점을 입력하세요")),
					getInput("장르을 입력하세요")));
			
			System.out.println("입력이 완료되었습니다.");
			break;
			
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}

	private void searchAll() {
		for(Movie m :mgr.search()) {
			if(m==null)
				break;
			System.out.println(m);
		}
	}

	private void searchByTitle() {
		for(Movie m :mgr.search(getInput("제목을 입력하세요"))) {
			if(m==null) break;
			System.out.println(m);
		}
	}
	
	private void searchByDirector() {
		for(Movie m :mgr.searchDirector(getInput("감독명을 입력하세요"))) {
			if(m==null) break;
			System.out.println(m);
		}
		
	}

	private void searchByGenre() {
		for(Movie m :mgr.searchGenre(getInput("장르을 입력하세요"))) {
			if(m==null)	break;
			System.out.println(m);
		}
	}

	private void deleteMovie() {
		mgr.delete(getInput("제목을 입력하세요"));
	}

	private void exitUI() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

	public static void main(String[] args) {
		new MovieTest();

		System.out.println("정상종료");
	}

}



/*
<<< 영화 관리 프로그램 >>>
1. 영화 정보 입력
2. 영화 정보 전체 검색
3. 영화명 검색
4. 영화 장르별 검색
5. 영화 감독별 검색
6. 영화 정보 삭제
0. 종료

원하는 번호를 선택하세요.
 */
