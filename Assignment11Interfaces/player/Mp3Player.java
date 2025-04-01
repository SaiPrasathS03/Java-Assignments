package com.zoho.player;

public class Mp3Player implements Playable{

	@Override
	public void play() {
		System.out.println("MP3 Player playing");
	}

	@Override
	public void pause() {
		System.out.println("MP3 Player paused");
	}

	@Override
	public void stop() {
		System.out.println("MP3 Player stopping...stopped");
	}

}
