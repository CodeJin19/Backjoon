#include <iostream>

using namespace std;

int main()
{
	int a, b, c;
	int arr[3];
	char crr[5];

	cin >> a >> b >> c;
	cin >> crr;

	if (a < b)
	{
		if (b < c)
		{
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
		}
		else if(a < c)
		{
			arr[0] = a;
			arr[1] = c;
			arr[2] = b;
		}
		else
		{
			arr[0] = c;
			arr[1] = a;
			arr[2] = b;
		}
	}
	else
	{
		if (a < c)
		{
			arr[0] = b;
			arr[1] = a;
			arr[2] = c;
		}
		else if(b < c)
		{
			arr[0] = b;
			arr[1] = c;
			arr[2] = a;
		}
		else
		{
			arr[0] = c;
			arr[1] = b;
			arr[2] = a;
		}
	}

	for (int i = 0; i < 3; i++)
	{
		switch (crr[i])
		{
		case 'A':
			cout << arr[0] << " ";
			break;
		case 'B':
			cout << arr[1] << " ";
			break;
		case 'C':
			cout << arr[2] << " ";
			break;
		}
	}

	cout << endl;
    
	return 0;
}
