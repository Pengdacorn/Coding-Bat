public class Warmup1 {
   public static void main(String[] args) {
      String str = "The lazy fox jumped over the brown dog.";
      int n = 2;
      System.out.println(everyNth(str, n));
   }
  public static boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday && ! vacation)
  {
    return false;
  }
  if (weekday && vacation)
  {
    return true;
  }
  else
    return true;
}
  public static boolean monkeyTrouble(boolean a, boolean b) {
	  if(a == b)
	    return true;
	  else
	    return false;
	}
  public static int sumDouble(int a, int b) {
	  if (a == b)
	    return (a + b) * 2;
	  else
	    return a + b;
	}
  public int diff21(int n) {
	  if (n < 21) 
	    return Math.abs(n-21);
	  else
	    return Math.abs(n-21) *2;
	}
  public static boolean parrotTrouble(boolean talking, int hour) {
	  if ( (hour < 7 || hour > 20) && talking)
	    return true;
	  else
	    return false;
	}
  public static boolean makes10(int a, int b) {
		  if ((a == 10 || b == 10) || a + b == 10)
		    return true;
		  return false;
		}
  public static boolean nearHundred(int n) {
	  if (Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10)
	    return true;
	  return false;
	}
  public static boolean posNeg(int a, int b, boolean negative) {
	  if (negative)
	  {
	    if (a * b > 0 && (a < 0 || b < 0))
	      return true;
	    return false;
	  }
	  else
	  {
	    if (a * b > 0)
	      return false;
	    return true;
	  }
	}
  public static String notString(String str) {
	  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;

		}
  public static String missingChar(String str, int n) {
	  return str.substring(0,n) + str.substring(n+1);
  }
  public static String frontBack(String str) {
	  if (str.length() < 2)
		    return str;
		  String front = str.substring(0,1);
		  String end = str.substring(str.length()-1);
		  str = str.substring(1, str.length()-1);
		  return end + str + front;
		}
  public static String front3(String str) {
	  if (str.length() < 3)
		    return str + str + str;
		  return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
		}
  public static String backAround(String str) {
	  return str.substring(str.length()-1) + str + str.substring(str.length()-1);
  }
  public static boolean or35(int n) {
	  if (n%3 == 0 || n%5 == 0)
		    return true;
		  return false;
		}
  public static String front22(String str) {
	  if (str.length() < 2)
		    return str + str + str;
		  return str.substring(0,2) + str + str.substring(0,2);
		}
  public static boolean startHi(String str) {
	  return (str.indexOf("hi")==0);
  }
  public static boolean icyHot(int a, int b) {
	  return ((a>100 && b<0) || (a<0 && b>100));
  }
  public static boolean in1020(int a, int b) {
	  return (a/10 == 1 || a ==20 || b/10 == 1 || b == 20);
  }
  public static boolean hasTeen(int a, int b, int c) {
	  return ((a-13<=6&&a-13>=0)||(b-13<=6&&b-13>=0)||(c-13<=6&&c-13>=0));
  }
  public static boolean loneTeen(int a, int b) {
	  return ((a-13<=6&&a-13>=0)&&(b-13>6||b-13<0)||(b-13<=6&&b-13>=0)&&(a-13>6||a-13<0));
  }
  public static String delDel(String str) {
	  if (str.indexOf("del") == 1)
		    return str.substring(0,str.indexOf("del")) + str.substring(str.indexOf("del") + 3);
		  return str;
		}
  public static boolean mixStart(String str) {
	  if (str.length() < 3)
		    return false;
		  return (str.charAt(1) == 'i' && str.charAt(2) == 'x');
		}
  public static String startOz(String str) {
	  String ans = "";
	  if (str.length() > 0 && str.charAt(0) == 'o')
	    ans = ans + "o";
	  if (str.length() > 1 && str.charAt(1) == 'z')
	    ans = ans + "z";
	  return ans;
	}
  public static int intMax(int a, int b, int c) {
	  return (Math.max(Math.max(a,b),c));
  }
  public static	int close10(int a, int b) {
	  if (Math.abs(a-10) < Math.abs(b-10))
		    return a;
		  if (Math.abs(b-10) < Math.abs(a-10))
		    return b;
		  return 0;
		}
  public static	boolean in3050(int a, int b) {
	  return ((a<=40 && a>=30 && b<=40 && b>=30) || (a<=50 && a>=40 && b<=50 && b>=40));
  }
  public static	int max1020(int a, int b) {
	  if (a/10 != 1 && a != 20 && (b/10 == 1 || b == 20))
		    return b;
		  if (b/10 != 1 && b != 20 && (a/10 == 1 || a == 20))
		    return a;
		  if ((a/10 == 1 || a == 20) && (b/10 == 1 || b == 20))
		    return Math.max(a,b);
		  return 0;
		}
  public static	boolean stringE(String str) {
	  int numCount = 0;
	  while (str.contains("e"))
	  {
	    str = str.substring(0,str.indexOf("e")) + str.substring(str.indexOf("e")+1);
	    numCount = numCount + 1;
	  }
	  return (numCount >= 1 && numCount <=3);
	}
  public static	boolean lastDigit(int a, int b) {
	  return (a%10 == b%10);
  }
  public static String endUp(String str) {
	  if (str.length() < 4)
		    return str.toUpperCase();
		  return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
		}
  public static String everyNth(String str, int n) {
	  /*  int len = str.length();
	  String newStr = "";
	  while (len > 0)
	  {
	    newStr = newStr + str.charAt(str.length()-len);
	    len = len - n;
	  }*/
	  String myStr = "";
	  for (int i=0; i < str.length();  i = i+n)
	  {
	    myStr += str.charAt(i);
	  }
	  return myStr;
	}

}