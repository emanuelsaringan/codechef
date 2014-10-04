#include <stdio.h>

int getN() {
  int c;
  int total = 0;
  
  while ('0' <= (c = getchar()) && c <= '9') {
    total = (total * 10) + (c - '0');
  }
  
  return total;
}

int main() {
  int n = getN();
  int k = getN();
  int res = 0;
  int i;
  for (i = 0; i < n; i++) {
    if (getN() % k == 0) {
      res++;
    }
  }
  
  printf("%d\n", res);
  return 0;
}
