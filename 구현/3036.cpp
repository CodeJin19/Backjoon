#include <iostream>
#include <vector>

using namespace std;

void swp(int * x, int * y)
{
	int tmp;

	if (*x < *y)
	{
		tmp = *x;
		*x = *y;
		*y = tmp;
	}
}

int lcm(int x, int y)  //최소공배수
{
	swp(&x, &y);

	int r = x % y;
	int a = x;
	int b = y;

	while (r != 0)
	{
		a = b;
		b = r;
		r = a % b;
	}

	return  (x / b * y);
}

int gcd(int x, int y)  //최대공약수
{
	swp(&x, &y);

	int r = x % y;

	while (r != 0)
	{
		x = y;
		y = r;
		r = x % y;
	}

	return  y;
}

int main()
{
	int n, x;
	vector <int> ring;  //바퀴의 
	vector <vector <int>> ratio;  //첫 번째 바퀴와 i번째 바퀴의 회전비
	vector <int> tmp;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		ring.push_back(x);
		tmp.push_back(0);
	}

	ratio.push_back(tmp);
	ratio.push_back(tmp);
	ratio.push_back(tmp);

	ratio[0][1] = lcm(ring[0], ring[1]);
	ratio[1][1] = ratio[0][1] / ring[1];
	ratio[2][1] = ratio[0][1] / ring[0];
	
	for (int i = 2; i < n; i++)
	{
		ratio[0][i] = lcm(ring[i], ring[i - 1]);
		ratio[1][i] = ratio[0][i] / ring[i];
		ratio[2][i] = ratio[0][i] / ring[i - 1];

		x = lcm(ratio[1][i - 1], ratio[2][i]);
		ratio[1][i] *= (x / ratio[2][i]);
		ratio[2][i] = ratio[2][i - 1] * (x / ratio[1][i - 1]);

		x = gcd(ratio[1][i], ratio[2][i]);

		if (x != 1)
		{
			ratio[1][i] /= x;
			ratio[2][i] /= x;
		}
	}

	for (int i = 1; i < n; i++)
	{
		cout << ratio[1][i] << "/" << ratio[2][i] << "\n";
	}

	return 0;
}
