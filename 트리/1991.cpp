#include <iostream>

using namespace std;

class Node
{
public:
	char data;
	Node * left;
	Node * right;

	Node (char givenData)
	{
		data = givenData;
	}
};

Node * addr[30];
int idx = 0;

class Tree
{
private:
	Node * root;
	int size;

public:
	Tree ()
	{
		root = NULL;
		size = 0;
	}

	void push(char node, char left, char right)
	{
		Node * target = NULL;
		Node * leftNode = NULL;
		Node * rightNode = NULL;

		for (int i = 0; i < idx; i++)
		{
			if (addr[i]->data == node)
			{
				target = addr[i];
			}

			if (addr[i]->data == left)
			{
				leftNode = addr[i];
			}

			if (addr[i]->data == right)
			{
				rightNode = addr[i];
			}
		}

		if (target == NULL)
		{
			target = new Node(node);
			addr[idx] = target;
			idx++;
			size++;
		}

		if (left == '.')
		{
			leftNode = NULL;
		}
		else if (leftNode == NULL)
		{
			leftNode = new Node(left);
			addr[idx] = leftNode;
			idx++;
			size++;
		}

		if (right == '.')
		{
			rightNode = NULL;
		}
		else if (rightNode == NULL)
		{
			rightNode = new Node(right);
			addr[idx] = rightNode;
			idx++;
			size++;
		}

		target->left = leftNode;
		target->right = rightNode;

		if (node == 'A')
		{
			root = target;
		}
	}

	void print()
	{
		front(root);

		cout << endl;

		mid(root);

		cout << endl;

		back(root);

		cout << endl;
	}

	void front(Node * now)
	{
		cout << now->data;

		if (now->left != NULL)
		{
			front(now->left);
		}
		
		if (now->right != NULL)
		{
			front(now->right);
		}
	}

	void mid(Node * now)
	{
		if (now->left != NULL)
		{
			mid(now->left);
		}

		cout << now->data;

		if (now->right != NULL)
		{
			mid(now->right);
		}
	}

	void back(Node * now)
	{
		if (now->left != NULL)
		{
			back(now->left);
		}

		if (now->right != NULL)
		{
			back(now->right);
		}

		cout << now->data;
	}
};

int main()
{
	Tree x;
	int n;
	char node, left, right;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> node >> left >> right;

		x.push(node, left, right);
	}

	x.print();

	return 0;
}
