#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> cards;
	vector <int> tmp;
	int from, to;
	
	for (int i = 0; i <= 20; i++)
	{
		cards.push_back(i);
	}

	for (int i = 0; i < 10; i++)
	{
		tmp.clear();

		cin >> from >> to;

		for (int j = to; from <= j; j--)
		{
			tmp.push_back(cards[j]);
		}

		for (int j = 0; j <= to - from; j++)
		{
			cards[from + j] = tmp[j];
		}
	}

	for (int i = 1; i <= 20; i++)
	{
		cout << cards[i] << " ";
	}
	cout << endl;

	return 0;
}
