public class Warmup2 {
   public static void main(String[] args) {
      String str = "The lazy fox jumped over the brown dog.";
      System.out.println(stringYak(str));
   }
   public static String stringTimes(String str, int n) {
	   String myStr = "";
	   for (int counter = n; counter > 0; counter = counter - 1)
	   {
	     myStr = myStr + str;
	   }
	     return myStr;
	 }
   public static String frontTimes(String str, int n) {
	   String retStr = "";
	   String myStr = "";
	   if (str.length() < 3)
	     myStr = str;
	   else
	     myStr = str.substring(0,3);
	   for (int counter = n; counter > 0; counter = counter - 1)
	     retStr = retStr + myStr;
	   return retStr;
	 }

   public static int countXX(String str) {
	   int n = 0;
	   while (str.indexOf("xx") != -1)
	   {
	     n = n + 1;
	     str = str.substring(0,str.indexOf("xx")) + str.substring(str.indexOf("xx") + 1);
	   }
	   return n;
	 }

   public static boolean doubleX(String str) {
	   return (str.indexOf("x") == str.indexOf("xx") & str.indexOf("x") != -1);
   }

   public static String stringBits(String str) {
	   String myStr = "";
	   for (int i = 0; i < str.length(); i = i + 2)
	     myStr = myStr + str.charAt(i);
	   return myStr;
	 }

   public static String stringSplosion(String str) {
	   String myStr = "";
	   for (int i = 0; i <= str.length(); i = i+1)
	     myStr = myStr + str.substring(0,i);
	   return myStr;
	 }

   public static int last2(String str) {
	   if (str.length() < 2)
		    return 0;
		  String end = str.substring(str.length()-2);
		  int n = 0;
		  if (end.charAt(0) == end.charAt(1))
		  {
		    while (str.indexOf(end) != str.length()-2)
		    {
		      str = str.substring(0,str.indexOf(end)) + str.substring(str.indexOf(end) + 1);
		      n = n + 1;
		    }
		  }
		  else
		  {
		    while (str.indexOf(end) != str.length()-2)
		    {
		      str = str.substring(0,str.indexOf(end)) + str.substring(str.indexOf(end) + 2);
		      n = n + 1;
		    }
		  }
		  return n;
		}

   public static int arrayCount9(int[] nums) {
	   int count = 0;
	   for (int n : nums)
	   {
	     if(n == 9)
	       count = count + 1;
	   }
	   return count;
	 }

   public static boolean arrayFront9(int[] nums) {
	   int c = 0;
	   for (int n : nums)
	   {
	      if(n == 9 && c < 4)
	        return true;
	     c = c + 1;
	   }
	   return false;
	 }

   public static boolean array123(int[] nums) {
	   boolean a = false;
	   boolean b = false;
	   boolean c = false;
	   for(int n : nums)
	   {
	     if (n == 1)
	       a = true;
	     if (n == 2)
	       b = true;
	     if (n == 3)
	       c = true;
	   }
	   return ( a && b && c);
	 }

   public static int stringMatch(String a, String b) {
	   if(a.length() < 2 || b.length() < 2)
		    return 0;
		  if((a.length() == 2 && a.equals(b.substring(0,2))) || (b.length() == 2 && b.equals(a.substring(0,2))))
		    return 1;
		  int c = 0;
		  if(b.length() <= a.length())
		  {
		    for(int i = 2; i <= b.length(); i = i + 1)
		    {
		      if(b.substring(i-2,i).equals(a.substring(i-2,i)))
		        c = c + 1;
		    }
		  }
		  else
		  {
		    for(int i = 2; i <= a.length(); i = i + 1)
		    {
		      if(a.substring(i-2,i).equals(b.substring(i-2,i)))
		        c = c + 1;
		    }
		  }
		  return c;
		}
   public static String stringX(String str) {
	   for(int i = 1; i + 1 < str.length(); i = i + 1)
	   {
	     while(str.charAt(i) == 'x')
	       str = str.substring(0,i) + str.substring(i+1);
	   }
	   return str;
	 }

   public static String altPairs(String str) {
	   String retStr = "";
	   if(str.length() < 2)
	     return str;
	   for(int i = 0; i < str.length(); i = i + 4)
	   {
	     if(i + 1 == str.length())
	       retStr = retStr + str.substring(i);
	     else
	       retStr = retStr + str.substring(i,i+2);
	   }
	   return retStr;
	 }
   public static String stringYak(String str) {
	   while(str.indexOf("yak") != -1)
		    str = str.substring(0,str.indexOf("yak")) + str.substring(str.indexOf("yak") + 3);
		  return str;
		}

   public static int array667(int[] nums) {
	   int a = 0;
	   int c = 0;
	   for(int n : nums)
	   {
	     if((n==6 || n == 7) && a == 6)
	       c = c + 1;
	     a = n;
	   }
	   return c;
	 }
   public static boolean noTriples(int[] nums) {
	   int a = 1;
	   int b = 0;
	   int c = 0;
	   for(int n : nums)
	   {
	     if(n == b && b == c)
	       return false;
	     if(a%2 == 1)
	       b = n;
	     else
	       c = n;
	     a = a + 1;
	   }
	   return true;
	 }

   public static boolean has271(int[] nums) {
	   int a = 1;
	   int b = 0;
	   int c = 0;
	   for(int n : nums)
	   {
	     if((c == b + 5 && Math.abs(b - n - 1) <= 2) || (b == c + 5 && Math.abs(c - n - 1) <= 2))
	       return true;
	     if(a%2 == 1)
	       b = n;
	     else
	       c = n;
	     a = a + 1;
	   }
	   return false;
	 }
   
}