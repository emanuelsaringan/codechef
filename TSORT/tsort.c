#include <stdio.h>
#include <string.h>
#define MAX_VAL 1000000

void init_arr(int[]);

int main() {
  int arr[MAX_VAL + 1];
  init_arr(arr);
  int cases;
  scanf("%d", &cases);
  
  int i, n;
  for (i = 0; i < cases; i++) {
    scanf("%d", &n);
    arr[n]++;
  }
  
  int j, cur_val;
  for (i = 0; i <= MAX_VAL; i++) {
    cur_val = arr[i];
    for (j = 0; j < cur_val; j++) {
      printf("%d\n", i);
    }
  }
  
  return 0;
}

void init_arr(int arr[]) {
  memset(arr, 0, sizeof(int) * (MAX_VAL + 1));
  /*
  int i;
  for (i = 0; i <= MAX_VAL; i++) {
    arr[i] = 0;
  }*/
}
