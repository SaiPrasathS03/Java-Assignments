package com.zoho.player;

public class StreamingPlayer implements Playable{

	@Override
	public void play() {
		System.out.println("Streaming Player playing");
	}

	@Override
	public void pause() {
		System.out.println("Streaming Player paused");
	}

	@Override
	public void stop() {
		System.out.println("Streaming Player stopping...stopped");
	}

}
