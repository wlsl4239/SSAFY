package com.ssafy.customer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

public class UserImpl implements IUser {
	
	private Collection<UserObject> list;
	public UserImpl() {
		list = new ArrayList();
		loading();
	}

	@Override
	public void add(UserObject user) throws NameLengthException, PointValueException {
		// TODO Auto-generated method stub
		list.add(user);
	}

	@Override
	public void loading() {
		try {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
			while(true) {
				UserObject u1 = (UserObject)ois.readObject();
				System.out.println(u1);
				list.add(u1);
			}
		} catch(EOFException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Collection<UserObject> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
			for(UserObject uo : list)
				oos.writeObject(uo);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
