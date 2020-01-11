#include <iostream>
#include <string>

using namespace std;

int main()
{
	int idx = 0;
	int cnt = 0;
	string a, b, c, d, e;

	cin >> a >> b >> c >> d >> e;

	while (cnt != 5)
	{
		if (idx < a.size())  //읽어야 할 값(idx)이 문자열 a의 길이보다 작으면 세로읽기
		{
			cout << a[idx];
		}
		else if (idx == a.size())  //문자열a 출력이 완료되면 cnt++
		{
			cnt++;
		}
		
		if (idx < b.size())  //읽어야 할 값(idx)이 문자열 b의 길이보다 작으면 세로읽기
		{
			cout << b[idx];
		}
		else if (idx == b.size())  //문자열b 출력이 완료되면 cnt++
		{
			cnt++;
		}
		
		if (idx < c.size())  //읽어야 할 값(idx)이 문자열 c의 길이보다 작으면 세로읽기
		{
			cout << c[idx];
		}
		else if (idx == c.size())  //문자열c 출력이 완료되면 cnt++
		{
			cnt++;
		}
		
		if (idx < d.size())  //읽어야 할 값(idx)이 문자열 d의 길이보다 작으면 세로읽기
		{
			cout << d[idx];
		}
		else if (idx == d.size())  //문자열d 출력이 완료되면 cnt++
		{
			cnt++;
		}
		
		if (idx < e.size())  //읽어야 할 값(idx)이 문자열 e의 길이보다 작으면 세로읽기
		{
			cout << e[idx];
		}
		else if (idx == e.size())  //문자열e 출력이 완료되면 cnt++
		{
			cnt++;
		}
		
		idx++;
	}
	cout << endl;

	return 0;
}
