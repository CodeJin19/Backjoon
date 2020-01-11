#include <iostream>

using namespace std;

int main ()
{
    int score;
    
    cin >> score;
    
    if(90 <= score)
    {
        cout << "A\n";
    }
    else if(80 <= score)
    {
        cout << "B\n";
    }
    else if(70 <= score)
    {
        cout << "C\n";
    }
    else if(60 <= score)
    {
        cout << "D\n";
    }
    else
    {
        cout << "F\n";
    }
    
    return 0;
}
