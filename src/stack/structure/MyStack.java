package stack.structure;

public class MyStack implements MyStringStack{
	//
	private int top;
	private String[] arrayStack;
	private static int defualt_size = 10;

	public MyStack() {
		top = -1;
		arrayStack = new String[defualt_size];
	}
	
	public MyStack(int size) {
		top = -1;
		arrayStack = new String[size];
	}
	
	@Override
	public String push(String element) {
		// MyStack�� element ���� �� ��(top)�� ���Եȴ�.
		
		if(isFull()) {
			arrayStack = raisedArray(arrayStack);
		}
		
		arrayStack[++top] = element;
		return element;
	}

	@Override
	public String pop() {
		// MyStack�� �� ��(top)�� element ��ȯ �� ����.
		String findElement = peek();
		top--;
		
		return findElement;
	}

	@Override
	public String peek() {
		//  MyStack�� �� ��(top)�� element ��ȯ.
		return arrayStack[top];
	}

	@Override
	public boolean empty() {
		// MyStack�� ����ִ��� �˻�.
		return (top==-1);
	}

	@Override
	public int size() {
		// stack�� ������ ��ȯ.
		return top+1;
	}

	@Override
	public int search(String element) {
		// element�� ��ġ�� ��ȯ -1�̸� ����.
		
		int index = -1;
		
		for(int i = 1; i<size()+1; i++) {
			if(element == arrayStack[size()-i]) {
				index = i-1;
				break;
			}
		}
		return index;
	}
	
	private String[] raisedArray(String[] array) {
		// stack�� ���Ǵ� �迭�� �� ����� ũ�⸦ 2��� �÷���
		String[] tempArray = new String[arrayStack.length * 2];
		for (int i = 0; i < arrayStack.length; i++) {
			tempArray[i] = arrayStack[i];
		}
		return tempArray;
	}
	
	private boolean isFull() {
		// �迭�� �� á���� �˻�
		boolean isFull = false;
		if(arrayStack.length == (top+1)) {
			isFull = true;
		}
		
		return isFull;
	}
}
