public class IndexTester
{
   public static void main(String[] args)
   {
      System.out.println(StringIndex.indexOf("Mississippi", "sip"));
      System.out.println("Expected: 6");
      System.out.println(StringIndex.indexOf("Mississippi", "Miss"));
      System.out.println("Expected: 0");
      System.out.println(StringIndex.indexOf("shoe", "oe"));
      System.out.println("Expected: 2");
      System.out.println(StringIndex.indexOf("shoe", "foot"));
      System.out.println("Expected: -1");
   }
}
