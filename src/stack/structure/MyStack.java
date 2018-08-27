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
		// MyStack에 element 삽입 맨 위(top)에 삽입된다.
		
		if(isFull()) {
			arrayStack = raisedArray(arrayStack);
		}
		
		arrayStack[++top] = element;
		return element;
	}

	@Override
	public String pop() {
		// MyStack의 맨 위(top)의 element 반환 후 제거.
		String findElement = peek();
		top--;
		
		return findElement;
	}

	@Override
	public String peek() {
		//  MyStack의 맨 위(top)의 element 반환.
		return arrayStack[top];
	}

	@Override
	public boolean empty() {
		// MyStack이 비어있는지 검사.
		return (top==-1);
	}

	@Override
	public int size() {
		// stack의 사이즈 반환.
		return top+1;
	}

	@Override
	public int search(String element) {
		// element의 위치를 반환 -1이면 없음.
		
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
		// stack에 사용되는 배열이 꽉 찬경우 크기를 2배로 늘려줌
		String[] tempArray = new String[arrayStack.length * 2];
		for (int i = 0; i < arrayStack.length; i++) {
			tempArray[i] = arrayStack[i];
		}
		return tempArray;
	}
	
	private boolean isFull() {
		// 배열이 꽉 찼는지 검사
		boolean isFull = false;
		if(arrayStack.length == (top+1)) {
			isFull = true;
		}
		
		return isFull;
	}
}
