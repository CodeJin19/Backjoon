#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector <double> cache;
    int a, b, c, d, idx;
    double tmp, max;

    cin >> a >> b;
    cin >> c >> d;

    tmp = a / c;
    tmp += (b / d);
    cache.push_back(tmp);

    tmp = c / d;
    tmp += (a / b);
    cache.push_back(tmp);

    tmp = d / b;
    tmp += (c / a);
    cache.push_back(tmp);

    tmp = b / a;
    tmp += (d / c);
    cache.push_back(tmp);

    max = -1;

    for (int i = 3; 0 <= i; --i)
    {
        if (max < cache[i])
        {
            max = cache[i];
            idx = i;
        }
    }

    cout << idx << endl;
    
    return 0;
}
