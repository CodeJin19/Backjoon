#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, h, w, cnt;
	vector <int> hdata;
	vector <int> wdata;
	vector <int> rate;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> w >> h;

		wdata.push_back(w);
		hdata.push_back(h);
	}

	for (int i = 0; i < n; i++)
	{
		cnt = 0;

		for (int j = 0; j < n; j++)
		{
			if (j != i)
			{
				if (wdata[i] < wdata[j] && hdata[i] < hdata[j])
				{
					cnt++;
				}
			}
		}

		rate.push_back(cnt + 1);
	}

	for (int i = 0; i < n; i++)
	{
		cout << rate[i] << " ";
	}
    	cout << endl;
	return 0;
}
