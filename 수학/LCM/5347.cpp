#include <iostream>

using namespace std;

int main()
{
    int t;
	long long a, b, x, y, r, ans;

    cin>> t;
    
    for (int itr = 0; itr < t; itr++)
    {
        cin >> a >> b;

     	if(a < b)
 	    {
		    x = a;
		    y = b;
    	}
	    else
    	{
	       	x = b;
            y = a;
        }

    	r = y % x;

    	while (r != 0)
	    {
		    y = x;
    		x = r;
	    	r = y % x;
    	}

    	ans = a / x;
	    ans *= b;
    	cout << ans << "\n";
    }
	
	return 0;
}
