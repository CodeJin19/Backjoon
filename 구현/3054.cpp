#include <iostream>
#include <string>

using namespace std;

int main()
{
	string arr;
	int x, y;

	cin >> arr;
	
	//1번줄
	x = 0;
	cout << ".";
	
	for (int i = 1; i <= 4 * arr.size(); i++)
	{
		if (i % 4 == 2)
		{
			x++;

			if (x % 3 == 0)
			{
				cout << "*";
			}
			else
			{
				cout << "#";
			}
		}
		else
		{
			cout << ".";
		}
	}
	
	cout << endl;

	//2번줄
	cout << ".";

	for (int i = 0; i < 2 * arr.size(); i++)
	{
		switch ((i / 2) % 3)
		{
		case 0:
		case 1:
			cout << "#.";
			break;
		case 2:
			cout << "*.";
			break;
		}
	}

	cout << endl;

	//3번줄
	cout << "#";

	for (int i = 1; i <= arr.size(); i++)
	{
		switch (i % 3)
		{
		case 1:
			cout << "." << arr[i - 1] << ".#";
			break;
		case 2:
			if (arr.size() == i)
			{
				cout << "." << arr[i - 1] << ".#";
			}
			else
			{
				cout << "." << arr[i - 1] << ".*";
			}
			break;
		case 0:
			cout << "." << arr[i - 1] << ".*";
			break;
		}
	}

	cout << endl;

	//4번줄
	cout << ".";

	for (int i = 0; i < 2 * arr.size(); i++)
	{
		switch ((i / 2) % 3)
		{
		case 0:
		case 1:
			cout << "#.";
			break;
		case 2:
			cout << "*.";
			break;
		}
	}

	cout << endl;

	//5번줄
	x = 0;
	cout << ".";

	for (int i = 1; i <= 4 * arr.size(); i++)
	{
		if (i % 4 == 2)
		{
			x++;

			if (x % 3 == 0)
			{
				cout << "*";
			}
			else
			{
				cout << "#";
			}
		}
		else
		{
			cout << ".";
		}
	}

	cout << endl;

	return 0;
}
