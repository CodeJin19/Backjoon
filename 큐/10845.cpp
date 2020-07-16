#include <iostream>
#include <queue>

using namespace std;

int main()
{
	int t, n;
	string s;
	queue <int> q;
	
	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> s;

		switch (s[1])
		{
		case 'u': //push
			cin >> n;
			q.push(n);
			break;
		case 'o': //pop
			if (!q.empty())
			{
				cout << q.front() << "\n";
				q.pop();
			}
			else
				cout << "-1\n";
			break;
		case 'i': //size
			cout << q.size() << "\n";
			break;
		case 'm': //empty
			if (q.empty())
				cout << "1\n";
			else
				cout << "0\n";
			break;
		case 'r': //front
			if (!q.empty())
				cout << q.front() << "\n";
			else
				cout << "-1\n";
			break;
		case 'a': //back
			if (!q.empty())
				cout << q.back() << "\n";
			else
				cout << "-1\n";
			break;
		}
	}

	return 0;
}
