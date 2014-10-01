nclude <iostream>

using namespace std;

int count(int n) {
    int total = 0;

    while (n) {
        if (n & 1) {
            total++;
        }

        n = (n>>1);
    }

    return total;
}

int main() {
    int cases, n;
    cin>>cases;

    for (int i = 0; i < cases; i++) {
        cin>>n;
        cout<<(n / 2048) + count(n % 2048)<<endl;
    }

    return 0;
}
