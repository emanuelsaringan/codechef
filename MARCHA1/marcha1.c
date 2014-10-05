#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

int solve(int arr[], int arr_len, int index, int total, int m) {
  if (index >= arr_len) {
    return total == m;
  }
  
  if (total == m) {
    return TRUE;
  }
  
  if (solve(arr, arr_len, index + 1, total + arr[index], m)) {
    return TRUE;
  }
  
  if (solve(arr, arr_len, index + 1, total, m)) {
    return TRUE;
  }
  
  return FALSE;
}

int main() {
  int cases;
  scanf("%d", &cases);
  
  int i;
  for (i = 0; i < cases; i++) {
    int n, m;
    scanf("%d %d", &n, &m);
    int* arr = (int*) malloc(sizeof(int) * n);
    
    int j;
    for (j = 0; j < n; j++) {
      scanf("%d", &arr[j]);
    } 
    
    printf("%s\n", solve(arr, n, 0, 0, m) ? "Yes" : "No");
    free(arr);
  }
  
  return 0;
}
