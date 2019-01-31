package com.ssafy.project;

public interface ICustomerMgr {
	void getCustomerFromXML(String num) throws CustomerNotFoundException;
	void saveJson() ;
	void sendToServer(String num) throws CustomerNotFoundException;
}
