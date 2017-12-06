package TutorialsPoint;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stk = new Stack<Integer> ();

		stk.push(23);
		stk.push(34);
		stk.push(45);

		for (int i: stk)
		{
			System.out.println(i);
		}

		System.out.println("Now, let us see the pop operation..");

		try {
			stk.pop();
			stk.pop();
			stk.pop();
			stk.pop();

		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(stk.isEmpty());
		System.out.println(stk.size());
		System.out.println(stk.peek());

		for (int i: stk)
		{
			System.out.println(i);
		}

		while (stk.size() >= 1)
		{
			stk.pop();
		}

		System.out.println(stk.isEmpty());
		System.out.println(stk.size());
		System.out.println(stk.peek());
		
	}

}
