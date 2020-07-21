#include <iostream>
#include <map>

using namespace std;

int main()
{
	int n, x;
	pair<map<int, int>::iterator, bool > pr;
	map <int, int> list;
	map <int, int> :: iterator iter;

	scanf("%d", &n);

	for (int i = 0; i < n; ++i)
	{
		scanf("%d", &x);
		pr = list.insert(pair<int, int>(x, 1));

		if (!pr.second)
			list[x] += 1;
	}

	scanf("%d", &n);

	for (int i = 0; i < n; ++i)
	{
		scanf("%d", &x);

		iter = list.find(x);

		if (iter != list.end())
			printf("%d ", (*iter).second);
		else
			printf("0 ");
	}
	printf("\n");

	return 0;
}
