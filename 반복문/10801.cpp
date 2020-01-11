#include <iostream>
#include <vector>

using namespace std;

int main ()
{
    int x;
    vector <int> arr;
    vector <int> brr;
    
    for(int i = 0; i < 10; i++)
    {
        cin >> x;
        arr.push_back(x);
    }
    
    for(int i = 0; i < 10; i++)
    {
        cin >> x;
        brr.push_back(x);
    }
    
    x = 0;
    
    for(int i = 0; i < 10; i++)
    {
        if(arr[i] < brr[i])
        {
            x--;
        }
        else if(brr[i] < arr[i])
        {
            x++;
        }
    }
    
    if(0 < x)
    {
        cout << "A\n";
    }
    else if(x < 0)
    {
        cout << "B\n";
    }
    else
    {
        cout << "D\n";
    }
    
    return 0;
}
