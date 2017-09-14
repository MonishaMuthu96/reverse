import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Star 
 { 
public static void main (String[] args) throws java.lang.Exception 
{
Scanner sc=new Scanner(System.in); 
int n=sc.nextInt(); 
for(int i=n*2;i>0;i-=2) 
{
for(int j=0;j<=i;j++) 
{ 
if(j==n) 
System.out.print(" "); 
else 
System.out.print("*"); 
} 
n--; 
System.out.println(""); 
}
}
}