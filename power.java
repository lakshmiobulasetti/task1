import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   long n,p,r=1;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("enter number");
	  
       n=sc.nextLong();
 
       System.out.println("enter power");
	  
       p=sc.nextLong();
 
       if(n>=0&&p==0)
       {   
          r =1;
       }
       else if(n==0&&p>=1)
	{   
            r=0;
	} 
       else
	{ 
              for(int i=1;i<=p;i++)
	       { 
                   r=r *n;
 	 	}    
  	 }    
 
    	  System.out.println(n+"^"+p+"="+r);
 
    }
 
}
