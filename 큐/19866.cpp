#include <iostream>
#include <string>

using namespace std;

class Node
{
public:
	int data;
	Node* prev;
	Node* next;

	Node(int givenData)
	{
		data = givenData;
		prev = NULL;
		next = NULL;
	}
};

class Queue
{
public:
	Node* head;
	Node* tail;
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

	void pushFront(int data)
	{
		Node* newNode = new Node(data);

		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			head->prev = newNode;
			newNode->next = head;
			head = newNode;
		}

		size++;
	}

	void pushBack(int data)
	{
		Node* newNode = new Node(data);

		if (isEmpty())
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail->next = newNode;
			newNode->prev = tail;
			tail = newNode;
		}

		size++;
	}

	int popFront()
	{
		if (isEmpty())
		{
			return -1;
		}
		else if (size == 1)
		{
			Node* target = head;

			head = NULL;
			tail = NULL;
			target->next = NULL;
			target->prev = NULL;

			size--;

			return target->data;
		}
		else
		{
			Node* target = head;
			
			head = head->next;
			head->prev = NULL;
			target->next = NULL;

			size--;
			
			return target->data;
		}
	}

	int popBack()
	{
		if (isEmpty())
		{
			return -1;
		}
		else if (size == 1)
		{
			Node* target = head;

			head = NULL;
			tail = NULL;
			target->next = NULL;
			target->prev = NULL;

			size--;

			return target->data;
		}
		else
		{
			Node* target = tail;

			tail = tail->prev;
			tail->next = NULL;
			target->prev = NULL;

			size--;

			return target->data;
		}
	}

	int getSize()
	{
		return size;
	}

	int front()
	{
		if (isEmpty())
		{
			return -1;
		}
		else
		{
			return head->data;
		}
	}

	int back()
	{
		if (isEmpty())
		{
			return -1;
		}
		else
		{
			return tail->data;
		}
	}
};

int main()
{
	int n, x;
	string s;
	Queue que;

	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		cin >> s;

		switch (s[0])
		{
		case 'p':
			switch (s[5])
			{
			case 'f':
				cin >> x;
				que.pushFront(x);
				break;
			case 'b':
				cin >> x;
				que.pushBack(x);
				break;
			case 'r':
				cout << que.popFront() << "\n";
				break;
			case 'a':
				cout << que.popBack() << "\n";
				break;
			}

			break;
		case 's':
			cout << que.getSize() << "\n";
			break;
		case 'e':
			if (que.isEmpty())
			{
				cout << "1\n";
			}
			else
			{
				cout << "0\n";
			}
			break;
		case 'f':
			cout << que.front() << "\n";
			break;
		case 'b':
			cout << que.back() << "\n";
			break;
		}
	}

	return 0;
}
