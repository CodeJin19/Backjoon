#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int n, m;
	vector <string> a;
	vector <string> b;
	string s;
	bool flag = true;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		a.push_back(s);
	}

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		b.push_back(s);
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			if (a[i][j] != b[i][j * 2] || a[i][j] != b[i][j * 2 + 1])
			{
				flag = false;
				break;
			}
		}

		if (!flag)
		{
			flag;
		}
	}
	
	if (flag)
	{
		cout << "Eyfa\n";
	}
	else
	{
		cout << "Not Eyfa\n";
	}
    
	return 0;
}
