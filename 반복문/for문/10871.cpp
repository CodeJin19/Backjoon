#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int N, X, num;
	vector <int> A;

	cin >> N >> X;

	for (int i = 0; i < N; i++)
	{
		cin >> num;

		A.push_back(num);
	}

	for (int i = 0; i < N; i++)
	{
		if (A[i] < X)
		{
			cout << A[i] << " ";
		}
	}

	cout << "\n";

	return 0;
}
