#include <iostream>
using namespace std;


int main() {
    long long t;
    long long x,y;
    cin >> t;

    while(t--) {
        cin >> x;
        cin >> y;

        if(x<y) {
            if(y%2 != 0) {
                cout << (y*y) - x +1 << endl;
            } else {
                cout << ((y-1)*(y-1)) + x << endl;
            }
        } else {
            if(x%2 != 0) {
                cout << ((x-1)*(x-1)) + y << endl;
            } else {
                cout << (x*x) - y + 1 << endl;
            }
        }
    }
        

        
}