#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> science;
	vector <int> other;

	int x, sum = 0;

	for (int i = 0; i < 4; i++)
	{
		cin >> x;
		science.push_back(x);
	}
	
	cin >> x;
	other.push_back(x);
	cin >> x;
	other.push_back(x);

	sort(science.begin(), science.end());
	sort(other.begin(), other.end());

	for (int i = 1; i < 4; i++)
	{
		sum += science[i];
	}

	sum += other[1];

	cout << sum << endl;

	return 0;
}
