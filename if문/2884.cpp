#include <iostream>

using namespace std;

int main()
{
	int h, m;

	cin >> h >> m;

	if (45 <= m)  //45분 이후이면 바로 뺄셈
	{
		m -= 45;
	}
	else  //받아내림
	{
		m += 15;
		
		if (h == 0)
		{
			h = 23;
		}
		else
		{
			h -= 1;
		}
	}

	cout << h << " " << m << endl;

	return 0;
}
