package com.genetic.linear;
//import com.genetic.testlinear.*;
import java.util.*;
import java.util.ArrayList;

public class fitness{
	static String[] chromo;
	static String[] chromo2;
	static String[] chromo3;
	static double a1;
	static double b1;
	static double c1;
	static double a2;
	static double b2;
	static double c2;
	static double a3;
	static double b3;
	static double c3;
	double x=9;
	double y=20;
	double z=5;
	int sizlen;
	
	int len;
	
	public static ArrayList<Double> fitnesslist=new ArrayList<Double>();
	public  void calfitness(){
		fitnesslist.clear();
		System.out.println(data.chromosomeconsolidated.size());
		for(int i=start.popstart;i<start.popcount;i++){
			start.currentchromosome=data.chromosomeconsolidated.get(i);
			chromo=data.chromosomeconsolidated.get(i).split(" ");
			chromo2=data.chromosomeconsolidatedeq2.get(i).split(" ");
			chromo3=data.chromosomeconsolidatedeq3.get(i).split(" ");
			int len=chromo.length;
			
			for(int j =0;j<len;j++){
				try{					
					
					if(j==0){a1=Double.parseDouble(chromo[j]);a2=Double.parseDouble(chromo2[j]);a3=Double.parseDouble(chromo3[j]);
					//System.out.println("Value of x1,x2,x3 "+i+" for the first chromosome x-->"+ a1+" "+a2+" "+a3);
					}
					if(j==1){b1=Double.parseDouble(chromo[j]);b2=Double.parseDouble(chromo2[j]);b3=Double.parseDouble(chromo3[j]);/*System.out.println("Value of y1,y2,y3 "+i+" for the first chromosome x-->"+ b1+" "+b2+" "+b3);*/}				
					if(j==2){c1=Double.parseDouble(chromo[j]);c2=Double.parseDouble(chromo2[j]);c3=Double.parseDouble(chromo3[j]);/*System.out.println("Value of z1,z2,z3 "+i+" for the first chromosome x-->"+ c1+" "+c2+" "+c3);*/}
					/*fitnesslist.add(Double.parseDouble(start.varconstx+start.varconsty+start.varconstz));*/
					if(j==2){
						Double result = (a1+a2+a3+b2+b3+c1+c2+c3)-(start.vara+start.varb+start.varc);
						fitnesslist.add(result * result);
						
					}					
				}
				catch (IndexOutOfBoundsException error) {}
				
			}
			
		}		
	}
	
	public void showfitval(){
		sizlen=fitnesslist.size();
		System.out.print("Fitness calculated for the chromosome ");
		for(int k=start.popstart;k<sizlen;k++){
			try{
				
				System.out.print(" "+fitnesslist.get(k)+" ");
			}
			catch (IndexOutOfBoundsException error) {System.out.println("Error occured in loop "+k);}
			
		}
		
	}
	
	
}