#include<stdio.h>
int main()
{
  float adj,opp,hyp;
  scanf("%f%f",&adj,&opp);
  hyp=(sqrt((adj*adj)+(opp*opp)));
  printf("%.2f",hyp);
  return 0;
}
 