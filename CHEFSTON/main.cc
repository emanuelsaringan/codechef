#include <iostream>

using namespace std;

typedef unsigned long long ull;

int main() {
  size_t T, N, K;
  cin >> T;
  for (size_t c = 0; c < T; c++) {
    cin >> N >> K;

    ull* A = new ull[N];
    ull* B = new ull[N];

    for (size_t i = 0; i < N; i++) {
      cin >> A[i];
    }

    for (size_t i = 0; i < N; i++) {
      cin >> B[i];
    }

    ull max = 0;
    for (size_t i = 0; i < N; i++) {
      ull cur = (K / A[i]) * B[i];
      if (cur > max) {
        max = cur;
      }
    }

    cout << max << endl;
    delete[] A;
    delete[] B;
  }

  return 0;
}
