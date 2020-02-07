#include <iostream>
#include <vector>

using namespace std;

class Node
{
public:
	int data;
	Node * next;

	Node(int d)
	{
		data = d;
		next = NULL;
	}
};

class Stack
{
public:
	Node * head;
	int size;

	Stack()
	{
		head = NULL;
		size = 0;
	}

	bool isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void push(int x)
	{
		Node * newNode = new Node(x);

		if (isEmpty())
		{
			head = newNode;
		}
		else
		{
			newNode->next = head;
			head = newNode;
		}

		size++;
	}

	int top()
	{
		if (!isEmpty())
		{
			return head->data;
		}
		return -1;
	}

	int pop()
	{
		if (!isEmpty())
		{
			Node * tmp = head;
			head = head->next;
			tmp->next = NULL;
			size--;
			return tmp->data;
		}
		else
		{
			return -1;
		}
	}
};

class Queue
{
public:
	Node * head;
	Node * tail;
	int size;

	Queue()
	{
		head = NULL;
		tail = NULL;
		size = 0;
	}

	bool isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void push(int x)
	{
		Node * newNode = new Node(x);

		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail->next = newNode;
			tail = newNode;
		}

		size++;
	}

	int top()
	{
		if (!isEmpty())
		{
			return head->data;
		}
		return -1;
	}

	int pop()
	{
		if (!isEmpty())
		{
			Node * tmp = head;
			head = head->next;
			tmp->next = NULL;
			size--;
			return tmp->data;
		}
		else
		{
			return -1;
		}
	}
};

vector <vector <bool>> fld;
vector <bool> cache;
Stack dfsStck;
Queue bfsQue;

int n;

void dfs()
{
	int x;

	while (!dfsStck.isEmpty())
	{
		x = dfsStck.pop();

		if (!cache[x])
		{
			cout << x << " ";
			cache[x] = true;
		}

		for (int i = n; 1 <= i; i--)
		{
			if (fld[x][i] && !cache[i])
			{
				dfsStck.push(i);
			}
		}
	}
}

void bfs()
{
	int x;

	while (!bfsQue.isEmpty())
	{
		x = bfsQue.pop();

		if (!cache[x])
		{
			cout << x << " ";
			cache[x] = true;
		}

		for (int i = 1; i <= n; i++)
		{
			if (fld[x][i] && !cache[i])
			{
				bfsQue.push(i);
			}
		}
	}
}

int main()
{
	vector <bool> tmp;
	int m, v, x, y;

	cin >> n >> m >> v;

	for (int i = 0; i <= n; i++)
	{
		tmp.push_back(false);
		cache.push_back(false);
	}

	for (int i = 0; i <= n; i++)
	{
		fld.push_back(tmp);
	}
	
	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;
		fld[x][y] = true;
		fld[y][x] = true;
	}

	dfsStck.push(v);
	dfs();
	cout << endl;
	
	for (int i = 0; i <= n; i++)
	{
		cache[i] = false;
	}

	bfsQue.push(v);
	bfs();
	cout << endl;
	
	return 0;
}
