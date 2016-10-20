public class String2 {
   public static void main(String[] args) {
      String str = "The lazy fox jumped over the brown dog.";
      String str2 = "a";
      System.out.println(wordEnds(str, str2));
   }
   public static String doubleChar(String str) {
	   String retStr = "";
	   for(int i = 0; i < str.length(); i++)
	   {
	     retStr = retStr + str.charAt(i) + str.charAt(i);
	   }
	   return retStr;
	 }

   public static int countHi(String str) {
	   int a = 0;
	   for(int i = 0; i + 2<= str.length(); i++)
	   {
	     if (str.substring(i,i + 2).contains("hi"))
	       a = a + 1;
	   }
	   return a;
	 }

   public static boolean catDog(String str) {
	   int cat = 0;
	   while(str.indexOf("cat") != -1)
	   {
	     cat = cat + 1;
	     str = str.substring(0,str.indexOf("cat")) + str.substring(str.indexOf("cat") + 3);
	   }
	   while(str.indexOf("dog") != -1)
	   {
	     cat = cat - 1;
	     str = str.substring(0,str.indexOf("dog")) + str.substring(str.indexOf("dog") + 3);
	   }
	   return(cat == 0);
	 }

   public static int countCode(String str) {
	   int a = 0;
	   String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", 
	                      "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	     for(String n : letters)
	     {
	       while (str.indexOf("co" + n + "e") != -1)
	       {
	         a = a + 1;
	         str = str.substring(0,str.indexOf("co" + n + "e")) + str.substring(str.indexOf("co" + n + "e") + 4);
	       }
	     }
	   return a;
	 }

   public static boolean endOther(String a, String b) {
	   a = a.toUpperCase();
	   b = b.toUpperCase();
	   if ( a.length() > b.length() )
	     return(a.substring(a.length()-b.length()).equals(b));
	   return(b.substring(b.length()-a.length()).equals(a));
	 }

   public static boolean xyzThere(String str) {
	   while (str.contains(".xyz"))
	   {
	     str = str.substring(0,str.indexOf (".xyz")) + str.substring (str.indexOf (".xyz") + 4);
	   }
	   return (str.contains ("xyz"));
	     
	 }

   public static boolean bobThere(String str) {
	   for(int i = 0; i + 2 < str.length(); i++)
	   {
	     if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
	       return true;
	   }
	   return false;
	 }

   public static boolean xyBalance(String str) {
	   int a = 1;
	   for( int i = 0; i < str.length(); i ++)
	   {
	     if(str.charAt(i) == 'x')
	       a = 0;
	     if(str.charAt(i) == 'y')
	       a = 1;
	   }
	   return (a == 1);
	 }

   public static String mixString(String a, String b) {
	   String c = "";
	   while(a.length() > 0 && b.length() > 0)
	   {
	     c = c + a.charAt(0) + b.charAt(0);
	     a = a.substring(1);
	     b = b.substring(1);
	   }
	     return c + a + b;
	 }
   public static String repeatEnd(String str, int n) {
	   str = str.substring(str.length() - n);
	   String c = "";
	   while(n != 0)
	   {
	     c = c + str;
	     n = n-1;
	   }
	   return c;
	   
	 }
   public static String repeatFront(String str, int n) {
	   String c = "";
	   while(n != 0)
	   {
	     c = c + str.substring(0,n);
	     n = n-1;
	   }
	   return c;
	   
	 }
   public static String repeatSeparator(String word, String sep, int count) {
	   if(count == 0)
		    return sep;
		  if(count == 1)
		    return word;
		  String c = word;
		  while(count > 1)
		  {
		    c = c + sep + word;
		    count = count - 1;
		  }
		  return c;
		}

   public static boolean prefixAgain(String str, int n) {
	   return(str.substring(n).indexOf(str.substring(0,n)) != -1);
   }

   public static boolean xyzMiddle(String str) {
	   if(str.length() > 3 && (str.substring(1).equals("xyz") || str.substring(0,str.length()-1).equals("xyz")))
		    return true;
		  while(! str.equals("xyz")&& str.length() > 3)
		  {
		    str = str.substring(1);
		    if(str.equals("xyz") || str.substring(0,str.length()-1).equals("xyz"))
		      return true;
		    str = str.substring(0, str.length()-1);
		    if(str.equals("xyz") || str.substring(0,str.length()-1).equals("xyz"))
		      return true;
		  }
		  return(str.equals("xyz"));
		}

   public static String getSandwich(String str) {
	   if(str.contains("bread"))
		    str = str.substring(str.indexOf("bread") + 5);
		  String temp = str;
		  int a = -1;
		  int b = 0;
		  while(temp.contains("bread"))
		  {
		    a = temp.indexOf("bread");
		    temp = temp.substring(a+5);
		    b = b + 5;
		  }
		  if(a >= 0)
		     return str.substring(0,a + b - 5);
		  return "";
		}

   public static boolean sameStarChar(String str) {
	   for(int i = 1; i < str.length() - 1; i++)
	   {
	     if(str.charAt(i) == '*' && ! (str.charAt(i-1) == str.charAt (i + 1)))
	       return false;
	   }
	   return true;
	 }

   public static String oneTwo(String str) {
	   str = str.substring(0,str.length() - str.length()%3);
	   String ret = "";
	   for(int i = 0; i < str.length(); i = i + 3)
	   {
	     ret = ret + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
	   }
	   return ret;
	 }

   public static String zipZap(String str) {
	   /*  String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
       			"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			for(String n : letters)
			{
				while(str.contains("z" + n + "p"))
					str = str.substring(0,str.indexOf("z" + n + "p") + 1) + str.substring(str.indexOf("z" + n + "p") + 2);
			}
			return str; */
for(int i = 1; i < str.length() - 1; i ++)
{
if(str.charAt(i-1) == 'z' && str.charAt(i + 1) == 'p')
str = str.substring(0,i) + str.substring(i+1);
}
return str;
}

   public static String starOut(String str) {
	   if(str.length() <= 2 && str.contains("*"))
		    return "";
		  if(str.indexOf("*") == 0)
		    str = "&" + str.substring(2);
		  for(int i = 1; i < str.length() - 1; i++)
		  {
		    if(str.contains("*") == false)
		      break;
		    if(str.indexOf("*") == i)
		    {
		      if(str.charAt(i + 1) == '*')
		        str = str.substring(0,i - 1) + "&&" + str.substring(i+1);
		      else
		        str = str.substring(0,i - 1) + "&&&" + str.substring(i+2);
		    }
		  }
		  while(str.contains("&"))
		  {
		    str = str.substring(0,str.indexOf("&")) + str.substring(str.indexOf("&") + 1);
		  }
		  if(str.contains("*"))
		    str = str.substring(0,str.length()-2);
		  return str;
		}

   public static String plusOut(String str, String word) {
	   String ret = "";
	   while(str.length() != 0)
	   {
	     if(str.indexOf(word) != 0)
	     {
	       ret = ret + "+";
	       str = str.substring(1);
	     }
	     else
	     {
	       ret = ret + word;
	       str = str.substring(word.length());
	     }
	   }
	   return ret;
	 }
   public static String wordEnds(String str, String word) {
	   int strLen = str.length();
	   int wordLen = word.length();
	   String ret = "";
	   String temp = "";
	   for (int i = 0; i < strLen-wordLen+1; i++)
	   {
	     temp = str.substring(i,i+wordLen);
	     if (i > 0 && temp.equals(word))
	       ret += str.substring(i-1,i);
	     if (i < strLen-wordLen && temp.equals(word))
	       ret += str.substring(i+wordLen,i+wordLen+1);
	   }
	   return ret;
	 }

}
