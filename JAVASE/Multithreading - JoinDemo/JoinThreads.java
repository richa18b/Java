import java.util.*;
import java.lang.*;
import java.io.*;

public class JoinThreads implements Runnable{
	public void run(){
		System.out.println(System.nanoTime()+" Current thread: "+Thread.currentThread().getName()+" is at the beginning");
		
		if(Thread.currentThread().getName().equals("First Thread")){
			try{
				System.out.println(System.nanoTIme()+" inside the join condition");
				JoinDemo.secondThread.start();
				JoinDemo.secondThread.join();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
