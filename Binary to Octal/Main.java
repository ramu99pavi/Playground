#include<stdio.h>
int power_fn(int base,int exp)
{
  int i,sum=1;
  for(i=0;i<exp;i++)
  {
    sum=sum*base;
}
  return sum;
}
int main()
{
  int b,sum=0,r,exp=0;
  scanf("%d",&b);
  while(b!=0)
  {
  r=b%10;
    sum=sum+r*power_fn(2,exp);
    exp++;
    b=b/10;
  }
  int arr[100],i=0,j;
  while(sum!=0)
  {
    arr[i++]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",arr[j]);
}
