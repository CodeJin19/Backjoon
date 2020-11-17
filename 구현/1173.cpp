#include <iostream>

using namespace std;

int main()
{
	int N, m, M, T, R, cnt = 0, now = 0, total = 0;

	cin >> N >> m >> M >> T >> R;

	now = m;
    
    if(M - m < T)
    {
        cout << "-1\n";
        return 0;
    }

	while (cnt != N)
	{
		total++;

		if (now + T <= M)
		{
			now += T;
			cnt++;
		}
		else
		{
			now -= R;

			if (now <= m)
			{
				now = m;
			}
		}
	}

	cout << total << endl;

	return 0;
}
