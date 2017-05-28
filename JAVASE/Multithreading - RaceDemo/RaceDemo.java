import java.util.*;
import java.lang.*;
import java.io.*;

public class RaceDemo{
	public static void main(String[] args){
		Racer racer = new Racer();
		Thread tortoiseThread = new Thread(racer,"Tortoise");
		Thread rabbitThread = new Thread(racer,"Rabbit");
		tortoiseThread.start();
		rabbitThread.start();
		
	}
}
