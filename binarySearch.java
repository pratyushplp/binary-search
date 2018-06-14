package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class binarySearch implements binaryFace {
	private int mid,start,end;
	private ArrayList<Integer> list= new ArrayList<>();
	private Random r = new Random(); 
	
		

public binarySearch()
	{
		this.start=0;
		this.end=99;
		
	}

	public int getMid()
	{
		mid=(start+end)/2;
		return(mid);
	}
	
	 public void getValue() {
		 
		for(int i = 0; i<100;i++)
		{	
			 
			list.add(r.nextInt(100));
			
		} 
		 	 
	 }
	 
	 public void sort()
	 {
	        Collections.sort(list);
 
	 }
	 
	 
	
	 public void search(int value) 
	 {
		 //NOTE IF-ELSE USE GARYO BHANE CHALDAINA BECAUSE OF THE MEACHANISM OF ELSE IF (EUTA STATEMENT RIGHT BHO BHANE ARU STATEMENT HERDAINA)
		 while(true)
		 {
			 mid=getMid();

		 if(value==list.get(mid))
		 {	
			 System.out.println("the value is in "+mid+"index" );
			 break;
		 }
		 
		 if(value>=list.get(mid))
		 {
			 start=mid+1;
			 
		 }
		
		 if(value<=list.get(mid))
		 {
			 end=mid-1;
		 }
		 
		 if(start>end)
		 {	
			 System.out.println("the value is not in the list");
			 break;

		 }
		 
		 }
		 
		 
	 }

	


	
}
