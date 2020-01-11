#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n;
	string s;

	cin >> n >> s;

	for (int j = 0; j < 2 * n + 3; j++)
	{
		for (int i = 0; i < s.size(); i++)
		{
			if (j == 0)  //맨 윗줄
			{
				switch (s[i])
				{
				case '0':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '1':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '2':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '3':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '4':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '5':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '6':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '7':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '8':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '9':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				}
			}
			else if (j <= n)  //윗 부분 세로 획
			{
				switch (s[i])
				{
				case '0':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '1':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '2':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '3':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '4':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '5':
					cout << "|";
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					break;
				case '6':
					cout << "|";
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					break;
				case '7':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '8':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '9':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				}
			}
			else if (j == n + 1)  //가운데 가로 획
			{
				switch (s[i])
				{
				case '0':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '1':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '2':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '3':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '4':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '5':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '6':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '7':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '8':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '9':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				}
			}
			else if (j <= 2 * n + 1)  //아랫 부분 세로 획
			{
				switch (s[i])
				{
				case '0':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '1':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '2':
					cout << "|";
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					break;
				case '3':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '4':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '5':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '6':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '7':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '8':
					cout << "|";
					for (int k = 0; k < n; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				case '9':
					for (int k = 0; k < n + 1; k++)
					{
						cout << " ";
					}
					cout << "|";
					break;
				}
			}
			else  //맨 밑줄
			{
				switch (s[i])
				{
				case '0':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '1':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '2':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '3':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '4':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '5':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '6':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '7':
					for (int k = 0; k < n + 2; k++)
					{
						cout << " ";
					}
					break;
				case '8':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				case '9':
					cout << " ";
					for (int k = 0; k < n; k++)
					{
						cout << "-";
					}
					cout << " ";
					break;
				}
			}
         		cout << " ";
		}
		cout << "\n";
	}

	return 0;
}
