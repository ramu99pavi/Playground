#include<stdio.h>
int main()
{
  int i,n,t1=1,t2=0,temp;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ",t2);
    temp=t1+t2;
    t2=t1;
    t1=temp;
  }
  return 0;
}