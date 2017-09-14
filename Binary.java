#import java.util.*; 
class Binary{ 
private static void ZigZag(BinaryTree root) 
int leftToRight=1; 
BinaryTree=temp; 
stack<BinaryTree>currentLevel=new Stack<BinaryTree>(); 
stack<BinaryTree>nextLevel=new Stack<BinaryTree>(); 
System.out.println("Zig Zag Traversal"); 
currentLevel.push(root); 
while(!currentLevel.isEmpty()){ 
temp=currentlevel.pop(); 
if(temp!=null) 
{ 
System.out.println(temp.getData()); 
if(leftToRight==1) 
{ 
if(temp.getLeft()!=null) 
nextLevel.push(temp.getleft()); 
if(temp.getRight()!=null) 
nextLevel.push(temp.getLeft()); 
} 
else 
{ 
if(temp.getRight()!=null) 
nextLevel.push(temp.getRight()); 
if(temp.getLeft()!=null) 
nextLevel.push(temp.getLeft()); 
} 
if(currentLevel.isEmpty()) 
{ 
leftToRight=1-leftToRight; 
while(!nextLevel.isEmpty()); 
{ 
currentLevel.push(nextLevel.pop()); 
} 
} 
}} 
