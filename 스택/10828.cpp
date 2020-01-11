#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int idx = 0;
	int stck[10010];
	char arr[10];

	cin >> n;

	for (int itr = 0; itr < n; itr++)
	{
		cin >> arr;

		switch (arr[0])
		{
		case 'p':
			if (arr[1] == 'u')  //push x
			{
				cin >> stck[idx];
				idx++;
			}
			else  //pop
			{
				if (idx == 0)
				{
					cout << -1 << "\n";
				}
				else
				{
					cout << stck[idx - 1] << "\n";
					idx--;
				}
			}
			break;
		case 's':  //size
			cout << idx << "\n";
			break;
		case 'e':  //empty
			if (idx == 0)
			{
				cout << "1\n";
			}
			else
			{
				cout << "0\n";
			}
			break;
		case 't':  //top
			if (idx == 0)
			{
				cout << -1 << "\n";
			}
			else
			{
				cout << stck[idx - 1] << "\n";
			}
			break;
		}
	}

	return 0;
}
