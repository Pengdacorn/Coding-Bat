
public class Recursion1 {
	public static void main(String[] args){
		String str = "abcdefghighidefabc";
		String str2 = "def";
		System.out.println(strDist(str,str2));
	}
	public static int factorial(int n) {
		  if(n == 1)
			    return 1;
			  return n *= factorial(n-1);
			}

	public static int bunnyEars(int bunnies) {
		  if(bunnies == 0)
			    return 0;
			  return 2 + bunnyEars(bunnies - 1);
			}

	public static int fibonacci(int n) {
		  if(n == 0)
			    return 0;
			  if(n == 1)
			    return 1;
			  return fibonacci(n-1) + fibonacci (n-2);
			}

	public static int bunnyEars2(int bunnies) {
		  if(bunnies == 0)
			    return 0;
			  if(bunnies%2 == 1)
			    return 2 + bunnyEars2(bunnies - 1);
			  return 3 + bunnyEars2(bunnies - 1);
			}

	public static int triangle(int rows) {
		  if(rows == 0)
			    return 0;
			  return rows + triangle(rows-1);
			}

	public static int sumDigits(int n) {
		  if(n/10 == 0)
			    return n;
			  return n%10 + sumDigits(n/10);
			}

	public static int count7(int n) {
		  int c = 0;
		  if(n == 7)
		    return c + 1;
		  if(n < 10)
		    return c;
		  if(n%10 == 7)
		    c++;
		  return c + count7(n/10);
		}

	public static int count8(int n) {
		  int c = 0;
		  if(n == 8)
		    return c + 1;
		  if(n < 10)
		    return c;
		  if(n%100 == 88)
		    c += 2;
		  else if(n%10 == 8)
		    c++;
		  return c + count8(n/10);
		}

	public static int powerN(int base, int n) {
		  if(n == 0)
			    return 1;
			  return base * powerN(base, n - 1);
			}

	public static int countX(String str) {
		  int c = 0;
		  if(! str.contains("x"))
		    return c;
		  if(str.charAt(0) == 'x')
		    c++;
		  return c + countX(str.substring(1));
		}

	public static int countHi(String str) {
		  int c = 0;
		  if(! str.contains("hi"))
		    return c;
		  if(str.substring(0,2).equals("hi"))
		    c++;
		  return c + countHi(str.substring(1));
		}

	public static String changeXY(String str) {
		  if(str.length() == 0)
			    return "";
			  if(str.charAt(0) == 'x')
			    str = 'y' + str.substring(1);
			  String ret = "";
			  ret += str.substring(0,1);
			  str = str.substring(1);
			  return ret + changeXY(str);
			}

	public static String changePi(String str) {
		  String ret = "";
		  if(str.length() == 0)
		    return "";
		  if(str.length() == 1)
		    ret += str;
		  else
		  {
		    if(str.substring(0,2).equals("pi"))
		    {
		      str = str.substring(1);
		      ret += "3.14";
		    }
		    else
		    {
		      if(! str.substring(0,2).equals("pi"))
		        ret += str.substring(0,1);
		    }
		  }
		  str = str.substring(1);
		  return ret + changePi(str);
		}

	public static String noX(String str) {
		  String ret = "";
		  if(str.length() == 0)
		    return "";
		  if(str.charAt(0) == 'x')
		    ret += "";
		  else
		    ret += str.charAt(0);
		  str = str.substring(1);
		  return ret + noX(str);
		}

	public static boolean array6(int[] nums, int index) {
		  if(index == nums.length)
			    return false;
			  if(nums[index] == 6)
			    return true;
			  index ++;
			  return array6(nums, index);
			}

	public static int array11(int[] nums, int index) {
		  int ret = 0;
		  if(index == nums.length)
		    return 0;
		  if(nums[index] == 11)
		    ret ++;
		  index ++;
		  return ret + array11(nums, index);
		}

	public static boolean array220(int[] nums, int index) {
		  if(index >= nums.length - 1)
			    return false;
			  if(nums[index] * 10 == nums[index + 1])
			    return true;
			  index ++;
			  return array220(nums, index);
			}

	public static String allStar(String str) {
		  String ret = "";
		  if(str.length() <= 1)
		    return str;
		  else
		    ret += str.charAt(0) + "*";
		  str = str.substring(1);
		  return ret + allStar(str);
		}

	public static String pairStar(String str) {
		  if(str.length() <= 1)
			    return str;
			  String ret = "";
			  ret += str.charAt(0);
			  if(str.charAt(0) == str.charAt(1))
			    ret += "*";
			  str = str.substring(1);
			  return ret + pairStar(str);
			}

	public static String endX(String str) {
		  if(onlyX(str) || str.length() <= 1 || ! str.contains("x"))
			    return str;
			  String ret = "";
			  for(int i = 0; i < str.length(); i++)
			  {
			    if(str.charAt(i) != 'x')
			    {
			      ret += str.charAt(i);
			      str = str.substring(0,i) + str.substring(i + 1);
			      break;
			    }
			  }
			  return ret + endX(str);
			}
			public static boolean onlyX(String str) {
			  for(int i = 0; i < str.length(); i++)
			  {
			    if(str.charAt(i) != 'x')
			      return false;
			  }
			  return true;
			}
	public static int countPairs(String str) {
		  int ret = 0;
		  if(str.length() <= 2)
		    return 0;
		  if(str.charAt(0) == str.charAt(2))
		    ret = 1;
		  str = str.substring(1);
		  return ret + countPairs(str);
		}

	public static int countAbc(String str) {
		  int abc = str.indexOf("abc");
		  int aba = str.indexOf("aba");
		  int ret = 0;
		  if(abc + aba == -2)
		    return 0;
		  str = str.substring(0, Math.max(aba, abc)) + str.substring(Math.max(aba, abc) + 2);
		  ret = 1;
		  return ret + countAbc(str);
		}

	public static int count11(String str) {
		  if(! str.contains("11"))
			    return 0;
			  int ret = 1;
			  str = str.substring(0, str.indexOf("11")) + str.substring(str.indexOf("11") + 2);
			  return ret + count11(str);
			}

	public static String stringClean(String str) {
		  if(str.length() <= 1)
			    return str;
			  String ret = "";
			  if(str.charAt(0) == str.charAt(1))
			    str = str.substring(1);
			  else
			  {
			    ret += str.charAt(0);
			    str = str.substring(1);
			  }
			  return ret + stringClean(str);
			}

	public static int countHi2(String str) {
		  if(! str.contains("hi"))
			    return 0;
			  int ret = 0;
			  if(str.contains("xhi"))
			    str = str.substring(0,str.indexOf("xhi")) + str.substring(str.indexOf("xhi") + 3);
			  else
			  {
			    str = str.substring(0,str.indexOf("hi")) + str.substring(str.indexOf("hi") + 2);
			    ret = 1;
			  }
			  return ret + countHi2(str);
			}

	public static String parenBit(String str) {
		  if (str.charAt(str.length()-1) != ')') {
			    return parenBit(str.substring(0, str.length()-1));
			  }
			  if (str.charAt(0) != '(') {
			    return parenBit(str.substring(1));
			  }
			  return str;
			}
	public static boolean nestParen(String str) {
		  if(str.length() == 0)
			    return true;
			  if(str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
			    str = str.substring(1, str.length() - 1);
			  else
			    return false;
			  return nestParen(str);
			}

	public static int strCount(String str, String sub) {
		  if(! str.contains(sub))
			    return 0;
			  else
			    str = str.substring(0, str.indexOf(sub)) + str.substring(str.indexOf(sub) + sub.length());
			  return 1 + strCount(str, sub);
			}

	public static boolean strCopies(String str, String sub, int n) {
		  return n == strCount(str, sub);
	}
	public static int strDist(String str, String sub) {
		  if(! str.contains(sub))
			    return 0;
			  int ret = 0;
			  int rep = sub.length() > 1 ? 1 : 0;
			  str = str.substring(str.indexOf(sub) + sub.length() - rep);
			  ret += sub.length();
			  if(str.contains(sub))
			    ret += str.indexOf(sub) - rep;
			  return ret + strDist(str, sub);
			}

	
}
