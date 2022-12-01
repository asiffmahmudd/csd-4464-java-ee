package com.c0837117.assignment4;

public class PageCounter {
	private int pageCounter;
	
	public PageCounter() {
		pageCounter = 0;
	}
	
	public void incrementCounter() {
		this.pageCounter++;
	}
	
	public int getPageCount() {
		return this.pageCounter;
	}
}
