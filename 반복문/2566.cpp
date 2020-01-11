#include <iostream>

using namespace std;

int main ()
{
    int fld[10][10];
    int max = 0;
    int x, y;
    
    for(int i = 1; i < 10; i++)
    {
        for(int j = 1; j < 10; j++)
        {
            cin >> fld[i][j];
            if(max < fld[i][j])
            {
                max = fld[i][j];
                x = i;
                y = j;
            }
        }
    }
    
    cout << max << endl << x << " " << y << endl;
    
    return 0;
}
