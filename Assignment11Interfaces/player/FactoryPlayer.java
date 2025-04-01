package com.zoho.player;

public class FactoryPlayer {

	public static Playable createPlayer(String str) {
		if(str.equals("cdPlayer")) return new CDPlayer();
		else if(str.equals("mp3Player")) return new Mp3Player();
		else if(str.equals("streamingPlayer")) return new StreamingPlayer();
		return null;
		
	}
}
