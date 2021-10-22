package Com.Programs;
import java.util.*;
import java.util.Scanner;



public class FindDuplicatesCharacterCountUsingMap {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The String : ");
	String str=sc.nextLine();
	
	char[] chars=str.toCharArray();
	Map<Character,Integer> map=new HashMap<>();
	for(Character c :chars)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		{
			map.put(c, 1);
		}
	}
	Set<Character> keys=map.keySet();
	for(Character ch: keys)
	{
		if(map.get(ch)>1)
		{
		System.out.println("Character "+ch+" : "+map.get(ch));
		}
	}
	
	
	
	
}
}
