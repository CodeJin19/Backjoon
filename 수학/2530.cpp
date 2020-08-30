#include <iostream>

using namespace std;

int main()
{
    int h, m, s, d;
    
    cin >> h >> m >> s >> d;

    m += (h * 60);
    s += (m * 60);
    s += d;

    m = s / 60;
    s %= 60;
    
    h = m / 60;
    m %= 60;
    
    h %= 24;

    cout << h << " " << m << " " << s << endl;

    return 0;
}
