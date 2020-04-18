#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <string> words;
	vector <string> prefix;
	string s;
	int n, m, cnt = 0;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		words.push_back(s);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> s;
		prefix.push_back(s);
	}

	for (int i = 0; i < m; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (words[j].find(prefix[i]) == 0)
			{
				cnt++;
				j = n;
			}
		}
	}

	cout << cnt << endl;

	return 0;
}
