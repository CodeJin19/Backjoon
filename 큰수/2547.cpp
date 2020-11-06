#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class bigint
{
private:
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

	string aMinusBWithoutCompare(string a, string b)
    {
    	int aLen = a.length();
	    int bLen = b.length();
    	int sum;
	    bool carry;
    	string ans;

    	reverse(a.begin(), a.end());
	    reverse(b.begin(), b.end());

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

    	carry = false;

    	for (int i = aLen - 1; 0 <= i; --i)
	    {
		    if (ans[i] != '0')
    		{
	    		ans = ans.substr(0, i + 1);
		    	carry = true;
			    i = -1;
    		}
	    }

    	if (!carry)
	    {
		    return "0";
    	}
	    else
	    {
		    reverse(ans.begin(), ans.end());
    		return ans;
	    }
    }

	string aModularB(string a, string b)
    {
    	int aLen = a.length();
	    int bLen = b.length();
    	int compare = this->compare(a, b);
	    int cnt;
    	bool isFirst = true;
	    string ans, tmp;

    	if (compare == 1)
	    {
		    ans = "";
    		tmp = "";

	    	for (int i = 0; i < aLen; ++i)
		    {
			    tmp += a[i];
    			cnt = 0;

	    		while (0 <= this->compare(tmp, b))
		    	{
			    	tmp = aMinusBWithoutCompare(tmp, b);
				    cnt++;
    			}

	    		ans += (char)(cnt + '0');

		    	if (tmp.compare("0") == 0 && i != aLen - 1)
			    {
				    tmp = "";
    			}
	    	}

    		ans = tmp;
	    }
    	else if (compare == 0)
	    {
		    ans = "0";
	    }
    	else
    	{
	    	ans = a;
    	}

	    return ans;
    }

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

	string add(string a, string b)
    {
    	return aPlusB(a, b);
    }

	string mod(string a, string b)
    {
        return aModularB(a, b);
    }
};

int main()
{
    bigint x;
    string s, tmp, num, ans;
    int t, n, l;
    
    cin >> t;
    
    for(int itr = 0; itr < t; ++itr)
    {
        cin >> num;
        
        l = num.length();
        n = 0;
        
        for(int i = 0; i < l; ++i)
        {
            n *= 10;
            n += (int)(num[i] - '0');
        }
        
        ans = "0";
        
        for(int i = 0; i < n; ++i)
        {
            cin >> s;
            
            tmp = x.mod(s, num);
            ans = x.add(ans, tmp);
        }
        
        ans = x.mod(ans, num);
        
        if(ans.compare("0") == 0)
        {
            cout << "YES\n";
        }
        else
        {
            cout << "NO\n";
        }
    }
    
    return 0;
}
