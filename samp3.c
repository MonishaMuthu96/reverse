#include<stdio.h>
int main()
{
	int no,n,max;
	int hash[10000]={0},i;
	scanf("%d",&no);
	max=-32767;
	for(i=0;i<no;i++)
	{
		scanf("%d",&n);
		hash[n]++;
		if(max<n)
		max=n;
	}
	
	for(i=0;i<=max;i++)
	{
	if(hash[i]>1)
	{
	printf("%d ",i);
	break;
	}
	}
}