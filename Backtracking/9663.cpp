#include <iostream>
#include <vector>

using namespace std;

vector <vector <bool>> field;
int n;

bool isValid(int y, int x)
{
	for (int i = 0; i < n; i++)
		if (field[i][x])
			return false;

	for (int i = 0; i < n; i++)
		if (0 <= x + y - i && x + y - i < n && field[x + y - i][i])
			return false;

	for (int i = 0; i < n; i++)
		if (0 <= i - x + y && i - x + y < n && field[i - x + y][i])
			return false;
	
	return true;
}

int solve(int idx)
{
	int ret = 0;

	if (idx == n)
	{
		return 1;
	}

	for (int i = 0; i < n; i++)
	{
		if (isValid(idx, i))
		{
			field[idx][i] = true;
			ret += solve(idx + 1);
			field[idx][i] = false;
		}
	}

	return ret;
}

int main()
{
	vector <bool> tmp;

	cin >> n;

	if (n == 1)
	{
		cout << "1\n";
	}
	else if (n == 2 || n == 3)
	{
		cout << "0\n";
	}
	else
	{
		for (int i = 0; i < n; i++)
			tmp.push_back(false);

		for (int i = 0; i < n; i++)
			field.push_back(tmp);

		cout << solve(0) << endl;
	}

	return 0;
}
