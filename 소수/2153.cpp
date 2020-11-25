#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <bool> prime;
	string s;
	int total = 0, x, len;

	cin >> s;

	len = s.length();

	for (int i = 0; i < len; i++)
	{
		if ('a' <= s[i] && s[i] <= 'z')
		{
			x = (int)(s[i] - 'a') + 1;
		}
		else
		{
			x = (int)(s[i] - 'A') + 27;
		}

		total += x;
	}

	for (int i = 0; i <= total; i++)
	{
		prime.push_back(true);
	}

	for (int i = 2; i <= total; i++)
	{
		for (int j = 2 * i; j <= total;)
		{
			prime[j] = false;
			j += i;
		}

		if (!prime[total])
		{
			break;
		}
	}

	if (prime[total])
	{
		cout << "It is a prime word.\n";
	}
	else
	{
		cout << "It is not a prime word.\n";
	}

	return 0;
} 
