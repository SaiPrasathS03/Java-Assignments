package com.zoho.player;

import java.util.Scanner;

public class MainPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		
		while(loop) {
			System.out.println("Select the Player: ");
			System.out.println("1. CD Player\n2. MP3 Player\n3. Streaming Player");
			int playerChoice = sc.nextInt();
			Playable player = null;
			switch(playerChoice) {
			case 1:
				player = FactoryPlayer.createPlayer("cdPlayer");
				selectOp(player);
				break;
			case 2:
				player = FactoryPlayer.createPlayer("mp3Player");
				selectOp(player);
				
				break;
			case 3:
				player = FactoryPlayer.createPlayer("streamingPlayer");
				selectOp(player);
				break;
			default:
				System.out.println("Enter the correct option\n");
			}
			
		}
		
	}

	private static void selectOp(Playable player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the operation:\n1.Play\n2.Pause\n3.Stop");
		int opChoice = sc.nextInt();
		
		switch(opChoice) {
		case 1:
			player.play();
			break;
		case 2:
			player.pause();
			break;
		case 3:
			player.stop();
			break;
		default:
			System.out.println("Enter the correct option");
		}
		
	}

}
