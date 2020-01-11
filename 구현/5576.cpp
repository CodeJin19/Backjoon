#include <iostream>

using namespace std;

int main()
{
	int wrr[10];
	int krr[10];
	int a, b, c, w, k, adx, bdx;

	a = 0;
	b = 0;
	c = 0;

	for (int i = 0; i < 10; i++)
	{
		cin >> wrr[i];

		if (a < wrr[i])
		{
			a = wrr[i];
			adx = i;
		}
	}

	for (int i = 0; i < 10; i++)
	{
		if (b < wrr[i] && i != adx)
		{
			b = wrr[i];
			bdx = i;
		}
	}

	for (int i = 0; i < 10; i++)
	{
		if (c < wrr[i] && i != adx && i != bdx)
		{
			c = wrr[i];
		}
	}

	w = a + b + c;

	a = 0;
	b = 0;
	c = 0;

	for (int i = 0; i < 10; i++)
	{
		cin >> krr[i];

		if (a < krr[i])
		{
			a = krr[i];
			adx = i;
		}
	}

	for (int i = 0; i < 10; i++)
	{
		if (b < krr[i] && i != adx)
		{
			b = krr[i];
			bdx = i;
		}
	}

	for (int i = 0; i < 10; i++)
	{
		if (c < krr[i] && i != adx && i != bdx)
		{
			c = krr[i];
		}
	}

	k = a + b + c;

	cout << w << " " << k << endl;

	return 0;
}
