#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> light;
	int n, t, sex, num, diff;

	cin >> n;

	light.push_back(0);

	for (int i = 0; i < n; i++)
	{
		cin >> num;
		light.push_back(num);
	}

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> sex >> num;

		if (sex == 1)
		{
			for (int j = 1; j <= n; j++)
				if (j % num == 0)
					light[j] = light[j] ^ 1;
		}
		else
		{
			diff = 0;

			while (1 <= num - diff && num + diff <= n)
			{
				if (light[num - diff] != light[num + diff])
					break;
				diff++;
			}

			for (int j = num - diff + 1; j < num + diff; j++)
			{
				light[j] = light[j] ^ 1;
			}
		}
	}
    
    cout << light[1];
    
    for(int i = 2; i <= n; i++)
    {
        if(i % 20 == 1)
            cout << "\n" << light[i];
        else
            cout << " " << light[i];
    }

	return 0;
}
