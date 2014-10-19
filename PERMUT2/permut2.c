#include <stdio.h>
#include <stdlib.h>

int equal(int* x, int* y, int n) {
  int i;
  for (i = 0; i < n; i++) {
    if (x[i] != y[i]) {
      return 0;
    }
  }
  
  return 1;
}

int main() {
  int n;
  scanf("%d", &n);
  
  int* x;
  int* y;
  
  while (n != 0) {
    x = (int*) malloc(sizeof(int) * n);
    y = (int*) malloc(sizeof(int) * n);
    
    int i;
    for (i = 0; i < n; i++) {
      scanf("%d", &x[i]);
      y[x[i] - 1] = i + 1;
    }
    
    if (equal(x, y, n)) {
      printf("ambiguous\n");
    } else {
      printf("not ambiguous\n");
    }    
    
    free(x);
    free(y);
    scanf("%d", &n);
  }
  
  return 0;
}
