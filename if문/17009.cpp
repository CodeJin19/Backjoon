#include <iostream>

using namespace std;

int main()
{
	int a = 0, b = 0, score;

	for (int i = 3; 0 < i; i--)
	{
		cin >> score;
		score *= i;
		a += score;
	}
	
	for (int i = 3; 0 < i; i--)
	{
		cin >> score;
		score *= i;
		b += score;
	}

	if (b < a)
	{
		cout << "A\n";
	}
	else if (a == b)
	{
		cout << "T\n";
	}
	else
	{
		cout << "B\n";
	}

	return 0;
}
