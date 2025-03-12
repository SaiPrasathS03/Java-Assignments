package com.zoho;

public class Player {

	public String playerName;
	public String position;
	public int jerseyNumber;
	public Player(String playerName, String position, int jerseyNumber) {
		this.playerName = playerName;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
	}
	public String getName() {
		return playerName;
	}
	public void setName(String name) {
		this.playerName = playerName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public void playGame() {
		System.out.println(playerName+" "+position+" "+jerseyNumber+" is playing");
	}
	
	public void train() {
		System.out.println(playerName+" "+position+" "+jerseyNumber+" is training");
	}
}
