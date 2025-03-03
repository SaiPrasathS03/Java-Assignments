package com.zoho;

import java.util.Arrays;

public class BirdWatcher {
	int[] birdsPerDay;
	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay;
	}
	public void getLastWeek() {
		System.out.println(Arrays.toString(birdsPerDay));
	}
	public void getToday() {
		System.out.println(birdsPerDay[birdsPerDay.length-1]);
	}
	public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length-1]++;
		System.out.println(birdsPerDay[birdsPerDay.length-1]);
	}
	public boolean hasDayWithoutBirds() {
		for(int i=0;i<birdsPerDay.length;i++) {
			if(birdsPerDay[i]==0) return true;
		}
		return false;
	}
	public void getCountForFirstDays(int day) {
		int sum=0;
		for(int i=0;i<day;i++) sum+=birdsPerDay[i];
		System.out.println(sum);
	}
	public void getBusyDays() {
		int count=0;
		for(int i=0;i<birdsPerDay.length;i++) {
			if(birdsPerDay[i]>=5) count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int[] birdsPerDay = {0,2,5,3,7,8,4};
		BirdWatcher bw = new BirdWatcher(birdsPerDay);
		bw.getLastWeek();
		bw.getToday();
		bw.incrementTodaysCount();
		System.out.println(bw.hasDayWithoutBirds());
		bw.getCountForFirstDays(4);
		bw.getBusyDays();
	}
}
