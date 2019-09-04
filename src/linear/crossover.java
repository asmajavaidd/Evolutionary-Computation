package com.genetic.linear;

import java.util.ArrayList;

class crossover{
	public static ArrayList<Integer> parentselection=new ArrayList<Integer>();
	public static ArrayList<Integer> crosspoint=new ArrayList<Integer>();
	public static int noparent;
	
	public static void newgen(){
		data.chromosomesetdummyx.clear();
		data.chromosomesetdummyy.clear();
		data.chromosomesetdummyz.clear();
		//System.out.println("SIZE OF THE RANDOM LISt "+random.randomlist.size());
		//System.out.println("SIZE OF THE probability list "+roulette.probabilitylistcumm.size());

		for(int i=0;i<start.popcount;i++){
			for(int k=0;k<start.popcount;k++){
				if(random.randomlist.get(i)<roulette.probabilitylistcumm.get(k) ){
					//System.out.println("Selected chromosome "+k );
					data.chromosomesetdummyx.add(data.chromosomesetx.get(k));
					//System.out.println("Value of new  chromosome x "+data.chromosomesetdummyx.get(i));
					data.chromosomesetdummyy.add(data.chromosomesety.get(k));
					//System.out.println("Value of new chromosome y "+data.chromosomesetdummyy.get(i));
					data.chromosomesetdummyz.add(data.chromosomesetz.get(k));
					//System.out.println("Value of new chromosome z "+data.chromosomesetdummyz.get(i));
					break;
				}
			}
			
			/*if(random.randomlist.get(i)>roulette.probabilitylistcumm.get(i) && random.randomlist.get(i)>roulette.probabilitylistcumm.get(i+1)){
				data.chromosomesetdummyx.add(data.chromosomesetx.get(i+1));
				data.chromosomesetdummyy.add(data.chromosomesety.get(i+1));
				data.chromosomesetdummyz.add(data.chromosomesetz.get(i+1));
				usedandavaliableslot1(i);
			}
			else if(random.randomlist.get(i)<roulette.probabilitylistcumm.get(i) && random.randomlist.get(i)<roulette.probabilitylistcumm.get(i+1)){}	
		   	//in this case check if first left one is big or not 
			//if yes then take that else check for other left out
			//check from starting
			else if(random.randomlist.get(i)>roulette.probabilitylistcumm.get(i) && random.randomlist.get(i)>roulette.probabilitylistcumm.get(i+1)){}*/
		}
		for(int j=0;j<start.popcount;j++){
			if(j==0){
				//System.out.println("Inside the for loop to retreive the value of chromosome set");
				}
							
			//System.out.println("Value if xyz for chromosome-->"+j+"-->"+data.chromosomesetdummyx.get(j)+" "+data.chromosomesetdummyy.get(j)+" "+data.chromosomesetdummyz.get(j));				
			}
		
	}
	public static void randomnumperccomp(){
		random.randomlist.clear();
		random.createrandom();
	}
	public static void crossoverpointselsction(){
		
		for(int l=start.popstart;l<parentselection.size();l++){
			
			crosspoint.add(data.randInt(start.popstart+1,start.totalvar-1));
		}
		for(int o=start.popstart;o<parentselection.size();o++){
			if(o==0){
				System.out.println("\nSelected crossoverpoint-->");}
			System.out.print(crosspoint.get(o)+"||");
			}
			
		startcrossover();
	}
	
	public static void startcrossover(){
		data.chromosomesetx.clear();
		data.chromosomesety.clear();
		data.chromosomesetz.clear();
		noparent=0;
        int parenrslectiolistsize=parentselection.size();
		//System.out.println("Size of the parent selection is-->"+parentselection.size());
		//System.out.println("Size of the new chromosome list-->"+data.chromosomesetdummyx.size());
        System.out.println("\nSize of x-->"+data.chromosomesetdummyx.size());
		System.out.println("Values in x array before crossover"+data.chromosomesetdummyx);
		System.out.println("Size of y-->"+data.chromosomesetdummyy.size());
		System.out.println("Values in y array before crossover"+data.chromosomesetdummyy);
		System.out.println("Size of z-->"+data.chromosomesetdummyz.size());
		System.out.println("Values in z array before crossover"+data.chromosomesetdummyz);
		
		for(int i=start.popstart;i<data.chromosomesetdummyx.size();i++){
			if(parentselection.contains(i)){
				int getindex=parentselection.indexOf(i);
				if(getindex+1==parenrslectiolistsize){
					if(crosspoint.get(getindex)==1){
						data.chromosomesetx.add(data.chromosomesetdummyx.get(parentselection.get(getindex)));
						data.chromosomesety.add(data.chromosomesetdummyy.get(parentselection.get(0)));
						data.chromosomesetz.add(data.chromosomesetdummyz.get(parentselection.get(0)));
					}
					else if(crosspoint.get(getindex)==2){
						data.chromosomesetx.add(data.chromosomesetdummyx.get(parentselection.get(getindex)));
						data.chromosomesety.add(data.chromosomesetdummyy.get(parentselection.get(getindex)));
						data.chromosomesetz.add(data.chromosomesetdummyz.get(parentselection.get(0)));	
					}
					
						
				}
				else{
					if(crosspoint.get(getindex)==1){
						data.chromosomesetx.add(data.chromosomesetdummyx.get(parentselection.get(getindex)));
						data.chromosomesety.add(data.chromosomesetdummyy.get(parentselection.get(getindex+1)));
						data.chromosomesetz.add(data.chromosomesetdummyz.get(parentselection.get(getindex+1)));
					}
					else if(crosspoint.get(getindex)==2){
						data.chromosomesetx.add(data.chromosomesetdummyx.get(parentselection.get(getindex)));
						data.chromosomesety.add(data.chromosomesetdummyy.get(parentselection.get(getindex)));
						data.chromosomesetz.add(data.chromosomesetdummyz.get(parentselection.get(getindex+1)));	
					}
				}
				
			}
			else{
				data.chromosomesetx.add(data.chromosomesetdummyx.get(i));
				data.chromosomesety.add(data.chromosomesetdummyy.get(i));
				data.chromosomesetz.add(data.chromosomesetdummyz.get(i));				
			}
	}
		
		
		
		
		
	for(int i=start.popstart;i<data.chromosomesetdummyx.size();i++){
			//System.out.println("New chromosome set for new generation is xyz value is -->"+i+"---->"+data.chromosomesetx.get(i)+" "+data.chromosomesety.get(i)+" "+data.chromosomesetz.get(i));
		
	}
	System.out.println("Size of x"+data.chromosomesetdummyx.size());
	System.out.println("Values in x array after cossover"+data.chromosomesetx);
	System.out.println("Size of y-->"+data.chromosomesetdummyx.size());
	System.out.println("Values in y array after cossover"+data.chromosomesety);
	System.out.println("Size of z-->"+data.chromosomesetz.size());
	System.out.println("Values in z array after cossover"+data.chromosomesetz);	
		
	}
	public static void parentselec(){
		randomnumperccomp();
		parentselection.clear();
		 for(int l=start.popstart;l<start.popcount;l++){
			 if(random.randomlist.get(l)<start.cper){
				 //System.out.println("random number value is greater than-->"+);
				 parentselection.add(l);
				 }
			    
			 }
		 //System.out.println("Size of the parent array is "+parentselection.size());
		 for(int p=start.popstart;p<parentselection.size();p++){
			 if(p==0)
			 {
				 System.out.println("Chromosome selected are at position ------------>");
			 }
			 System.out.print(parentselection.get(p)+"||");
			 //System.out.println("`Parent Selected chromosome are  x--->"+data.chromosomesetdummyx.get(parentselection.get(p))+"--y--"+data.chromosomesetdummyy.get(parentselection.get(p))+"--z--"+data.chromosomesetdummyz.get(parentselection.get(p)));
			 }		 
		 crossoverpointselsction();
		 }
	
	public static void size()
	{
		/*System.out.println("Size of the chromosome after crossover  size of x-->"+data.chromosomesetdummyx.size());
		System.out.println("Size of the chromosome after crossover  size of x-->"+data.chromosomesetdummyy.size());
		System.out.println("Size of the chromosome after crossover  size of x-->"+data.chromosomesetdummyz.size());*/
		
	}
	
		 
	}	
	/*public static void usedandavaliableslot1(int num){
		availableslot.add(num);
		ussedslot.add(num+1);
	}
	
}*/