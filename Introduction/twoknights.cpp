#include <iostream>
using namespace std;

int main() {
    long long int  n;
    cin >> n;
    long long int result;

    // for 2x3 or 3x2 board ways 1 knights will attack  is 2(n-2)(n-1) so for 2 knights it will be 4(n-2)(n-1)
    // and total 2x3 and 3x2 arrangements on a board is given by n^2(n^2 - 1)/2 
    for(long long int i=1; i<=n; i++) {
        result = ((i*i)*((i*i)-1)/2) - (4*(i-1)*(i-2));
        cout << abs(result) << endl;
    }
    
    
}