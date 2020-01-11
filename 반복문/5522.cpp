#include <iostream>

using namespace std;

int main ()
{
    int x, sum = 0;
    
    for(int i = 0; i < 5; i++)
    {
        cin >> x;
        sum += x;
    }
    
    cout << sum << endl;
    return 0;
}
