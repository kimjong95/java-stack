package stack.structure;

public class StackTest {
	//
	public static void main(String args[]) {
		//
		MyStack stack = new MyStack();
		
		stack.push("Test1");
		stack.push("Test2");
		stack.push("Test3");
		stack.push("Test4");
		
		System.out.println("[�⺻�� push(element) ��");
		System.out.print("���� stack �� ����� ���� :");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.peek() + ",");
		}
		System.out.println("�̰� size �� (" + stack.size() + ") �Դϴ�.");
		System.out.println("============================================================");
		
		System.out.println(stack.search("Test4"));
		System.out.println(stack.search("Test5"));
		
	}
}
