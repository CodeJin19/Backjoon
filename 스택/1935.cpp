#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <double> stck;
	vector <int> list;
	string str;
	double num1, num2;
	int n, x, l;
	
	cin >> n >> str;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		list.push_back(x);
	}

	l = str.length();

	for (int i = 0; i < l; i++)
	{
		if ('A' <= str[i] && str[i] <= 'Z')
		{
			stck.push_back(list[(int)(str[i] - 'A')]);
		}
		else
		{
			num2 = stck.back();
			stck.pop_back();
			num1 = stck.back();
			stck.pop_back();

			if (str[i] == '+')
				num1 = num1 + num2;
			else if (str[i] == '-')
				num1 = num1 - num2;
			else if (str[i] == '*')
				num1 = num1 * num2;
			else if (str[i] == '/')
				num1 = num1 / num2;

			stck.push_back(num1);
		}
	}

	cout << fixed;
	cout.precision(2);
	cout << stck.back() << endl;

	return 0;
}
