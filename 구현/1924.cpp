#include <iostream>

using namespace std;

int main()
{
	int x, y;
	int d = -1;

	cin >> x >> y;

	//1월1일부터 x원 y일까지 몇 일인지 계산
	
	for (int i = 1; i < x; i++)
	{
		switch (i)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			d += 31;
			break;
		case 2:
			d += 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			d += 30;
			break;
		}
	}
	
	d += y;

	//요일 
	
	switch (d % 7)
	{
	case 0:
		cout << "MON\n";
		break;
	case 1:
		cout << "TUE\n";
		break;
	case 2:
		cout << "WED\n";
		break;
	case 3:
		cout << "THU\n";
		break;
	case 4:
		cout << "FRI\n";
		break;
	case 5:
		cout << "SAT\n";
		break;
	case 6:
		cout << "SUN\n";
		break;
	}
    
	return 0;
}
