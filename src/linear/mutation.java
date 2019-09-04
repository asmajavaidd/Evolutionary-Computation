package com.genetic.linear;

import java.util.ArrayList;

class mutation{
	public static ArrayList<Integer> mutationrandom=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatxlist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatylist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatzlist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatztotallist=new ArrayList<Integer>();
	public static ArrayList<Integer> listval=new ArrayList<Integer>();
	public static ArrayList<Integer> newlistval=new ArrayList<Integer>();
	public static ArrayList<Integer> newreplacelistval=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatxdatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatydatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatzdatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatxsamelist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatdummyxdatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatdummyydatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatdummyzdatalist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatysamelist=new ArrayList<Integer>();
	public static ArrayList<Integer> mutatzsamelist=new ArrayList<Integer>();
	public static int xlistcount=0;
	public static int ylistcount=1;
	public static int zlistcount=1;
	public static int summutate=0;
	public static int randval=0;
	public static int valx;
	public static int valy;
	public static int valz;
	public static int valxintval;
	public static int valyintval;
	public static int valzintval;
	public static double mutationrate;
	public static int tlengen;
	public static int mutvalpass=0;
	public static int mutval;
	public static int minum;
	public static int mindummy;
	public static int minum1;
	public static int dif1;
	public static int dif2;
	public static int dif3;
	public static int minum2;
	public static int minum3;
	public static int mimsortedn;
	
	public static void mutationstrat(){
		//double mutationrate;
		tlengen=0;
		mutationrate=0.0;
		mutval=0;
		tlengen=start.popcount*start.totalvar;
		//System.out.println("Value of mut tlengen-->"+ tlengen);
		mutationrate=tlengen*start.mutationprob;		
		System.out.println("Value of mutationrate val-->"+ mutationrate);
		mutval=(int)(mutationrate);
	    System.out.println("Mutation Rate-->"+ mutval);
		// creating random integer between 1 to mutval
	   
	    for(int i=start.popstart;i<mutval;i++){	    	
	    	mutationrandom.add(data.randInt(start.popstart, mutval));
	    }
	    System.out.println("Random value generated "+mutationrandom.size());
	    System.out.println("Random value generated "+mutationrandom);
	    for(int g=start.popstart;g<mutationrandom.size();g++){
	    	if(g==0){
	    		newreplacelistval.add(mutationrandom.get(g));
	    	}
	    	else{
	    		if(newreplacelistval.contains(mutationrandom.get(g))){}
		    	else{newreplacelistval.add(mutationrandom.get(g));}
	    	}
	    	
	    }
	    
	    /*System.out.println("NewSize of the array newreplacelistval is(Filtered array list singlet values)  "+newreplacelistval.size());
	    System.out.println("Value of the filtered array newreplacelistval  "+newreplacelistval);  */
	    System.out.println("Value of the filtered array newreplacelistval  "+newreplacelistval); 
	    summutate=0;
	    mimsortedn=0;
	    minum=0;
	    minum1=0;
	    minum2=0;
	    minum3=0;
	    dif1=0;
	    dif2=0;
	    dif3=0;
	    for(int j=start.popstart;j<newreplacelistval.size();j++){summutate=summutate+newreplacelistval.get(j);}
        System.out.println("Sum of the values of the new array is "+ summutate);
	  /* if(start.genercount==0){
		   minum1=Math.max(roulette.minx,roulette.miny);
		   minum2=Math.max(roulette.miny,roulette.minz);
		   minum3=Math.max(roulette.minx,roulette.minz);
		   dif1=start.vara+start.varb+start.varc-minum1; 
		   dif2=start.vara+start.varb+start.varc-minum2;
		   dif3=start.vara+start.varb+start.varc-minum3;
		   if(dif1<=dif2 && dif1<=dif3){minum=minum1;}
		   else if(dif2<=dif1 && dif2<=dif3){minum=minum2;}
		   else if(dif3<=dif1 && dif3<=dif2){minum=minum3;}
		   else{minum=start.vara+start.varb+start.varc;}
		   mindummy=minum;
		   
		   System.out.println("Value of minum"+ minum);  
	   }*/
       
	   	    
	   	    
	    while(xlistcount<newreplacelistval.size())
	    {
	    	randval=data.randInt(start.popstart+1,summutate);
	    	
	    	if(xlistcount==0)
	    	{
	    		
	    		while(randval<20){
	    			listval.add(randval);
	    			xlistcount++;
	    			randval=data.randInt(start.popstart+1,summutate);
	    			break;
	    		}
	    	}
	    	else
	    	{
	    		
		    		if(listval.contains(randval))
		    		{	    			
		    		}
		    		else
		    		{
		    			
		    			while(randval<20 && randval > 0){
			    			listval.add(randval);
			    			xlistcount++;
			    			randval=data.randInt(start.popstart+1,summutate);
			    			break;
		    			}
		    		}
	    	}		
	    			
	    }
	    		
	    	
	    System.out.println("Eligible random values for mutation "+listval);
	    	
	/*    System.out.println("value of xlistcount "+ xlistcount);
	    System.out.println("Size of the list where variable is created "+ listval.size());
	    System.out.println("Values in the listval variable after creating random variables "+ listval);
	    System.out.println("Size of chromosome x chromosomesetx"+ data.chromosomesetx);
	    System.out.println("Size of chromosome x chromosomesetx"+ data.chromosomesety);
	    System.out.println("Size of chromosome x chromosomesetx"+ data.chromosomesetz);*/
	    data.chromosomesetdummyx.clear();
		data.chromosomesetdummyy.clear();
		data.chromosomesetdummyz.clear();
		
		
		for(int j=0;j<data.chromosomesetx.size();j++){
	    	if(newreplacelistval.contains(data.chromosomesetx.get(j))){
	    		data.chromosomesetdummyx.add(listval.get(newreplacelistval.indexOf(data.chromosomesetx.get(j))));
	    	}
	    		else{
	    			data.chromosomesetdummyx.add(data.chromosomesetx.get(j));	
	    	}
	    }
		
		for(int j=0;j<data.chromosomesety.size();j++){
	    	if(newreplacelistval.contains(data.chromosomesety.get(j))){
	    		data.chromosomesetdummyy.add(listval.get(newreplacelistval.indexOf(data.chromosomesety.get(j))));
	    	}
	    		else{
	    			data.chromosomesetdummyy.add(data.chromosomesety.get(j));	
	    	}
	    }
		
		

		for(int j=0;j<data.chromosomesetz.size();j++){
	    	if(newreplacelistval.contains(data.chromosomesetz.get(j))){
	    		data.chromosomesetdummyz.add(listval.get(newreplacelistval.indexOf(data.chromosomesetz.get(j))));
	    	}
	    		else{
	    			data.chromosomesetdummyz.add(data.chromosomesetz.get(j));	
	    	}
	    }

		
		
	    
		System.out.println("Size of given x after mutation ------>"+data.chromosomesetdummyx.size());
		System.out.println("Value of x after mutation ------>"+data.chromosomesetdummyx);
	    
		System.out.println("Size of given y after mutation ------>"+data.chromosomesetdummyy.size());
		System.out.println("value of genes (Y)after mutation ------>"+data.chromosomesetdummyy);
		
	
		System.out.println("Size of given z  after mutation"+data.chromosomesetdummyz.size());
		System.out.println("Value in chromosome z after mutation ------>"+data.chromosomesetdummyz);

	    	
	    	
		data.chromosomesetx.clear();
		data.chromosomesety.clear();
		data.chromosomesetz.clear();
		for(int i=start.popstart;i<data.chromosomesetdummyy.size();i++){
			data.chromosomesetx.add(data.chromosomesetdummyx.get(i));
			data.chromosomesety.add(data.chromosomesetdummyy.get(i));
			data.chromosomesetz.add(data.chromosomesetdummyz.get(i));
		}
		System.out.println("Size "+data.chromosomesetx.size());
		System.out.println("value in list x after index is ------>"+data.chromosomesetx);
		System.out.println("value in list y after index is ------>"+data.chromosomesety);
		System.out.println("Size "+data.chromosomesetz.size());
		System.out.println("value in list z index is ------>"+data.chromosomesetz);

	}
	
	
	
}	
