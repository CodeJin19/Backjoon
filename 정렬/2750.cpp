#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main ()
{
    int n, x;
    vector <int> list;
    
    cin >> n;
    
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        list.push_back(x);
    }
    
    sort(list.begin(), list.end());
    
    for (int i = 0; i < n; i++)
    {
        cout << list[i] << "\n";
    }
    
    return 0;
}
