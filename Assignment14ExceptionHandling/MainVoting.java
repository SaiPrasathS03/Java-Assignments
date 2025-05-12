package com.zoho;

public class MainVoting {

	public static void main(String[] args) throws NotEligibleForVotingException {
		int age = 17;
		if(age<18) throw new NotEligibleForVotingException("You are not eligible for voting");
		else System.out.println("You are eligible for voting");
	}

}
