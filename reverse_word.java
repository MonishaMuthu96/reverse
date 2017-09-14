import java.util.*; 
class reverse_word
{ 
public static void main(String args[]) 
{ 
Scanner ss=new Scanner(System.in); 
String s=ss.nextLine(); 
String[] ch=s.split(" "); 
for(int i=ch.length-1;i>=0;i--) 
{
System.out.print(ch[i]+" "); 
}
}
} 
