package TutorialsPoint;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
		public static void main(String[] args)
		{
			
			PriorityQueue <String > pq1 = new PriorityQueue<String>(10);
					
			pq1.add("Mokter");
			pq1.add("Hossain");
			pq1.add("Mosaddek");
			pq1.add("Mahdi");
			pq1.add("Muhaimin");
			pq1.add("Munim");
			
			
			for (String q: pq1)
			{
				System.out.println(q);
			}
			System.out.println("After calling the remove()..");

			while (pq1.size() != 0)
			{
				System.out.println(pq1.remove());
			}
			
			for (String q: pq1)
			{
				System.out.println(q);
			}
		}
	}
