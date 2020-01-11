#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

int main()
{
	int n, m, x;
	int min = 100000000;
	vector <int> card;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x <= m)
		{
			card.push_back(x);
		}
	}

	for (int i = 0; i < card.size() - 2; i++)  //전체 조합 
	{
		for (int j = i + 1; j < card.size() - 1; j++)
		{
			for (int k = j + 1; k < card.size(); k++)
			{
				x = m - card[i] - card[j] - card[k];

				if (x == 0)
				{
					min = 0;
					i = card.size();
					j = card.size();
					k = card.size();
				}
				else if(0 < x && x < min)
				{
					min = x;
				}
			}
		}
	}

	cout << m - min << endl;

	return 0;
}
