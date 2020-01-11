#include <iostream>
#include <string>

using namespace std;

int main ()
{
    int T, x;
    string s;
    
    cin >> T;
    
    for(int itr = 0; itr < T; itr++)
    {
        cin >> s;
        
        if(s.size() == 1)
        {
            cout << s[0] << s[0] << endl;
        }
        else
        {
            x = s.size() - 1;
            cout << s[0] << s[x] << endl;
        }
    }
    
    return 0;
}
