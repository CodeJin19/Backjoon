#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int n, d, m, y, x, max, min, maxidx, minidx;
	string tmp;

	vector <string> name;

	cin >> n;

	cin >> tmp >> d >> m >> y;

	x = y;
	x *= 100;
	x += m;
	x *= 100;
	x += d;

	max = x;
	min = x;
	maxidx = 0;
	minidx = 0;

	name.push_back(tmp);

	for (int i = 1; i < n; i++)
	{
		cin >> tmp >> d >> m >> y;

		x = y;
		x *= 100;
		x += m;
		x *= 100;
		x += d;

		if (max < x)
		{
			max = x;
			maxidx = i;
		}

		if (x < min)
		{
			min = x;
			minidx = i;
		}

		name.push_back(tmp);
	}
	
	cout << name[maxidx] << endl;
	cout << name[minidx] << endl;

	return 0;
}
