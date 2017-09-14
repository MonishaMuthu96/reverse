package net;  
public class Positive { 
public static void main(String[] args) { 	 
int a[]={-4,20,9,3,5}; 
int sum=a[0]+a[1]; 
if(sum<0){ 
sum=sum*-1; 
} 
for(int i=0;i<a.length;i++) 
{ 
for(int j=i+1;j<a.length;j++) 
{ 
int sum1=a[i]+a[j]; 
if( sum1<0){ 
sum1=sum1*-1;  
} 
if(sum>sum1) 
{  
sum=sum1; 
} 
} 
}  		 
System.out.println("Two elements whose sum is closest to zero are :"+sum); 
} 
} 	 
