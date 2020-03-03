#include <iostream>
#include <string>

using namespace std;

int main()
{
	string a, b;
	int aLen, bLen, min = 2100000000, cnt;

	cin >> a >> b;

	aLen = a.length();
	bLen = b.length();

	for (int i = 0; i <= bLen - aLen; i++)
	{
		cnt = 0;

		for (int j = 0; j < aLen; j++)
			if (a[j] != b[i + j])
				cnt++;

		if (cnt < min)
			min = cnt;
	}

	cout << min << endl;

	return 0;
}
