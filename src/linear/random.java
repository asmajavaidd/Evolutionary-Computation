package com.genetic.linear;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class random{
	public static ArrayList<Double> randomlist=new ArrayList<Double>();
	public static int min=0;
	public static int max=1;
	public static void createrandom(){
		Random r = new Random();
		for(int i=start.popstart;i<start.popcount;i++){
			int randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
			double randomValue = min + (max - min) * r.nextDouble();
			//double randomValue = (double)randomNum;
			randomlist.add(randomValue);
			//System.out.println("Rndom number generated is --->"+randomlist.get(i));			
		}
		//System.out.println("Size of the list is-->"+ randomlist.size());
		/*randomlist.clear();
		System.out.println("Size of the list after list clear is-->"+ randomlist.size());*/
	}
}