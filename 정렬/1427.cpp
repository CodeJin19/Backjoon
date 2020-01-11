#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	
	vector <int> num;
	int n, x;

	cin >> n;

	while (n != 0)  //숫자의 각 자리수를 분리해서 벡터에 입력
	{
		x = n % 10;
		num.push_back(x);
		n /= 10;
 	}

	sort(num.begin(), num.end());  //정렬
    
	for(int i = num.size() - 1; 0 <= i; i--)  //역순으로 출력
	{
		cout << num[i];
	}
	
	cout << endl;

	return 0;
}
