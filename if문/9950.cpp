#include <iostream>

using namespace std;

int main()
{
	int l, w, a;

	cin >> l >> w >> a;

	while (l != 0 || w != 0 || a != 0)
	{
		if (a == 0)
			cout << l << " " << w << " " << l * w << "\n";
		else if (l == 0)
			cout << a / w << " " << w << " " << a << "\n";
		else
			cout << l << " " << a / l << " " << a << "\n";

		cin >> l >> w >> a;
	}

	return 0;
}
