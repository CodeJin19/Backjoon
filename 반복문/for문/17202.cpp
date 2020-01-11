#include <iostream>
#include <vector>

using namespace std;

int main()
{
	char numa[10], numb[10];
	vector <int> arr;

	cin >> numa >> numb;

	for (int i = 0; i < 8; i++)
	{
		arr.push_back(numa[i] - '0');
		arr.push_back(numb[i] - '0');
	}

	for (int j = 0; j < 14; j++)
	{
		for (int i = 0; i < arr.size() - 1; i++)
		{
			arr[i] = arr[i] + arr[i + 1];
			arr[i] %= 10;
		}
	}

	cout << arr[0] << arr[1] << endl;

	return 0;
}
