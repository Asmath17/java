/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[20];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        b[a[i]]++;
	    }
	        for(i=0;i<n;i++){
	            if(b[i]>=1){
	            
	            System.out.println(i);
	        }
	    }
		
	}
}
