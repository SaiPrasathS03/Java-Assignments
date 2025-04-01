package com.zoho.player;

public class CDPlayer implements Playable{

	@Override
	public void play() {
		System.out.println("CD Player playing");
	}

	@Override
	public void pause() {
		System.out.println("CD Player paused");
	}

	@Override
	public void stop() {
		System.out.println("CD Player stopping...stopped");
	}
	
	

}
