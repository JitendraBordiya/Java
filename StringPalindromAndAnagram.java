import java.util.*;
public class StringPalindromAndAnagram
{
  public static void check ()
  {
    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter a String");
    String s1 = sc.nextLine ();
    String s2 = new String (s1);
    String rev = "";
    for (int i = s1.length () - 1; i >= 0; i--)
      {
	rev = rev + s1.charAt (i);
      }
    System.out.println (s2.equals (rev) ? "Palindrom" : "not Palindrom");



  }
  public static void check1 ()
  {
      Scanner sc = new Scanner (System.in);
     System.out.println ("Enter First String");
    String s1 =sc.nextLine();
    System.out.println ("Enter Second String");
    String s2 =   sc.nextLine() ;
    s1.toLowerCase ();
    s2.toLowerCase ();
    char[] ch1 = s1.toCharArray ();
    char[] ch2 = s2.toCharArray ();
     Arrays.sort(ch1);
     Arrays.sort(ch2);
     String s3=new String(ch1);
     String s4=new String(ch2);
     System.out.println (s3.equals (s4) ? "Anagram" : "not Anagram");
 }
  public static void main (String[]args)
  {
    System.out.println("-------------------------------------------");
    System.out.println("String Palindrome Prorgram");
    System.out.println("-------------------------------------------");
    StringPalindromAndAnagram.check();
     System.out.println("-------------------------------------------");
System.out.println("String Anagram Prorgram");
System.out.println("-------------------------------------------");
    StringPalindromAndAnagram.check1();
System.out.println("-------------------------------------------");
    System.out.println ("END");
  }
}
