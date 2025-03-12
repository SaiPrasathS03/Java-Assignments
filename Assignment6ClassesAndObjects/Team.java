package com.zoho;

public class Team {
	public String teamName;
	public String city;
	public String division;
	
	
	
	public Team(String teamName, String city, String division) {
		this.teamName = teamName;
		this.city = city;
		this.division = division;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String name) {
		this.teamName = teamName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	public void playGame() {
		System.out.println(teamName+"is playing");
	}
	public void hireCoach() {
		System.out.println("Coach is hired for the team "+teamName);
	}
	
}
