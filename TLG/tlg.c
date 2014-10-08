#include <stdio.h>

int main() {
  int cases;
  scanf("%d", &cases);
  
  int i, x, y, max, diff, winner;
  int tot_x, tot_y;
  tot_x = tot_y = 0;
  winner = 1;
  max = -1;
  for (i = 0; i < cases; i++) {
    scanf("%d %d", &x, &y);
    tot_x += x;
    tot_y += y;
    diff = tot_x - tot_y;
    
    if (diff > 0) {
      if (diff > max) {
        max = diff;
        winner = 1;
      }
    } else {
      diff = -diff;
      if (diff > max) {
        max = diff;
        winner = 2;
      }
    }
  }
  
  printf("%d %d\n", winner, max);
  return 0;
}
