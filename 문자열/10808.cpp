#include <string>
#include <iostream>

using namespace std;

int main()
{
	string s;
	int n;
	int arr[30];

	cin >> s;

	for (int i = 0; i < 30; i++)
	{
		arr[i] = 0;
	}

	for (int i = 0; i < s.size(); i++)
	{
		n = s[i] - 'a';
		arr[n] ++;
	}

	for (int i = 0; i < 26; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;

	return 0;
}
