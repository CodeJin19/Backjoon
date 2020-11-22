#include <iostream>
#include <string>

using namespace std;

string timeToStr(int time)
{
	string str = "";
	int h, m, s, x, y;

	s = time % 60;
	time /= 60;
	m = time % 60;
	time /= 60;
	h = time;

	x = h % 10;
	y = h / 10;

	if (y == 0)
	{
		str += "0";
	}
	else
	{
		str += (char)(y + '0');
	}

	str += (char)(x + '0');

	str += ":";

	x = m % 10;
	y = m / 10;

	if (y == 0)
	{
		str += "0";
	}
	else
	{
		str += (char)(y + '0');
	}

	str += (char)(x + '0');

	str += ":";

	x = s % 10;
	y = s / 10;

	if (y == 0)
	{
		str += "0";
	}
	else
	{
		str += (char)(y + '0');
	}

	str += (char)(x + '0');

	return str;
}

int strToTime(string str)
{
	int h, m, s, ret = 0;

	h = (int)(str[0] - '0');
	h *= 10;
	h += (int)(str[1] - '0');

	m = (int)(str[3] - '0');
	m *= 10;
	m += (int)(str[4] - '0');

	s = (int)(str[6] - '0');
	s *= 10;
	s += (int)(str[7] - '0');

	ret = h;
	ret *= 60;
	ret += m;
	ret *= 60;
	ret += s;

	return ret;
}

int main()
{
	string time1, time2;
	int t1, t2;

	cin >> time1 >> time2;

	t1 = strToTime(time1);
	t2 = strToTime(time2);
	
	if(t2 < t1)
	{
		t2 += (24 * 60 * 60);
	}

	cout << timeToStr(t2 - t1) << endl;

	return 0;
}
