#include <stdio.h>
#define MAX_LEN 1000

int main() {
  char input[MAX_LEN];
  scanf("%s", input);
  
  while (strcmp(input, "42") != 0) {
    printf("%s\n", input);
    scanf("%s", input);
  }
  
  return 0;
}
