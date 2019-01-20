package com.ssafy.movie;

public class Reservation {
	private MovieManage movieMgr = new MovieManage();
	private MemberManage memberMgr = new MemberManage();
	
	
	public boolean reserve(Member member, Movie movie) {
		Member tempMember = new Member(member.getNum(),member.getName());
		Movie tempMovie = new Movie(movie.getTitle(),movie.getTime());
		
		return (movie.getList().add(tempMember) && 
				member.getList().add(tempMovie) &&
				movieMgr.add(tempMovie) && 
				memberMgr.add(tempMember));
	}


	public MovieManage getMovieMgr() {
		return movieMgr;
	}


	public void setMovieMgr(MovieManage movieMgr) {
		this.movieMgr = movieMgr;
	}


	public MemberManage getMemberMgr() {
		return memberMgr;
	}


	public void setMemberMgr(MemberManage memberMgr) {
		this.memberMgr = memberMgr;
	}
	
	
	
}
