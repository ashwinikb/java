package com.example.ashwinikb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IsPrimeArray {

	public static void prime(int[] array) {
		int n = array.length;
		Set<Integer> prime = new HashSet<>();
		for (int i = 0; i <= n; i++)  /*change a.length to n*/      
	      {                   
	         int counter=0;           
	         for(int num =i; num>=1; num--)
	         {
	        if(i%num==0)
	        {
	        counter = counter + 1;
	        }
	     }
	     if (counter ==2)
	     {
	        prime.add(num);
	     }  
	      } 
		Iterator<Integer> it = prime.iterator();
		while (it.hasNext()) {
			int ans = it.next();
			System.out.print(ans + " ");
		}

	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 7, 6, 10, 23, 33, 20 };
		IsPrimeArray.prime(array);
	}

}
