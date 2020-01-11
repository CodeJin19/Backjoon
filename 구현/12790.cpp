#include <iostream>

using namespace std;

int main()
{
	int t, hp, mp, atk, def, addhp, addmp, addatk, adddef, ans;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> hp >> mp >> atk >> def >> addhp >> addmp >> addatk >> adddef;

		hp += addhp;
		mp += addmp;
		atk += addatk;
		def += adddef;

		if (hp < 1)
		{
			hp = 1;
		}

		if (mp < 1)
		{
			mp = 1;
		}

		if (atk < 0)
		{
			atk = 0;
		}

		ans = hp + 5 * mp + 2 * atk + 2 * def;

		cout << ans << "\n";
	}

	return 0;
}
