
public class Logic1 {
	public static void main(String[] args) {
		int a = 123;
		int b = 789;
		System.out.println(sumLimit(a,b));
	}
	public static boolean cigarParty(int c, boolean b) {
		  if (b)
		  {
		    if (c >= 40)
		    {
		      return true;
		    }
		  }
		  else
		  {
		    if (c <= 60)
		    {
		      if (c >= 40)
		      {
		        return true;
		      }
		    }
		  }
		  return false;
		}

	public static int dateFashion(int you, int date) {
		  if ((you >= 8 || date >= 8) && (you > 2 && date > 2))
			    return 2;
			  if (you <= 2 || date <= 2)
			    return 0;
			  return 1;
			}

	public static boolean squirrelPlay(int temp, boolean b) {
		  if (b)
		  {
		    if (temp <= 100 && temp >= 60)
		      return true;
		  }
		  if (temp <= 90 && temp >= 60)
		      return true;
		  return false;
		}
	public static int caughtSpeeding(int speed, boolean b) {
		  if (b)
			    speed = speed - 5;
			  if (speed > 80)
			    return 2;
			  if (speed > 60)
			    return 1;
			  return 0;
			}

	public static int sortaSum(int a, int b) {
		  if (a + b <= 20 && a + b >=10)
			    return 20;
			  return a + b;
			}
	public static String alarmClock(int day, boolean v) {
		  if (v && (day == 0 || day == 6))
			  return "off";
			  if (v)
			    return "10:00";
			  if (6 > day && day > 0)
			    return "7:00";
			  return "10:00";
			}

	public static boolean love6(int a, int b) {
		  if (a == 6 || b == 6 || a + b == 6 || Math.abs(a-b) == 6)
			    return true;
			  return false;
			}

	public static boolean in1To10(int n, boolean b) {
		  if (!b)
		  {
		    if (n <= 10 && n >= 1)
		      return true;
		    if (n >= 10 || n <= 1)
		      return false;
		  }
		  if (n < 10 && n > 1)
		    return false;
		    return true;
		}

	public static boolean specialEleven(int n) {
		  if (n%11 == 0 || n%11 == 1)
			    return true;
			  return false;
			}

	public static boolean more20(int n) {
		  if (n%20 == 1 || n%20 == 2)
			    return true;
			  return false;
			}

	public static boolean old35(int n) {
		  if ((n%3 == 0 || n%5 == 0) && n%15 != 0)
			    return true;
			  return false;
			}
	public static boolean less20(int n) {
		  if (n%20 == 18 || n%20 == 19)
			    return true;
			  return false;
			}
	public static boolean nearTen(int n) {
		  if (n%10 <= 2 || n%10 >= 8)
			    return true;
			  return false;
			}
	public static int teenSum(int a, int b) {
		  if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13))
			    return 19;
			  return a + b;
			}

	public static boolean answerCell(boolean a, boolean b, boolean c) {
		  if (c)
			    return false;
			  if (b)
			    return true;
			  if (a)
			    return false;
			  return true;
			}
	public static int teaParty(int t, int c) {
		  if ((t >= 2*c || c >= 2*t) && t >= 5 && c >= 5)
			    return 2;
			  if (t < 5 || c < 5)
			    return 0;
			  return 1;
			}

	public static String fizzString(String str) {
		  String f = "";
		  String b = "";
		  char cf = str.charAt(0);
		  char cb = str.charAt(str.length()-1);
		  if (cf == 'f')
		  {
		    str = "";
		    f = "Fizz";
		  }
		  if (cb == 'b')
		  {
		    str = "";
		    b = "Buzz";
		  }
		  return str + f + b;
		}

	public static String fizzString2(int n) {
		  String str = ""+n;
		  if (n % 3 == 0 || n % 5 == 0)
		  {  
		  if (n%3 == 0)
		    str = "Fizz!";
		  if (n%5 == 0)
		    str = "Buzz!";
		  if (n%15 == 0)
		    str = "FizzBuzz!";
		  return str;
		  }
		  return str + "!";
		}

	public static boolean twoAsOne(int a, int b, int c) {
		  if (a + b == c || b + c == a || a + c == b)
			    return true;
			  return false;
			}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		  if (bOk)
		  {
		    if (c > b)
		    return true;
		  }
		  if (c > b && b > a)
		  return true;
		  return false;
		}

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
	    if (equalOk)
	    {
	        if (c >= b && b >= a)
	      return true;
	    }
	    if (c > b && b > a)
	    return true;
	    return false;
	  }

	public static boolean lastDigit(int a, int b, int c) {
		  a = a%10;
		  b = b%10;
		  c = c%10;
		  if (a ==b || b == c || c == a)
		    return true;
		  return false;
		}

	public static boolean lessBy10(int a, int b, int c) {
		  if (Math.abs(a-b) >= 10 || Math.abs(c-b) >= 10 || Math.abs(a-c) >= 10)
			    return true;
			  return false;
			}

	public static int withoutDoubles(int a, int b, boolean d) {
		  if (a==6 && b==6 && d)
			    return 7;
			  if (a==b && d)
			    return a + b + 1;
			  return a + b;
			}

	public static int maxMod5(int a, int b) {
		  int a1 = a%5;
		  int b1 = b%5;
		  if (b1 == a1)
		  {
		    if (a > b)
		      return b;
		    if (a == b)
		      return 0;
		    return a;
		  }
		  if (a > b)
		    return a;
		  return b;
		}

	public static int redTicket(int a, int b, int c) {
		  if (a == 2 && b == 2 & c == 2)
			    return 10;
			  if (a == b && b == c)
			    return 5;
			  if (a == b || a == c)
			    return 0;
			  return 1;    
			}

	public static int greenTicket(int a, int b, int c) {
		  if (a == b && b == c)
			    return 20;
			  if (a == b || b == c || a == c)
			    return 10;
			  return 0;
			}

	public static int blueTicket(int a, int b, int c) {
		  if (a + b == 10 || b + c == 10 || a + c == 10)
			    return 10;
			  if (a - c == 10 || b - c == 10)
			    return 5;
			  return 0;
			}

	public static boolean shareDigit(int a, int b) {
		  int aF = a/10, aL = a%10, bF = b/10, bL = b%10;
		  if (aF == bL || aF == bF || aL == bL || aL == bF)
		    return true;
		  return false;
		}

	public static int sumLimit(int a, int b) {
		  int len = String.valueOf(a).length();
		  int sumLen = String.valueOf(a+b).length();
		  if (len == sumLen)
		    return a + b;
		  return a;
		}

}
