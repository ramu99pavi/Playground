#include<stdio.h>
int main()
{
  	int n,i,e1,e2,ei1=-1,ei2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&e1,&e2);
  for(i=0;i<n;i++)
  {
    if(e1==a[i] && ei1==-1)
    {
      ei1=i;
    }
    if(e2==a[i] && ei2==-1)
    {
      ei2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",ei1,ei2);
return 0;
}
 
