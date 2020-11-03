#include <iostream>
#include <string>

using namespace std;

int swap(string str)
{
	int h, m, s, ret;

	h = 0;
	m = 0;
	s = 0;

	h += (int)(str[0] - '0');
	h *= 10;
	h += (int)(str[1] - '0');

	m += (int)(str[3] - '0');
	m *= 10;
	m += (int)(str[4] - '0');

	s += (int)(str[6] - '0');
	s *= 10;
	s += (int)(str[7] - '0');

	if (h != 0)
	{
		ret = h;
		ret *= 100;
		ret += m;
		ret *= 100;
		ret += s;
	}
	else if (m != 0)
	{
		ret = m;
		ret *= 100;
		ret += s;
	}
	else if (s != 0)
	{
		ret = s;
	}
	else
	{
		ret = 0;
	}

	return ret;

}

int main()
{
	int from, to, time, cnt;
	int h, m, s;
	string str;

	for (int itr = 0; itr < 3; ++itr)
	{
		cnt = 0;

		cin >> str;
		from = swap(str);

		h = 0;
		m = 0;
		s = 0;

		h += (int)(str[0] - '0');
		h *= 10;
		h += (int)(str[1] - '0');

		m += (int)(str[3] - '0');
		m *= 10;
		m += (int)(str[4] - '0');

		s += (int)(str[6] - '0');
		s *= 10;
		s += (int)(str[7] - '0');

		cin >> str;
		to = swap(str);

		time = from;

		while (time != to)
		{
			if (60 == s)
			{
				s = 0;
				m += 1;
			}

			if (60 == m)
			{
				m = 0;
				h += 1;
			}

			if (24 == h)
			{
				h = 0;
			}

			if (h != 0)
			{
				time = h;
				time *= 100;
				time += m;
				time *= 100;
				time += s;
			}
			else if (m != 0)
			{
				time = m;
				time *= 100;
				time += s;
			}
			else if (s != 0)
			{
				time = s;
			}
			else
			{
				time = 0;
			}

			if (time % 3 == 0)
			{
				cnt++;
			}

			s++;
		}

		cout << cnt << endl;
	}

	return 0;
}
