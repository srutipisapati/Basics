package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
interface Checkevenorodd{
	String evenorodd(long i);
}
public class FunctionalInterfaces_EvenorOdd {
	
public String checkresult(Checkevenorodd d,long i) {
		
		return d.evenorodd(i);
	}

	
	public static void main(String[]args) throws IOException
	{
		 BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
		 
		  long T=Long.parseLong(r.readLine());
		  Checkevenorodd c= (i)->
		  {if(i%2==0) 
			  return "EVEN"; 
		  else return "ODD";
		  };
			
			System.out.println(new FunctionalInterfaces_EvenorOdd().checkresult(c, T));
		  }

		  
		
	
	
}
