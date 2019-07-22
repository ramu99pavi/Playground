#include <stdio.h>
int main() {
	int n,t,fd,ld,s;
  scanf("%d",&n);
  t=n;
  ld=n%10;
  while(n>=10)
  {
     n/=10;
  }
    fd=n;
  s=fd+ld;
  printf("%d",s);
	return 0;
}