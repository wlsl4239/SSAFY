package com.ssafy.product;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;


public class ProductMgrImpl implements IProductMgr{
	private Collection<Product> list;

	public ProductMgrImpl() {
		this.list = new ArrayList();
//		loading();
	}
	@Override
	public boolean add(Product p) throws DuplicateException {

		for(Product pd : list) {
			if(pd.getNum().equals(p.getNum()))
				throw new DuplicateException(p.getNum());
		}
		return list.add(p);
	}

	@Override
	public Collection<Product> searchAll() {
		return list;
	}

	@Override
	public Product searchByNum(String num) throws CodeNotFoundException {
		for (Product product : list) 
			if(product.getNum().equals(num))
				return product;

		throw new CodeNotFoundException(num);
	}

	@Override
	public Collection<Product> searchByName(String name) {
		Collection<Product> temp = new ArrayList();

		for (Product product : list) {
			if(product.getName().contains(name))
				temp.add(product);
		}
		return temp;
	}

	@Override
	public Collection<Product> searchTV() {
		Collection<Product> temp = new ArrayList();

		for (Product product : list) {
			if(product instanceof TV)
				temp.add(product);
		}
		return temp;
	}

	@Override
	public Collection<Product> searchRefrigerator() {
		Collection<Product> temp = new ArrayList();

		for (Product product : list) {
			if(product instanceof Refrigerator)
				temp.add(product);
		}
		return temp;
	}

	@Override
	public Collection<Product> searchRefrigeratorByCapacity(int capacity) throws ProductNotFoundException {
		Collection<Product> temp = new ArrayList();

		for (Product product : list) {
			if(product instanceof Refrigerator)
				if(((Refrigerator) product).getCapacity() >= capacity)
					temp.add(product);
		}
		if(temp.isEmpty())
			throw new ProductNotFoundException(Integer.toString(capacity));
		return temp;
	}

	@Override
	public Collection<Product> searchTVByInch(int inch) throws ProductNotFoundException {
		Collection<Product> temp = new ArrayList();

		for (Product product : list) {
			if(product instanceof TV)
				if(((TV) product).getInch() >= inch)
					temp.add(product);
		}
		return temp;
	}

	@Override
	public void setProductPrice(String num, int price) throws CodeNotFoundException{
		searchByNum(num).setPrice(price);
	}

	@Override
	public void deleteProduct(String num) throws CodeNotFoundException{
		list.remove(searchByNum(num));		
	}

	@Override
	public int totalPrice() {
		int totalPrice = 0;
		for (Product product : list) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

	@Override
	public void loading() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.dat"));
			while(true) {
				Product u1 = (Product)ois.readObject();
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
	public void close() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("product.dat"));
			for(Product uo : list)
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
		System.exit(0);
	}

	@Override
	public void send() {
		new Thread() {
			@Override
			public void run() {
				new ProductClient();
			}
		}.start();
	}

	@Override
	public void saveFile() {
		new Thread() {
			@Override
			public void run() {
				ObjectOutputStream oos;
				try {
					oos = new ObjectOutputStream(new FileOutputStream("product.dat"));
					for(Product uo : list)
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
		}.start();
	}

	class ProductClient implements Runnable {
		public ProductClient() {
			run();
		}

		@Override
		public void run() {
			try {
				Socket socket = new Socket("127.0.0.1",8888);
				
				Collection<Product> temp = new ArrayList();
				
				for (Product product : searchTV()) {
						temp.add(product);
				}
				for (Product product : searchRefrigerator()) {
						temp.add(product);
				}
				
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(temp);
				oos.flush();
				oos.close();

			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
