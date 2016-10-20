
public class String3 {
	public static void main(String[] args) {
		String str = "The lazy fox jumped over the brown dog.";
		System.out.println(countYZ(str));
	}
	public static int countYZ(String str) {
		  int n = 0;
		  str = str.toLowerCase();
		  str = str + ".";
		  for(int i = 0; i < str.length(); i++)
		  {
		    if((str.charAt(i) == 'z' || str.charAt(i) == 'y') && ! Character.isLetter(str.charAt(i+1)))
		      n = n+1;
		  }
		  return n;
		}

	public static String withoutString(String str, String rem) {
		  for(int i = 0; i < str.length(); i++)
		  {
		    if(str.indexOf(rem) == i || str.indexOf(rem.toUpperCase()) == i || str.indexOf(rem.toLowerCase()) == i)
		    {
		      str = str.substring(0,i) + str.substring(i+rem.length());
		      i --;
		    }
		  }
		  return str;
		}

	public static boolean equalIsNot(String str) {
		  int is = 0;
		  int not = 0;
		  while(str.contains("is"))
		  {
		    str = str.substring(0, str.indexOf("is")) + str.substring(str.indexOf("is") + 2);
		    is++;
		  }
		    while(str.contains("not"))
		  {
		    str = str.substring(0, str.indexOf("not")) + str.substring(str.indexOf("not") + 2);
		    not ++;
		  }
		  return (is == not);
		}

	public static boolean gHappy(String str) {
		  while(str.contains("ggg"))
			    str = str.substring(0,str.indexOf("ggg")) + str.substring(str.indexOf("ggg")+3);
			  while(str.contains("gg"))
			    str = str.substring(0,str.indexOf("gg")) + str.substring(str.indexOf("gg")+2);
			  return(!str.contains("g"));
			}
	public static int countTriple(String str) {
		  int triple = 0;
		  while(str.length() > 2)
		  {
		    if(str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2))
		      triple ++;
		    str = str.substring(1);
		  }
		  return triple;
		}

	public static int sumDigits(String str) {
		  int ret = 0;
		  for(int i = 0; i < str.length(); i++)
		  {
		    if(Character.isDigit(str.charAt(i)))
		      ret += Integer.parseInt(str.substring(i, i+1));
		  }
		  return ret;
		}

	public static String sameEnds(String str) {
		  int ret = 0;
		  for(int i = 1; i <= str.length()/2; i++)
		  {
		    if(str.substring(0,i).equals(str.substring(str.length()-i)))
		      ret = i;
		  }
		  return str.substring(0,ret);
		}

	public static String mirrorEnds(String str) {
		  if(str.length() < 2)
			    return str;
			  String temp = str;
			  String ret = "";
			  while(temp.length()>1)
			  {
			    ret += temp.charAt(temp.length()-1);
			    temp = temp.substring(0,temp.length()-1);
			  }
			  ret += temp;
			  if(ret.equals(str)) return str;
			  String beg = "";
			  String end = "";
			  while(beg.equals(end) && str.length() > 1)
			  {
			    beg += str.charAt(0);
			    end += str.charAt(str.length()-1);
			    str = str.substring(1,str.length()-1);
			  }
			  if(beg == end)
			    return beg;
			  return beg.substring(0,beg.length()-1);
			}

	public static int maxBlock(String str) {
		  int ret = 0;
		  int cnt = 1;
		  for(int i = 0; i < str.length() - 1; i++)
		  {
		    if(str.charAt(i) == str.charAt(i+1))
		      cnt ++;
		    else
		    {
		      if (cnt > ret)
		        ret = cnt;
		      cnt = 1;
		    }
		    if (cnt > ret)
		      ret = cnt;
		  }
		  return ret;
		}

	public static int sumNumbers(String str) {
		  String end = "";
		  for(int i = 0; i < str.length(); i++)
		  {
		    if(Character.isDigit(str.charAt(i)))
		      end += str.charAt(i);
		    else
		      end += " ";
		  }
		  str = end;
		  int ret = 0;
		  int space;
		  while(str.length() > 0)
		  {
		    space = str.indexOf(" ");
		    if(space == -1) break;
		    if(space!=0)
		      ret += Integer.parseInt(str.substring(0,space));
		    str = str.substring(space+1);
		  }
		  if(str.length() > 0)
		    ret += Integer.parseInt(str);
		  return ret;
		}

	public static String notReplace(String str) {
		  str = " " + str + " ";
		  if(! str.contains(" is"))
		    return str.substring(1,str.length()-1);
		  int is = str.indexOf(" is") + 3;
		  if(! Character.isLetter(str.charAt(is)))
		    str = str.substring(0,is) + " not" + str.substring(is);
		  String temp = str.substring(str.indexOf(" not") + 4);
		  int is2 = temp.indexOf("is ") + 2;
		  if(is2 < 3)
		    return str.substring(1,str.length()-1);
		  if(! Character.isLetter(temp.charAt(is2)) && ! Character.isLetter(temp.charAt(is2-3)))
		    str = str.substring(0,is + is2 + 4) + " not" + str.substring(is + is2 + 4);
		  return str.substring(1, str.length()-1);
		}
}
