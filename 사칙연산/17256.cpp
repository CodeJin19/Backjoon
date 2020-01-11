#include <iostream>

using namespace std;

int main()
{
	int ax, ay, az, bx, by, bz, cx, cy, cz;

	cin >> ax >> ay >> az >> cx >> cy >> cz;

	bz = cz - ax;
	by = cy / ay;
	bx = cx - az;

	cout << bx << " " << by << " " << bz << endl;

	return 0;
}
