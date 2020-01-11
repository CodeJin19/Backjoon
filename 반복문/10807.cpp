#include <iostream>
#include <vector>

using namespace std;

int main ()
{
    int n, x;
    int cnt = 0;
    vector <int> arr;
    
    cin >> n;
    
    for(int i = 0; i < n; i++)
    {
        cin >> x;
        arr.push_back(x);
    }
    
    cin >> x;
    
    for(int i = 0; i < n; i++)
    {
        if(arr[i] == x)
        {
            cnt++;
        }
    }
    
    cout << cnt << endl;
    
    return 0;
}
