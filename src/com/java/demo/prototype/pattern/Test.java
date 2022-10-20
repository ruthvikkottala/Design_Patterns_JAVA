package com.java.demo.prototype.pattern;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs1 = new BookShop();
		bs1.setShopName("Test1");
		bs1.loadData();
		
		
		
		BookShop bs2 = bs1.clone();
		bs2.setShopName("Test2");
		bs1.getBooks().remove(0);
		System.out.println(bs1);
		System.out.println(bs2);
		

	}

}
