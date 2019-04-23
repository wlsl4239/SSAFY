package com.ssafy;

public class UserManager {
	private static boolean userFlag;
	public static UserService getUserService() {
		if(userFlag) {
			userFlag = false;
			return new UserB();
		}
		else {
			userFlag = true;
			return new UserA();
		}
	}
}
