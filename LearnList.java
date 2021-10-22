package Com.Programs;
import java.util.*;


public class LearnList {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(50);
		list.add(59);
		list.add(56);
	ArrayList<String> list1=new ArrayList<String>();//Creating arraylist  
	  list1.add("Mango");   
	  list1.add("Apple");    
	  list1.add("Banana");    
	  list1.add("Grapes"); 
	  System.out.println("List : "+list1);
//		  //Traversing list through Iterator  
//		  Iterator<String> itr=list1.iterator();//getting the Iterator  
//		  while(itr.hasNext()){//check if iterator has the elements  
//		   System.out.println(itr.next());//printing the element and move to next  
//		  }  
		Set<Integer> h1=new HashSet<Integer>(list);
			System.out.println("Set: "+h1);
		Map<Integer,String> map=new HashMap<>();
		map.put(11, "Cat");
		map.put(22, "Cow");
		map.put(33, "Lion");
		map.put(44, "Tiger");
		map.put(22, "Elephant");//22 key Same but Value Replaced
		System.out.println("Map :"+map);
		Queue<Integer> queue=new ArrayDeque<>(list);
		System.out.println("Queue: "+queue);
		System.out.println("Queue Peek : "+queue.peek());
		System.out.println("Queue isEmpty : "+queue.isEmpty());
		queue.poll();
		queue.add(57);
		Iterator<Integer> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println("Values "+itr.next());
		}
		
//		for(int i=0;i<h1.size();i++)
//		{
//			System.out.println("The List coverted to Set "+h1);
//		}
	}

}
