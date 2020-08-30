#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class bigint
{
public:
    int compare(string a, string b)
    {
	    int aLen = a.length();
	    int bLen = b.length();

	    if (bLen < aLen)
    	{
	    	return 1;
    	}
	    else if (aLen == bLen)
    	{
	    	for (int i = 0; i < aLen; ++i)
		    	if (b[i] < a[i])
			    	return 1;
    			else if (a[i] < b[i])
	    			return -1;

    		return 0;
	    }
    	else
	    {
    		return -1;
	    }
    }
    
    string aMinusB(string a, string b)
    {
	    int aLen = a.length();
    	int bLen = b.length();
	    int sum, compare;
    	bool carry;
	    string ans;

    	compare = this->compare(a, b);
	    reverse(a.begin(), a.end());
    	reverse(b.begin(), b.end());

    	if (compare == 1) // positive;
	    {
		    carry = false;

    		for (int i = 0; i < bLen; ++i)
	    	{
		    	sum = (a[i] - '0') - (b[i] - '0');

    			if (carry)
	    			sum--;

    			if (sum < 0)
	    		{
		    		sum += 10;
			    	carry = true;
			    }
    			else
	    		{
		    		carry = false;
    			}

	    		ans += (char)(sum + '0');
		    }

    		for (int i = bLen; i < aLen; ++i)
	    	{
		    	sum = (a[i] - '0');

    			if (carry)
	    			sum--;

    			if (sum < 0)
	    		{
		    		sum += 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
			    }

    			ans += (char)(sum + '0');
	    	}

    		for (int i = aLen - 1; 0 <= i; --i)
	    	{
		    	if (ans[i] != '0')
			    {
				    ans = ans.substr(0, i + 1);
    				i = -1;
	    		}
		    }

    		reverse(ans.begin(), ans.end());
    	}
    	else if (compare == 0)
	    {
		    return "0";
	    }
    	else // 3 - 123
	    {
		    carry = false;

    		for (int i = 0; i < aLen; ++i)
	    	{
		    	sum = (b[i] - '0') - (a[i] - '0');

    			if (carry)
	    			sum--;

    			if (sum < 0)
	    		{
		    		sum += 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
    			}

	    		ans += (char)(sum + '0');
		    }

    		for (int i = aLen; i < bLen; ++i)
	    	{
		    	sum = (b[i] - '0');

    			if (carry)
	    			sum--;

		    	if (sum < 0)
			    {
    				sum += 10;
	    			carry = true;
    			}
	    		else
		    	{
			    	carry = false;
    			}

    			ans += (char)(sum + '0');
	    	}

    		for (int i = bLen - 1; 0 <= i; --i)
	    	{
		    	if (ans[i] != '0')
			    {
				    ans = ans.substr(0, i + 1);
    				i = -1;
	    		}
		    }

    		ans += "-";

    		reverse(ans.begin(), ans.end());
	    }

	    return ans;
    }

    string aPlusB(string a, string b)
    {
	    int aLen = a.length();
    	int bLen = b.length();
	    int sum;
    	bool carry;
	    string ans;

    	reverse(a.begin(), a.end());
	    reverse(b.begin(), b.end());

    	if (aLen < bLen)
	    {
    		carry = false;

    		for (int i = 0; i < aLen; ++i)
	    	{
		    	sum = (a[i] - '0') + (b[i] - '0');

    			if (carry)
	    			sum += 1;

    			if (9 < sum)
	    		{
		    		sum %= 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
    			}

	    		ans += (char)(sum + '0');
		    }

    		for (int i = aLen; i < bLen; ++i)
	    	{
		    	sum = (b[i] - '0');

    			if (carry)
	    			sum += 1;

		    	if (9 < sum)
			    {
				    sum %= 10;
    				carry = true;
	    		}
		    	else
			    {
    				carry = false;
	    		}

		    	ans += (char)(sum + '0');
    		}

	    	if (carry)
		    	ans += '1';

		    reverse(ans.begin(), ans.end());
    	}
	    else if (aLen == bLen)
    	{
	    	carry = false;

    		for (int i = 0; i < aLen; ++i)
	    	{
		    	sum = (a[i] - '0') + (b[i] - '0');

			    if (carry)
				    sum += 1;

    			if (9 < sum)
	    		{
		    		sum %= 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
    			}

    			ans += (char)(sum + '0');
	    	}

    		if (carry)
	    		ans += '1';

    		reverse(ans.begin(), ans.end());
	    }
    	else
	    {
		    carry = false;

    		for (int i = 0; i < bLen; ++i)
	    	{
		    	sum = (a[i] - '0') + (b[i] - '0');

    			if (carry)
	    			sum += 1;

    			if (9 < sum)
	    		{
		    		sum %= 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
    			}

	    		ans += (char)(sum + '0');
		    }

    		for (int i = bLen; i < aLen; ++i)
	    	{
		    	sum = (a[i] - '0');

    			if (carry)
	    			sum += 1;

    			if (9 < sum)
	    		{
		    		sum %= 10;
			    	carry = true;
    			}
	    		else
		    	{
			    	carry = false;
			    }

    			ans += (char)(sum + '0');
	    	}

    		if (carry)
	    		ans += '1';

    		reverse(ans.begin(), ans.end());
    	}

	    return ans;
    }
    
    string abs(string a, string b)
    {
	    int aLen, bLen, compare;
	    string ans, atmp, btmp;

    	if (a[0] == '-')
	    {
		    if (b[0] == '-') // - & -
    		{
	    		aLen = a.length();
		    	atmp = a.substr(1, aLen);

    			bLen = b.length();
	    		btmp = b.substr(1, bLen);

    			compare = this->compare(atmp, btmp);

    			if (compare == 1)
	    		{
		    		ans = aMinusB(atmp, btmp);
			    }
    			else if (compare == 0)
	    		{
		    		ans = "0";
			    }
                else
    			{
	    			ans = aMinusB(btmp, atmp);
		    	}
    		}
	    	else // - & +
		    {
    			aLen = a.length();
	    		atmp = a.substr(1, aLen);

    			ans = aPlusB(atmp, b);
	    	}
	    }
    	else
	    {
		    if (b[0] == '-') // + & -
    		{
	    		bLen = b.length();
		    	btmp = b.substr(1, bLen);

    			ans = aPlusB(a, btmp);
	    	}
    		else // + & +
	    	{
		    	compare = this->compare(a, b);

    			if (compare == 1)
	    		{
		    		ans = aMinusB(a, b);
			    }
    			else if (compare == 0)
	    		{
		    		ans = "0";
			    }
			    else
    			{
	    			ans = aMinusB(b, a);
		    	}
    		}
	    }

	    return ans;
    }
};

int main ()
{
    bigint x;
    string a, b, ans;
    
    cin >> a >> b;
    
    ans = x.abs(a, b);
    
    cout << ans << endl;
    
    return 0;
}
