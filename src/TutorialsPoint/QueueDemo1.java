
package TutorialsPoint;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class QueueDemo1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Queue <Integer> que = new ArrayBlockingQueue<Integer> (5);
		
			que.add(1);
			que.add(45);
			que.add(45);
			que.add(45);
			
			
			for (int i: que)
			{
				System.out.println(i);
			}
			
			System.out.println("Now, let us see the pop operation..");
			
			que.remove();

			for (int i: que)
			{
				System.out.println(i);
			}
			
			System.out.println(que.isEmpty());
			System.out.println(que.size());
			System.out.println(que.peek());

			while (que.size() != 0)
			{
			que.remove();
			}
			
			for (int i: que)
			{
				System.out.println(i);
			}
			
			System.out.println(que.isEmpty());
			System.out.println(que.size());
			System.out.println(que.peek());

	}
}
