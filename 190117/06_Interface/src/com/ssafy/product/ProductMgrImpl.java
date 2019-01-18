package com.ssafy.product;

import java.util.ArrayList;
import java.util.Collection;

public class ProductMgrImpl implements IProductMgr{
	private Collection<Product> list;
	
	public ProductMgrImpl() {
		this.list = new ArrayList();
	}
	@Override
	public boolean add(Product p) {
		return list.add(p);
	}

	@Override
	public Collection<Product> searchAll() {
		return list;
	}

	@Override
	public Product searchByNum(String num) {
		for (Product product : list) 
			if(product.getNum().equals(num))
				return product;
		
		return null;
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
	public Collection<Product> searchRefrigeratorByCapacity(int num) {
		Collection<Product> temp = new ArrayList();
		
		for (Product product : list) {
			if(product instanceof Refrigerator)
				if(((Refrigerator) product).getCapacity() >= num)
					temp.add(product);
		}
		return temp;
	}

	@Override
	public Collection<Product> searchTVByInch(int inch) {
		Collection<Product> temp = new ArrayList();
		
		for (Product product : list) {
			if(product instanceof TV)
				if(((TV) product).getInch() >= inch)
				temp.add(product);
		}
		return temp;
	}

	@Override
	public void setProductPrice(String num, int price) {
		searchByNum(num).setPrice(price);		
	}

	@Override
	public void deleteProduct(String num) {
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
}
