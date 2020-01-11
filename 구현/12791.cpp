#include <iostream>

using namespace std;

int main()
{
	int n, s, e, idx, cnt;
	int arr[30];

	cin >> n;

	arr[0] = 1967;
	arr[1] = 1969;
	arr[2] = 1970;
	arr[3] = 1971;
	arr[4] = 1972;
	arr[5] = 1973;
	arr[6] = 1973;
	arr[7] = 1974;
	arr[8] = 1975;
	arr[9] = 1976;
	arr[10] = 1977;
	arr[11] = 1977;
	arr[12] = 1979;
	arr[13] = 1980;
	arr[14] = 1983;
	arr[15] = 1984;
	arr[16] = 1987;
	arr[17] = 1993;
	arr[18] = 1995;
	arr[19] = 1997;
	arr[20] = 1999;
	arr[21] = 2002;
	arr[22] = 2003;
	arr[23] = 2013;
	arr[24] = 2016;

	for (int i = 0; i < n; i++)
	{
		cin >> s >> e;

		idx = 0;
		cnt = 0;

		for (int i = 0; i < 25; i++)
		{
			if (s <= arr[i] && arr[i] <= e)
			{
				cnt++;
			}
		}

		cout << cnt << endl;

		while (arr[idx] < s)
		{
			idx++;
		}

		while (arr[idx] <= e && idx <25)
		{
			cout << arr[idx] << " ";

			switch (idx)
			{
			case 0:
				cout << "DavidBowie\n";
				break;
			case 1:
				cout << "SpaceOddity\n";
				break;
			case 2:
				cout << "TheManWhoSoldTheWorld\n";
				break;
			case 3:
				cout << "HunkyDory\n";
				break;
			case 4:
				cout << "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars\n";
				break;
			case 5:
				cout << "AladdinSane\n";
				break;
			case 6:
				cout << "PinUps\n";
				break;
			case 7:
				cout << "DiamondDogs\n";
				break;
			case 8:
				cout << "YoungAmericans\n";
				break;
			case 9:
				cout << "StationToStation\n";
				break;
			case 10:
				cout << "Low\n";
				break;
			case 11:
				cout << "Heroes\n";
				break;
			case 12:
				cout << "Lodger\n";
				break;
			case 13:
				cout << "ScaryMonstersAndSuperCreeps\n";
				break;
			case 14:
				cout << "LetsDance\n";
				break;
			case 15:
				cout << "Tonight\n";
				break;
			case 16:
				cout << "NeverLetMeDown\n";
				break;
			case 17:
				cout << "BlackTieWhiteNoise\n";
				break;
			case 18:
				cout << "1.Outside\n";
				break;
			case 19:
				cout << "Earthling\n";
				break;
			case 20:
				cout << "Hours\n";
				break;
			case 21:
				cout << "Heathen\n";
				break;
			case 22:
				cout << "Reality\n";
				break;
			case 23:
				cout << "TheNextDay\n";
				break;
			case 24:
				cout << "BlackStar\n";
				break;
			}
			idx++;
        }
	}

	return 0;
}
