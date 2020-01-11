#include <iostream>

using namespace std;

int main()
{
    double a, b;
    
    cin >> a >> b;
    
    cout << fixed;
    cout.precision(10);
    cout << a / b << endl;
    return 0;
}
