package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeRecursive {
	
	public static void main(String[] args) throws IOException
	{
		  BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
		  int T=Integer.parseInt(r.readLine());
		if(new PrimeRecursive().isPrime(T,2))
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
		
		 
	}
	public boolean isPrime(int num, int i)
	{if(num<=2)
		return false;
	else if (num%i == 0)
		return false;
		else if(i*i>num)
		return true;
		else return isPrime(num,i+1);
	}
	
}
