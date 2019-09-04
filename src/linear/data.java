package com.genetic.linear;
//import com.genetic.testlinear.*;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


// we will consider only the integer number hence if the number is in other format we will convert that number to
// integer format


class data{
	//data for first equation
	 public static ArrayList<Integer> chromosomesetx=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesety=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetz=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetdummyx=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetdummyy=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetdummyz=new ArrayList<Integer>();
	 //data for second equation
	/* public static ArrayList<Integer> chromosomesetxx=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetyy=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetzz=new ArrayList<Integer>();
	 //data for 3rd equaion
	 public static ArrayList<Integer> chromosomesetxxx=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetyyy=new ArrayList<Integer>();
	 public static ArrayList<Integer> chromosomesetzzz=new ArrayList<Integer>();*/
	 public static ArrayList<String> chromosomeconsolidated=new ArrayList<String>();
	 public static ArrayList<String> chromosomeconsolidatedeq2=new ArrayList<String>();
	 public static ArrayList<String> chromosomeconsolidatedeq3=new ArrayList<String>();
	// this function will return all the chromosome that have been created for x variable
	public static void  chromosomesetxyz(){
		for (int i=start.popstart;i<start.popcount;i++){
			start.maxval=19;
			chromosomesetx.add(ThreadLocalRandom.current().nextInt(0, 20 + 1));
			chromosomesety.add(ThreadLocalRandom.current().nextInt(0, 20 + 1));
			chromosomesetz.add(ThreadLocalRandom.current().nextInt(0, 20 + 1));
			chromosomesetdummyx.add(chromosomesetx.get(i));
			chromosomesetdummyy.add(chromosomesety.get(i));
			chromosomesetdummyz.add(chromosomesetz.get(i));
			/*chromosomesetxx.add(randInt(start.minval,start.maxval));
			chromosomesetyy.add(randInt(start.minval,start.maxval));
			chromosomesetzz.add(randInt(start.minval,start.maxval));
			chromosomesetxxx.add(randInt(start.minval,start.maxval));
			chromosomesetyyy.add(randInt(start.minval,start.maxval));
			chromosomesetzzz.add(randInt(start.minval,start.maxval));*/
		}	    			
	}
	
	
	public static void consolidatechromosome(){
		chromosomeconsolidated.clear();
		chromosomeconsolidatedeq2.clear();
		chromosomeconsolidatedeq3.clear();
		for (int i=start.popstart;i<start.popcount;i++){
			 try{
				 chromosomeconsolidated.add(chromosomesetx.get(i)*start.varconstx+" "+chromosomesety.get(i)*start.varconsty+" "+chromosomesetz.get(i)*start.varconstz);
				 chromosomeconsolidatedeq2.add(chromosomesetx.get(i)*start.varconstxeq2+" "+chromosomesety.get(i)*start.varconstyeq2+" "+chromosomesetz.get(i)*start.varconstzeq2);
				 chromosomeconsolidatedeq3.add(chromosomesetx.get(i)*start.varconstxeq3+" "+chromosomesety.get(i)*start.varconstyeq3+" "+chromosomesetz.get(i)*start.varconstzeq3);
			 }
			 catch (IndexOutOfBoundsException error) {}
		}
		System.out.println(chromosomeconsolidated.size());
	}
	// this function will generate random numbers that will be taken as variables values
	public static int randInt(int min, int max) {
	    // generating chromosome for mutation and crossover 
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
}