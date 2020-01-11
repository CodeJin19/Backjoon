#include <iostream>

using namespace std;

int main()
{
	int sh, sm, ss, eh, em, es, ah, am, as;

	for (int i = 0; i < 3; i++)
	{
		cin >> sh >> sm >> ss >> eh >> em >> es;

		if (es < ss)
		{
			es += 60;
			em -= 1;
		}

		as = es - ss;

		if (em < sm)
		{
			em += 60;
			eh -= 1;
		}

		am = em - sm;

		ah = eh - sh;

		cout << ah << " " << am << " " << as << endl;
	}

	return 0;
}
