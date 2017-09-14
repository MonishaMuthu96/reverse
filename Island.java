import java.util.Scanner; 
public class Island { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 
int [][]a=new int[5][5]; 
int count,sum=0; 
for(int i=0;i<5;i++) 
{ 
for(int j=0;j<5;j++) 
{ 
a[i][j]=sc.nextInt(); 
} 
} 
for(int i=0;i<5;i++) 
{ 
for(int j=0;j<5;j++) 
{ 
if((a[i][j]==1)&&(i!=0)&&(j!=0)) 
{ 
if((a[i][j-1]==1)&&(a[i][j+1]==1)&&(a[i+1][j]==1)&&(a[i-1][j]==1)) 
{ 
count=4; 
sum=sum+count; 
} 
else if((a[i][j-1]==1)&&(a[i][j+1]==1)&&(a[i+1][j]==1)) 
{ 
count=3; 
sum=sum+count; 
} 
else if((a[i][j-1]==1)&&(a[i][j+1]==1)) 
{ 
count=2; 
sum=sum+count; 
} 
else if((a[i][j-1]==1)) 
{ 
count=1; 
sum=sum+count; 
} 
else 
{ 
count=0; 
} 
} 
else if((a[i][j]==1)&&(i==0)) 
{ 
if((a[i][j-1]==1)&&(a[i][j+1]==1)&&(a[i+1][j]==1)) 
{ 
count=3; 
sum=sum+count; 
} 
else if((a[i][j-1]==1)&&(a[i][j+1]==1)) 
{ 
count=2; 
sum=sum+count; 
} 
else if((a[i][j-1]==1)) 
{ 
count=1; 
sum=sum+count; 
} 
else 
{ 
count=0; 
}
} 
else 
{ 
continue; 
}
}
}
System.out.println("The number of island are : "+sum); 
sc.close(); 
}
}
