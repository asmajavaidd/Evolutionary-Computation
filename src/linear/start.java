package com.genetic.linear;

import java.util.ArrayList;

class start{

	 public static int currentxchrom=0;
	 public static int currentychrom=0;
	 public static int currentzchrom=0;
	 public static String currentchromosome="";
	 public static int genercount=50;
	 public static int popcount=100;
	 public static int fitness=0;
	 public static int maxval=19;
	 public static int minval=0;
	 public static int popstart=0;
	 public static int varconstx=6;
	 public static int varconsty=1;
	 public static int varconstz=1;
	 public static int varconstxeq2=4;
	 public static int varconstyeq2=8;
	 public static int varconstzeq2=3;
	 public static int vara=105;
	 public static int varb=155;
	 public static int varc=165;
	 public static double cper=0.8;	
	 public static int totalvar=3;
	 
	 
	 public static int varconstxeq3=5;
	 public static int varconstyeq3=4;
	 public static int varconstzeq3=10;
	 public static double mutationprob=0.23; 
	 public static double crossoverproba=0.8;
	 public static double accfitness=1;
	 
	  
	 
	 public static void main(String args[]){
		 fitness fn=new fitness();
		/* crossoverprob cs=new crossoverprob();*/
		 data.chromosomesetxyz();
		 for(int qw=1;qw<genercount;qw++)
		 {       
			     System.out.println("Generation ----------------->"+ qw);
			     System.out.println("******************************************************************");
			     
				 data.consolidatechromosome();
				 int sizevar=data.chromosomesetx.size();
		//		 System.out.println("Size of the arrary list is"+sizevar);
				
						 for (int i=popstart;i<popcount;i++){
							 try{
								/* System.out.println("Getting chromo value for vartiable x-->"+data.chromosomesetx.get(i));
								 System.out.println("Getting chromo value for vartiable y-->"+data.chromosomesety.get(i));
								 System.out.println("Getting chromo value for vartiable z-->"+data.chromosomesetz.get(i));*/
								System.out.println("Values of xyz ented by user----->chrmosome "+i+" "+"||x=>"+data.chromosomesetx.get(i)+"||y=>"+data.chromosomesety.get(i)+"||z=>"+data.chromosomesetz.get(i));
								 System.out.println("Consolidated chromosome report eq1-->"+data.chromosomeconsolidated.get(i)+"||eq2-->"+data.chromosomeconsolidatedeq2.get(i)+"||eq3-->"+data.chromosomeconsolidatedeq3.get(i));
/*								 System.out.println("Consolidated chromosome report eq2-->"+data.chromosomeconsolidatedeq2.get(i));
								 System.out.println("Consolidated //chromosome report eq3-->"+data.chromosomeconsolidatedeq3.get(i));*/
							 }
							 catch (IndexOutOfBoundsException error) {}			 
						 }
						 
						 /*System.out.println("Size of the array -->"+data.chromosomesetx.size());
						 System.out.println("Size of the array -->"+data.chromosomesety.size());
						 System.out.println("Size of the array -->"+data.chromosomesetz.size());
						 System.out.println("Size of the array -->"+data.chromosomeconsolidated.size());*/
						
						fn.calfitness();
						fn.showfitval();
				//		//System.out.println("Size of fitness list "+fn.fitnesslist.size());
						roulette.probfitness();
						roulette.calprob();
					    roulette.probcummu(); 
						roulette.maxprob();
						random.createrandom();
						crossover.newgen();
						crossover.parentselec();
						crossover.size();
						mutation.mutationstrat();
		 }
		
	 }
	
}	
	
 