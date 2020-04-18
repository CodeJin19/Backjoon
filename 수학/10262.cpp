#include <iostream>

using namespace std;

int main()
{
	int a, b, x = 0, y = 0;

	cin >> a >> b;

	x += a;
	x += b;

	cin >> a >> b;

	x += a;
	x += b;

	cin >> a >> b;

	y += a;
	y += b;
	
	cin >> a >> b;

	y += a;
	y += b;

	if (x == y)
	{
		cout << "Tie\n";
	}
	else if (y < x)
	{
		cout << "Gunnar\n";
	}
	else
	{
		cout << "Emma\n";
	}
  
	return 0;
}
