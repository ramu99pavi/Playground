#include<stdio.h>
int main()
{
  int n;
  float  p,r, si;
  scanf("%f%d%f",&p,&n,&r);
  si=(p*n*r)/100;
  printf("%f",si);
  return 0;
}