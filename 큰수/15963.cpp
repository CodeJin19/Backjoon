#include <iostream>
#include <string>

using namespace std;

int main ()
{
    string a, b;
    int aLen, bLen;
    bool flag;
    
    cin >> a >> b;
    
    aLen = a.length();
    bLen = b.length();
    
    if(aLen == bLen)
    {
        flag = true;
        
        for(int i = 0; i < aLen; ++i)
        {
            if(a[i] != b[i])
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
        {
            cout << "1\n";
        }
        else
        {
            cout << "0\n";
        }
    }
    else
    {
        cout << "0\n";
    }
    
    return 0;
}
