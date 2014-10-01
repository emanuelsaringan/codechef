#include <stdio.h>

int lookup[26];

int get_holes(char arr[]) {
  int i, holes;
  i = holes = 0;
  while (arr[i] != '\0') {
    holes += lookup[arr[i] - 'A'];
    i++;
  }
  
  return holes;
}

int main() {
  lookup[0] = 1;
  lookup[1] = 2;
  lookup[2] = 0;
  lookup[3] = 1;
  lookup[4] = 0;
  lookup[5] = 0;
  lookup[6] = 0;
  lookup[7] = 0;
  lookup[8] = 0;
  lookup[9] = 0;
  lookup[10] = 0;
  lookup[11] = 0;
  lookup[12] = 0;
  lookup[13] = 0;
  lookup[14] = 1;
  lookup[15] = 1;
  lookup[16] = 1;
  lookup[17] = 1;
  lookup[18] = 0;
  lookup[19] = 0;
  lookup[20] = 0;
  lookup[21] = 0;
  lookup[22] = 0;
  lookup[23] = 0;
  lookup[24] = 0;
  lookup[25] = 0;

  int cases; 
  scanf("%d", &cases);
  
  int i;
  char buf[101];
  for (i = 0; i < cases; i++) {
    scanf("%s", buf);
    printf("%d\n", get_holes(buf));
  }
  
  return 0;
}
