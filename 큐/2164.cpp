#include <iostream>

using namespace std;

class Node
{
public:
	int data;
	Node * next;
	Node * prev;

	Node(int givenData)
	{
		data = givenData;
		next = NULL;
		prev = NULL;
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
			return true;
		else
			return false;
	}

	void push(int x)
	{
		Node * newNode = new Node(x);

		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
			newNode->next = newNode;
			newNode->prev = newNode;
		}
		else
		{
			tail->next = newNode;
			newNode->prev = tail;
			tail = newNode;

			tail->next = head;
			head->prev = tail;
		}

		size++;
	}

	void simulate()
	{
		Node * del;
		
		while (size != 1)
		{
			del = head;

			head = head->next;
			head->prev = tail;
			tail->next = head;

			del->next = NULL;
			del->prev = NULL;
			size--;

			head = head->next;
			tail = tail->next;
		}

		cout << head->data << endl;
	}
};

int main()
{
	Queue que;
	int n;

	cin >> n;

	for (int i = 1; i <= n; i++)
		que.push(i);

	que.simulate();

	return 0;
}
