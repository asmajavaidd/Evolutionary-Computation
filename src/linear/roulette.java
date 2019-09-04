package com.genetic.linear;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.text.DecimalFormat;
class roulette{
	public static int sizefitness;
	public static ArrayList<Double> probabilitylist=new ArrayList<Double>();
	public static ArrayList<Double> probabilitylistcumm=new ArrayList<Double>();
	public static double sumfitness=0.0;
	public static int fittchrom1=0;
	public static int minx;
	public static int miny;
	public static int minz;
	public static ArrayList<Double> fitnesslistprob=new ArrayList<Double>();
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	public static void probfitness(){
		sumfitness=0.00;
	sizefitness=fitness.fitnesslist.size();
	for(int j=0;j<sizefitness;j++){
		
		sumfitness=fitness.fitnesslist.get(j)+(sumfitness);
		//fitnesslistprob.add(sumfitness);
				 
		}
	//System.out.println("Sum of the fitness is "+sumfitness);
		
	}
	
	
	public static void calprob(){
		probabilitylist.clear();
		//System.out.println("Size of list is "+fitnesslistprob.size());
		for(int k=0;k<start.popcount;k++){

			
			/*DecimalFormat numberFormat = new DecimalFormat("#.#####");
			Double pro=Double.parseDouble(numberFormat.format(BigDecimal.valueOf(fitness.fitnesslist.get(k)/sumfitness));*/
			//probabilitylist.add(Double.parseDouble(pro));
			//String  formatted= String.format("%.10f", a/c);
			probabilitylist.add((fitness.fitnesslist.get(k)/sumfitness));
		}
		/*for(int l=0;l<start.popcount;l++){
			try{System.out.println("Prob of selection for chrom "+l+" is "+probabilitylist.get(l));}
			catch (IndexOutOfBoundsException error) {}
			
			
		}*/
		
	}
	
	public static void probcummu(){
		probabilitylistcumm.clear();
   	 for(int l=0;l<probabilitylist.size();l++){
   		 if(l==0){probabilitylistcumm.add(probabilitylist.get(l));}
   		 else{probabilitylistcumm.add(probabilitylistcumm.get(l-1)+probabilitylist.get(l));}
				}
   	 for(int l=0;l<start.popcount;l++){
   		try{
   			//System.out.println("Cummulative Prob of selection for chrom "+l+" is "+probabilitylistcumm.get(l));
   			}
   		
		catch (IndexOutOfBoundsException error) {}
   	 }
	
	} 
	public static void maxprob(){
    	 double maxprob=probabilitylist.get(0);
    	 fittchrom1=0;
    	 minx=0;
     	miny=0;
     	minz=0;
    	 for(int l=0;l<start.popcount;l++){
 			if (maxprob>probabilitylist.get(l)){
 				maxprob=probabilitylist.get(l);
 				fittchrom1=l;
 				}			
 		}
    	System.out.println("\nMaximum probabillity of selection is "+maxprob);
 	   	System.out.println("For chromosome--->"+fittchrom1);
 	   	System.out.println("having fitness value-->"+fitness.fitnesslist.get(fittchrom1));
    	System.out.println("Chromosome--->x="+data.chromosomesetx.get(fittchrom1)+" y="+data.chromosomesety.get(fittchrom1)+" z="+data.chromosomesetz.get(fittchrom1));
    	minx=data.chromosomesetx.get(fittchrom1);
    	miny=data.chromosomesety.get(fittchrom1);
    	minz=data.chromosomesetz.get(fittchrom1);
	
	}
    

}

