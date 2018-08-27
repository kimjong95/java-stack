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
		
		System.out.println("[기본값 push(element) 후");
		System.out.print("현재 stack 에 저장된 값은 :");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.peek() + ",");
		}
		System.out.println("이고 size 는 (" + stack.size() + ") 입니다.");
		System.out.println("============================================================");
		
		System.out.println(stack.search("Test4"));
		System.out.println(stack.search("Test5"));
		
	}
}
