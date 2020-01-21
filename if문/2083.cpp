#include <iostream>

using namespace std;

int main()
{
	string name;
	int age, weight;

	cin >> name >> age >> weight;

	while (age != 0 && weight != 0)
	{
		if (17 < age || 80 <= weight)
		{
			cout << name << " Senior\n";
		}
		else
		{
			cout << name << " Junior\n";
		}

		cin >> name >> age >> weight;
	}

	return 0;
}
