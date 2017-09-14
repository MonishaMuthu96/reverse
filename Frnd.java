import java.util.ArrayList; 
public class Frnd 
{static ArrayList<frnd> ls=new ArrayList(); 
int i; 
String string; 
public frnd(int i, String string)  
{ 
this.i=i; 
this.string=string; 
} 
public frnd() 
{ 
} 
private void add(frnd h)  
{ 
ls.add(h); 
} 
private static void printFrinde(int no) 
{ 
int count=0; 
for(frnd h:ls) 
{ 	 
int k=h.i-no; 
if(count<3&&k<4&&k>-4&&k!=0) 
{ 
System.out.println("Person number:"+h.i+" name of friend:"+h.string); 
count++; 
} 
} 
} 
public static void main(String[] args)  
{ 
frnd h=new frnd(); 
frnd h1=new frnd(1,"guvi1"); 
frnd h2=new frnd(2,"guvi2"); 
frnd h3=new frnd(3,"guvi3"); 
frnd h4=new frnd(4,"guvi4"); 
frnd h5=new frnd(5,"guvi5"); 
frnd h6=new frnd(6,"guvi6"); 
frnd h7=new frnd(7,"guvi7"); 
h.add(h1); 
h.add(h2); 
h.add(h3); 
h.add(h4); 
h.add(h5); 
h.add(h6); 
h.add(h7); 
printFrinde(3); 
} 
} 
