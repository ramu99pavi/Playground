#include<stdio.h>
int main()
{
  int  i,n,sr;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&sr);
  for(i=0;i<n;i++)
  {
    if(arr[i]==sr)
    {
      printf("%d",i+1);
      return 0;
    }
  }
    printf("%d isn't present in the array.",sr);
    return 0;
  }
