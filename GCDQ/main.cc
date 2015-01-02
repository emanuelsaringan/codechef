#include <iostream>
#include <sstream>

using namespace std;

int gcd(int, int);

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  stringstream ss;

  int T, N, Q, L, R;
  cin >> T;
  for (int c = 0; c < T; c++) {
    cin >> N >> Q;

    int* arr = new int[N];
    int* gcd_left = new int[N];
    int* gcd_right = new int[N];

    for (int i = 0; i < N; i++) {
      cin >> arr[i];
    }

    gcd_left[0] = arr[0];
    for (int i = 1; i < N; i++) {
      gcd_left[i] = gcd(gcd_left[i - 1], arr[i]);
    }

    gcd_right[N - 1] = arr[N - 1];
    for (int i = N - 2; i >= 0; i--) {
      gcd_right[i] = gcd(gcd_right[i + 1], arr[i]);
    }

    for (int i = 0; i < Q; i++) {
      cin >> L >> R;
      int gcdL = (L >= 2 ? gcd_left[L - 2] : 0);
      int gcdR = (R < N ? gcd_right[R] : 0);
      ss << gcd(gcdL, gcdR) << '\n';
    }

    delete[] gcd_right;
    delete[] gcd_left;
    delete[] arr;
  }
  cout << ss.str();
  return 0;
}

int gcd(int a, int b) {
  int r;
  while(b != 0) {
    r = a % b;
    a = b;
    b = r;
  }
  return a;
}
