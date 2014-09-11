#include <stdio.h>

int main() {
  int amt;
  float bal;
  scanf("%d %f", &amt, &bal);
  
  if (amt % 5 == 0 && bal >= amt + 0.50f) {
    printf("%.2f\n", ((bal - amt) - 0.50f));
  } else {
    printf("%.2f\n", bal);
  }
  
  return 0;
}
