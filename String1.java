public class String1 {
   public static void main(String[] args) {
      String str = "The lazy fox jumped over the brown dog.";
      System.out.println(withoutX2(str));
   }
   public static String helloName(String name) {
	   String answer;
	   
	   answer = "Hello " + name + "!";
	   
	   return answer;
	 }

   public static String makeAbba(String a, String b) {
	   String answer;
	   answer = a + b + b + a;
	   return answer;
	 }

   public static String makeTags(String tag, String word) {
	   return "<" + tag + ">" + word + "<" + "/" + tag + ">";
   }

   public static String makeOutWord(String out, String word) {
	   
	   String front = out.substring(0,2); // hello
	   String middle = word;
	   String end = out.substring(2,4);
	   
	   String answer = front + middle + end;
	   return answer;
	 }

   public static String extraEnd(String str) {
	   return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
   }

   public static String firstTwo(String str) {
	   if(str.length() < 2)
		   return str;
		   else
		   return str.substring(0,2);
		 }

   public static String firstHalf(String str) {
	   int length = str.length();
	   int halflength = length/2;
	   
	   String answer = str.substring(0,halflength);
	   return answer;
	 }

   public static String withoutEnd(String str) {
	   String sub1 = str.substring(1);
	   String sub2 = sub1.substring(0,(sub1.length()-1));
	   return sub2;
	 }

   public static String comboString(String a, String b) {
	   if (a.length() > b.length())
		   return b + a + b;
		   else
		   return a + b + a;
		 }

   public static String nonStart(String a, String b) {
	   String subA = a.substring(1);
	   String subB = b.substring(1);
	   return subA + subB;
	 }
   public static String left2(String str) {
	   String left = str.substring(0,2);
	   String right = str.substring(2);
	   return right + left;
	 }

   public static String right2(String str) {
	    String right = str.substring(str.length()-2);
	    String left = str.substring(0,str.length()-2);
	    return right + left;
	  }

   public static String theEnd(String str, boolean front) {
	   if (front == true)
		   return str.substring(0,1);
		   else
		   return str.substring(str.length()-1);
		 }

   public static String withouEnd2(String str) {
	   if (str.length() > 1)
		   return str.substring(1,str.length()-1);
		   else
		   return "";
		 }

   public static String middleTwo(String str) {
	   return str.substring (str.length()/2 - 1, str.length()/2 + 1);
   }

   public static boolean endsLy(String str) {
	    int len = str.length();
	    if (len < 2)
	    return false;
	    return (str.substring(len - 2).equals("ly"));
	}
   public static String nTwice(String str, int n) {
	   return str.substring(0,n) + str.substring(str.length()-n);
   }

   public static String twoChar(String str, int index) {
		if (index<0)
	    {
	      return str.substring(0,2);
	    }
	    else
	    {
	      if (str.length()>=index+2)
	      {
	        return str.substring(index, index + 2);
	      }
	      else
	      {
	        return str.substring(0,2);
	      }
	    }
	}  
   public static String middleThree(String str) {
	   int begAndEnd = str.length()/2 - 1;
	   return str.substring (begAndEnd, str.length()-begAndEnd);
	 }

   public static boolean hasBad(String str) {
	   if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1)
	   {
	     return true;
	   }
	   else
	   {
	     return false;
	   }
	 }

   public static String atFirst(String str) {
	   if (str.length()>=2)
	   {
	     return str.substring(0,2);
	   }
	   else
	   {
	     if (str.length()==1)
	     {
	       return str + "@";
	     }
	     else
	     {
	       return "@@";
	     }
	   }
	 }

   public static String lastChars(String a, String b) {
	   if (b.length() > 0 && a.length() > 0)
	   {
	     return a.substring(0,1) + b.substring(b.length()-1);
	   }
	   else
	   {
	     if (a.length() > 0 && b.length() == 0)
	     {
	       return a.substring(0,1) + "@";
	     }
	     else
	     {
	       if (b.length() > 0 && a.length() == 0)
	       {
	         return "@" + b.substring(b.length()-1);
	       }
	       else
	       {
	         return "@@";
	       }
	     }
	   }
	 }

   public static String conCat(String a, String b) {
	   if (a.length() > 0 && b.length() > 0)
	   {
	 	if (a.charAt(a.length()-1) == b.charAt(0))
	   	{
	     	return a + b.substring(1);
	   	}
	   	else
	   	{
	   	  return a + b;
	   	}
	   }
	   else
	   {
	     return a + b;
	   }
	 }
   public static String lastTwo(String str) {
	   if (str.length() >= 2)
	   {
	     return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
	   }
	   else
	   {
	     return str;
	   }
	 }

   public static String seeColor(String str) {
	   if (str.indexOf("red") == 0)
	   {
	     return "red";
	   }
	   else
	   {
	     if (str.indexOf("blue") == 0)
	     {
	       return "blue";
	     }
	     else
	     {
	       return "";
	     }
	   }
	 }
   public static boolean frontAgain(String str) {
	   if (str.length() >=2 && str.substring(0,2).equals(str.substring(str.length()-2)) == true)
		      return true;
		  else
		      return false;

		}
   public static String minCat(String a, String b) {
	   if (a.length() == b.length())
	   {
	     return a.concat(b);
	   }
	   else
	   {
	     if (a.length() >= b.length())
	     {
	       return a.substring(a.length()-b.length()) + b;
	     }
	     else
	     {
	       return a + b.substring(b.length()-a.length());
	     }
	   }
	 }

   public static String extraFront(String str) {
	   if (str.length() < 2)
	   {
	     return str + str + str;
	   }
	   else
	   {
	     return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	   }
	 }

   public static String without2(String str) {
	   if (str.length() < 2)
	   {
	     return str;
	   }
	   else
	   {
	     if (str.substring(0,2).equals(str.substring(str.length()-2)))
	     {
	       return str.substring(2);
	     }
	     else
	     {
	       return str;
	     }
	   }
	 }

   public static String deFront(String str) {     
	   if (str.indexOf("b") == 1 && str.indexOf("a") == 0)
	   {
	     return "ab" + str.substring(2);
	   }
	   else
	   {
	     if (str.substring(1).indexOf("b") == 0)
	     {
	 	  return "b" + str.substring(2);
	     }
	     else
	     {
	       if (str.indexOf("a") == 0)
	       {
	         return "a" + str.substring(2);
	       }
	       else
	       {
	         return str.substring(2);
	       }
	     }
	   }
	 }
   public static String startWord(String str, String word) {
	   if (str.length() < word.length())
		    return "";
		  if (str.substring(1).indexOf(word.substring(1)) == 0)
		  {
		    return str.substring(0,word.length());
		  }
		  else
		  {
		    return "";
		  }
		}

   public static String withoutX(String str) {
	   if (str.length() > 0 && str.charAt(0) == 'x')
		    str = str.substring(1);
		  if (str.length() > 0 && str.charAt(str.length()-1) == 'x')
		    str = str.substring(0,str.length()-1);
		  return str;
		}

   public static String withoutX2(String str) {
	   if (str.indexOf('x') == 0)
		    str = str.substring(1);
		  else
		  {
		    if (str.indexOf('x') == 1)
		    str = str.charAt(0) + str.substring(2);
		  }
		  if (str.indexOf('x') == 0)
		    str = str.substring(1);
		  return str;
		}

   
}