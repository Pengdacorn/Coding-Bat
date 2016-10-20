import java.util.List;
import java.util.Arrays;

public class AP1 {
	public static void main(String[] args) {
		int[] a = {5,3,6,7,2};
		int b = 0;
		int c = 1;
		System.out.println(bigHeights(a,b,c));
	}
	public static boolean scoresIncreasing(int[] scores) {
		  int bef = scores[0];
		  for(int n : scores)
		  {
		    if(n < bef) return false;
		    bef = n;
		  }
		  return true;
		}

	public static boolean scores100(int[] nums) {
		  int bef = 0;
		  for(int n : nums)
		  {
		    if(n == 100 && bef == 100) return true;
		    bef = n;
		  }
		  return false;
		}

	public static boolean scoresClump(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++)
		  {
		    int a = Math.abs(nums[i] - nums[i+1]);
		    int b = Math.abs(nums[i+1] - nums[i+2]);
		    int c = Math.abs(nums[i] - nums[i+2]);
		    if(a < 3 && b < 3 && c < 3) return true;
		  }
		  return false;
		}

	public static int scoresAverage(int[] nums) {
		  int counter = 0;
		  int counter2 = 0;
		  for(int i = 0; i < nums.length/2; i++)
		  {
		    counter += nums[i];
		  }
		  counter /= (nums.length/2);
		  for(int i = nums.length/2; i < nums.length; i++)
		  {
		    counter2 += nums[i];
		  }
		  counter2 /= nums.length - (nums.length/2);
		  return Math.max(counter, counter2);
		  
		}

	public static int wordsCount(String[] words, int len) {
		  int c = 0;
		  for(String n : words)
		  {
		    if(n.length() == len)
		      c++;
		  }
		  return c;
		}

	public static String[] wordsFront(String[] words, int n) {
		  String[] ret = new String[n];
		  for(int i = 0; i < n; i++)
		    ret[i] = words[i];
		  return ret;
		}

	public static List wordsWithoutList(String[] words, int len) {
		  int retLen = words.length;
		  for(String n : words)
		  {
		    if(n.length() == len)
		      retLen--;
		  }
		  String[] ret = new String[retLen];
		  retLen = 0;
		  for(String n : words)
		  {
		    if(n.length() != len)
		    {
		      ret[retLen] = n;
		      retLen++;
		    }
		  }
		  return Arrays.asList(ret);
		}

	public static boolean hasOne(int n) {
		  while(n >= 1)
		  {
		    if(n%10 == 1) return true;
		    n /= 10;
		  }
		  return false;
		}

	public static boolean dividesSelf(int n) {
		  int div = n;
		  while(div >= 1)
		  {
		    if(div%10 == 0 || n%(div%10) != 0) return false;
		    div /= 10;
		  }
		  return true;
		}

	public static int[] copyEvens(int[] nums, int count) {
		  int[] ret = new int[count];
		  int placer = 0;
		  for(int n : nums)
		  {
		    if(n%2 == 0)
		    {
		      ret[placer] = n;
		      placer++;
		    }
		    if(placer >= count)
		      break;
		  }
		  return ret;
		}

	public static int[] copyEndy(int[] nums, int count) {
		  int[] ret = new int[count];
		  int placer = 0;
		  for(int n : nums)
		  {
		    if( (n >= 90 && n <= 100) || (n <= 10 && n >= 0) )
		    {
		      ret[placer] = n;
		      placer++;
		    }
		    if(placer >= count)
		      break;
		  }
		  return ret;
		}
	public static int matchUp(String[] a, String[] b) {
		  int c = 0;
		  for(int i = 0; i < a.length; i++)
		  {
		    if(a[i].length() > 0 && b[i].length() > 0)
		      c += a[i].charAt(0) == b[i].charAt(0) ? 1 : 0;
		  }
		  return c;
		}

	public static int scoreUp(String[] key, String[] answers) {
		  int score = 0;
		  for(int i = 0; i < key.length; i++)
		  {
		    if(! answers[i].equals("?"))
		    {
		      if(answers[i].equals(key[i]))
		        score+=4;
		      else
		        score--;
		    }
		  }
		  return score;
		}

	public static String[] wordsWithout(String[] words, String target) {
		  int counTar = 0;
		  for(String str : words)
		  {
		    if(str.equals(target)) counTar ++;
		  }
		  String[] ret = new String[words.length - counTar];
		  counTar = 0;
		  for(String str : words)
		  {
		    if(! str.equals(target))
		    {
		      ret[counTar] = str;
		      counTar++;
		    }
		  }
		  return ret;
		}

	public static int scoresSpecial(int[] a, int[] b) {
		  return specialScore(a) +specialScore(b);
	}
		public static int specialScore(int[] nums){
			int score = 0;
			for(int n : nums)
				score = n%10 == 0 ? Math.max(score, n) : score;
				return score;
		}
	public static int sumHeights(int[] heights, int start, int end) {
		  int height = 0;
		  for(int i = start+1; i <= end; i++)
		    height += Math.abs(heights[i] - heights[i-1]);
		  return height;
		}

	public static int sumHeights2(int[] heights, int start, int end) {
		  int height = 0;
		  for(int i = start+1; i <= end; i++)
		  {
		    if(heights[i] - heights[i-1] > 0)
		      height += (heights[i] - heights[i-1]) * 2;
		    if(heights[i] - heights[i-1] < 0)
		      height -= heights[i] - heights[i-1];
		  }
		  return height;
		}

	public static int bigHeights(int[] heights, int start, int end) {
		  int height = 0;
		  for(int i = start+1; i <= end; i++)
		  {
		    if(Math.abs(heights[i] - heights[i-1]) >= 5)
		      height ++;
		  }
		  return height;
		}

	public static int userCompare(String aName, int aId, String bName, int bId) {
		  if(aName.compareTo(bName) < 0)
			    return -1;
			  if(aName.compareTo(bName) > 0)
			    return 1;
			  if(aId - bId < 0)
			    return -1;
			  if(aId - bId > 0)
			    return 1;
			  return 0;
			}

	public static String[] mergeTwo(String[] a, String[] b, int num) {
		  String[] tot = new String[a.length + b.length];
		  for(int i = 0; i < a.length; i++)	tot[i] = a[i];
		  for(int i = a.length; i < tot.length; i++)	tot[i] = b[i-a.length];
		  int letTot = tot.length;
		  for(String n : a) {
		    for(String m : b) {
		      if(n.equals(m))	letTot --;	}	}
		  String temp;
		  while(letTot > 0) {
		  for(int i = 0; i < tot.length; i++) {
		    for(int j = 0; j < tot.length; j++) {
		      if(tot[i].compareTo(tot[j]) <= -1) {
		        temp = tot[i];
		        tot[i] = tot[j];
		        tot[j] = temp;	}	}	}
		    letTot--;	}
		  for(int i = 0; i < tot.length - 1; i++) {
		    if(tot[i].equals(tot[i+1]))
		      tot[i] = "null";
		  }
		  String[] ret = new String[num];
		  for(String n : tot) {
		    if(! n.equals("null")) {
		      ret[letTot] = n;
		      letTot++;	}
		    if(letTot == num)	break;	}
		  return ret;	}
	public static int commonTwo(String[] a, String[] b) {
		  String temp;
		  int ret = 0;
		  double randSub = Math.random();
		  for(int i = 0; i < a.length; i++)
		  {
		    temp = a[i];
		    for(int j = 0; j < b.length; j++)
		    {
		      if(a[i].equals(b[j]))
		      {
		        ret++;
		        for(int rep = 0; rep < a.length; rep++)
		        {
		          if(a[rep].equals(temp))
		          {
		            a[rep] = "" + randSub + "";
		            randSub ++;
		          }
		        }
		        for(int rep2 = 0; rep2 < b.length; rep2++)
		        {
		          if(b[rep2].equals(temp))
		          {
		            b[rep2] = "" + randSub + "";
		            randSub ++;
		          }
		        }
		      }
		    }
		  }
		  return ret;
		}

}
