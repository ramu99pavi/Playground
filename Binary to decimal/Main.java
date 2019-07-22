#include<stdio.h>
#include<math.h>
int main()
{
  long int n,sum=0,rem,i=0;
  scanf("%ld",&n);
  while(n!=0)
  {
    rem = n%10;
    sum = sum + rem*pow(2,i);
    n = n/10;
    i++;
  }
  printf("%ld",sum);
  return 0;
}