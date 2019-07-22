#include<stdio.h>
int main()
{
	int a,d, n,n1,n2,t1,t2;
    scanf("%d",&n);
  if(n%2==1)
  {
    a=0;d=2;
    n1=(n+1)/2;
    t1=(a+(n1-1)*d);
    printf("%d",t1);
  }
  else
  {
    a=0;d=1;
  n2=(n+1)/2;
  t2=(a+(n2-1)*d);
  printf("%d",t2);
  }
   return 0;	
}