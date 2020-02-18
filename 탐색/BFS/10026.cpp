#include <iostream>
#include <vector>

using namespace std;

vector <vector <char>> field;
vector <vector <bool>> cache;
int n;

void bfs(int y, int x, char val)
{
	if (x == 0 || n < x || y == 0 || n < y)
	{
		return;
	}

	cache[y][x] = true;

	if (field[y][x + 1] == val && !cache[y][x + 1])
		bfs(y, x + 1, val);

	if (field[y][x - 1] == val && !cache[y][x - 1])
		bfs(y, x - 1, val);

	if (field[y + 1][x] == val && !cache[y + 1][x])
		bfs(y + 1, x, val);

	if (field[y - 1][x] == val && !cache[y - 1][x])
		bfs(y - 1, x, val);
}

int normal()
{
	int cnt = 0;

	for (int y = 1; y <= n; y++)
	{
		for (int x = 1; x <= n; x++)
		{
			if (!cache[y][x])
			{
				bfs(y, x, field[y][x]);
				cnt++;
			}
		}
	}

	return cnt;
}

int maeng()
{
	int cnt = 0;

	for (int y = 1; y <= n; y++)
		for (int x = 1; x <= n; x++)
			if (field[y][x] == 'R')
				field[y][x] = 'G';


	for (int y = 1; y <= n; y++)
	{
		for (int x = 1; x <= n; x++)
		{
			if (!cache[y][x])
			{
				bfs(y, x, field[y][x]);
				cnt++;
			}
		}
	}

	return cnt;
}

int main()
{
	vector <char> tmp;
	vector <bool> bmp;

	cin >> n;

	for (int i = 0; i <= n + 1; i++)
		tmp.push_back('0');

	for (int i = 0; i <= n + 1; i++)
		field.push_back(tmp);

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			cin >> field[i][j];
		}
	}

	for (int i = 0; i <= n + 1; i++)
		bmp.push_back(false);

	for (int i = 0; i <= n + 1; i++)
		cache.push_back(bmp);

	cout << normal() << " ";

	for (int i = 0; i <= n; i++)
		for (int j = 0; j <= n; j++)
			cache[i][j] = false;

	cout << maeng() << "\n";
	
	return 0;
}
