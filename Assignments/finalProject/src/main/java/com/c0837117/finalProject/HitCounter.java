package com.c0837117.finalProject;

public class HitCounter {
	private int hitCounter;
	
	public HitCounter() {
		hitCounter = 0;
	}
	
	public void incrementCounter() {
		this.hitCounter++;
	}
	
	public int getHitCount() {
		return this.hitCounter;
	}
}
