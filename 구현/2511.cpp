#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector <int> x, y;
    int a, b, tmp;
    bool isDraw = true;
    char lastWinner;
    
    a = 0;
    b = 0;
    
    for(int i = 0; i < 10; ++i)
    {
        cin >> tmp;
        x.push_back(tmp);
    }
    
    for(int i = 0; i < 10; ++i)
    {
        cin >> tmp;
        y.push_back(tmp);
    }
    
    for(int i = 0; i < 10; ++i)
    {
        if(x[i] < y[i])
        {
            isDraw = false;
            lastWinner = 'B';
            b += 3;
        }
        else if(x[i] == y[i])
        {
            a += 1;
            b += 1;
        }
        else
        {
            isDraw = false;
            lastWinner = 'A';
            a += 3;
        }
    }
    
    cout << a << " " << b << endl;
    
    if(a < b)
    {
        cout << "B\n";
    }
    else if(a == b)
    {
        if(isDraw)
        {
            cout << "D\n";
        }
        else
        {
            cout << lastWinner << endl;
        }
    }
    else
    {
        cout << "A\n";
    }
        
    return 0;
}
