import java.util.*;
import java.lang.*;
import java.io.*;

class Racer implements Runnable{
	public static String winner;
	public void race(){
		for(int distance=1;distance<=100;++distance){
			System.out.println("Distance covered by "+Thread.currentThread().getName()+" is "+distance+" metres.");
			if((distance == 30) && (Thread.currentThread().getName().equals("Rabbit"))){
				try{
					System.out.println(Thread.currentThread().getName()+" is sleeping.....zzzzzZZZZZ");
					Thread.sleep(1000*10);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			boolean isRaceWon = this.isRaceWon(distance);
			if(isRaceWon) break;
		}
	}
	
	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon = false;
		if((Racer.winner == null) && (totalDistanceCovered == 100)){
			Racer.winner = Thread.currentThread().getName();
			System.out.println("Winner is: "+Racer.winner);
			isRaceWon = true;
		}
		else if(Racer.winner == null) isRaceWon = false;
		else if(Racer.winner != null) isRaceWon = true;
		
		return isRaceWon;
	}
	
	public void run(){
		this.race();
	}
	
}
	
