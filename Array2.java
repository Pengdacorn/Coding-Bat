import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[] n = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		System.out.println(countEvens(n));
	}
	public static int countEvens(int[] nums) {
		  int a = 0;
		  for(int n : nums)
		    a += (n+1)%2;
		  return a;
		}

	public static int bigDiff(int[] nums) {
		  int max = 0;
		  for(int n : nums)
		    max = n > max ? n : max;
		  int min = max;
		  for(int n : nums)
		    min = n < min ? n : min;
		  return max - min;
		}

	public static int centeredAverage(int[] nums) {
		  int max = 0;
		  for(int n : nums)
		    max = n > max ? n : max;
		  int min = max;
		  for(int n : nums)
		    min = n < min ? n : min;
		  int sum = 0 - max - min;
		  for(int n : nums)
		    sum += n;
		  return sum / (nums.length - 2);
		}

	public static int sum13(int[] nums) {
		  if(nums.length == 0)
			    return 0;
			  int sum = 0;
			  for(int i = 1; i < nums.length; i++)
			  {
			    if(nums[i] != 13 && nums[i-1] != 13)
			      sum += nums[i];
			  }
			  if(nums[0] != 13)
			    sum += nums[0];
			  return sum;
			}

	public static int sum67(int[] nums) {
		  int count6 = -1;
		  int count7 = -1;
		  boolean check6 = false;
		  boolean cont6 = false;
		  for(int n : nums)
		  {
		    if(n == 6)
		      cont6 = true;
		  }
		  while(cont6){
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(nums[i] == 6 && ! check6)
		    {
		      count6 = i;
		      check6 = true;
		    }
		    if(check6 && nums[i] == 7)
		    {
		      count7 = i;
		      break;
		    }
		  }
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(i >= count6 && i <= count7)
		      nums[i] = 0;
		  }
		  count6 = -1;
		  count7 = -1;
		  check6 = false;
		  cont6 = false;
		  for(int n : nums)
		  {
		    if(n == 6)
		      cont6 = true;
		  }
		  }
		  int sum = 0;
		  for(int n : nums)
		    sum += n;
		  return sum;
		}

	public static boolean has22(int[] nums) {
		  for(int i = 0; i < nums.length-1; i++)
		  {
		    if(nums[i] == 2 && nums[i + 1] == 2)
		      return true;
		  }
		  return false;
		}

	public static boolean lucky13(int[] nums) {
		  for(int n: nums)
		  {
		    if(n == 1 || n == 3)
		      return false;
		  }
		  return true;
		}

	public static boolean sum28(int[] nums) {
		  int count2 = 0;
		  for(int n : nums) count2 += n == 2 ? 1 : 0;
		  return count2 == 4;
		}

	public static boolean more14(int[] nums) {
		  int count1 = 0;
		  for(int n : nums) count1 += n == 1 ? 1 : 0;
		  int count4 = 0;
		  for(int n : nums) count4 += n == 4 ? 1 : 0;
		  return count1 > count4;
		}

	public static int[] fizzArray(int n) {
		  int[] ret = new int[n];
		  for(int i = 0; i < ret.length; i++)
		    ret[i] = i;
		  return ret;
		}

	public static boolean only14(int[] nums) {
		  for(int n : nums)
		  {
		    if(n != 1 && n != 4)
		      return false;
		  }
		  return true;
		}

	public static String[] fizzArray2(int n) {
		  String[] ret = new String[n];
		  for(int i = 0; i < ret.length; i++)
		    ret[i] = "" + i + "" ;
		  return ret;
		}

	public static boolean no14(int[] nums) {
		  boolean one = false;
		  boolean four = false;
		  for(int n : nums)
		  {
		    one = n == 1 ? true : one;
		    four = n == 4 ? true : four;
		  }
		  return ! (one && four);
		}

	public static boolean isEverywhere(int[] nums, int val) {
		  for(int i = 0; i < nums.length - 1; i++)
		  {
		    if(nums[i] != val && nums[i + 1] != val)
		      return false;
		  }
		  return true;
		}

	public static boolean either24(int[] nums) {
		  boolean twos = false;
		  boolean fours = false;
		  for(int i = 0; i < nums.length - 1; i++)
		  {
		    if(nums[i] == 2 && nums[i + 1] == 2)
		      twos = true;
		    if(nums[i] == 4 && nums[i + 1] == 4)
		      fours = true;
		  }
		  return((twos && ! fours) || (! twos && fours));
		}

	public static int matchUp(int[] a, int[] b) {
		  int count = 0;
		  for(int i = 0; i < a.length; i++)
		  {
		    if(Math.abs(a[i] - b[i]) > 0 && Math.abs(a[i] - b[i]) < 3)
		      count ++;
		  }
		  return count;
		}

	public static boolean has77(int[] nums) {
		  if(nums.length < 2) return false;
		  for(int i = 0; i < nums.length - 2; i++)
		  {
		    if((nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7))
		      return true;
		  }
		  return(nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7);
		}
	public static boolean has12(int[] nums) {
		  boolean ch1 = false;
		  for(int n : nums)
		  {
		    if(n == 1) ch1 = true;
		    if(ch1 && n == 2) return true;
		  }
		  return false;
		}

	public static boolean modThree(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++)
		  {
		    if(nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
		      return true;
		  }
		  return false;
		}

	public static boolean haveThree(int[] nums) {
		  boolean ch3 = false;
		  int c3 = 0;
		  for(int n : nums)
		  {
		    if(ch3 && n == 3)
		      return false;
		    if(n == 3)
		    {
		      c3 ++;
		      ch3 = true;
		    }
		    else
		      ch3 = false;
		  }
		  return c3 == 3;
		}

	public static boolean twoTwo(int[] nums) {
		  if(nums.length == 1 && nums[0] == 2) return false;
		  if(nums.length > 1 && (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2)) return false;
		  for(int i = 1; i < nums.length - 1; i++)
		  {
		    if(nums[i] == 2 && !(nums[i-1] == 2 || nums[i + 1] == 2))
		      return false;
		  }
		  return true;
		}

	public static boolean sameEnds(int[] nums, int len) {
		  int[] front = new int[len];
		  int[] end = new int[len];
		  for(int i = 0; i < len; i++)
		  {
		    front[i] = nums[i];
		    end[i] = nums[nums.length - len + i];
		  }
		  return Arrays.equals(front, end);
		}

	public static boolean tripleUp(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++)
		  {
		    if(nums[i] + 1 == nums[i+1] && nums[i] + 2 == nums[i+2])
		      return true;
		  }
		  return false;
		}

	public static int[] fizzArray3(int start, int end) {
		  int[] ret = new int[end - start];
		  for(int i = 0; i < end - start; i++)
		  {
		    ret[i] = start + i;
		  }
		  return ret;
		}

	public static int[] shiftLeft(int[] nums) {
		  if(nums.length < 1)
			    return nums;
			  int first = nums[0];
			  for(int i = 0; i < nums.length - 1; i++)
			    nums[i] = nums[i+1];
			  nums[nums.length - 1] = first;
			  return nums;
			}

	public static int[] tenRun(int[] nums) {
		  boolean c10 = false;
		  int mul10 = 0;
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(nums[i] % 10 == 0)
		    {
		      c10 = true;
		      mul10 = nums[i];
		    }
		    if(c10)
		      nums[i] = mul10;
		  }
		  return nums;
		}

	public static int[] pre4(int[] nums) {
		  int count = 0;
		  for(int n : nums)
		  {
		    if(n == 4)
		      break;
		    count++;
		  }
		  int[] ret = new int[count];
		  for(int i = 0; i < count; i++)
		    ret[i] = nums[i];
		  return ret;
		}

	public static int[] post4(int[] nums) {
		  int c1 = 0;
		  int c2 = 0;
		  for(int n : nums)
		  {
		    if(n == 4)
		    {
		      c1+= c2 + 1;
		      c2 = 0;
		    }
		    else
		      c2++;
		  }
		  int[] ret = new int[nums.length - c1];
		  for(int i = c1; i < nums.length; i++)
		    ret[i-c1] = nums[i];
		  return ret;
		}

	public static int[] notAlone(int[] nums, int val) {
		  int max;
		  for(int i = 1; i < nums.length - 1; i++)
		  {
		    if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
		      nums[i] = Math.max(nums[i-1],nums[i+1]);
		  }
		  return nums;
		}

	public static int[] zeroFront(int[] nums) {
		  int zero = 0;
		  int oth = 0;
		  for(int n : nums)
		  {
		    if(n == 0)
		      zero ++;
		    else
		      oth = n;
		  }
		  int[] ret = new int[nums.length];
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(zero > 0)
		    {
		      ret[i] = 0;
		      zero --;
		    }
		    else
		      ret[i] = oth;
		  }
		  return ret;
		}

	public static int[] withoutTen(int[] nums) {
		  int[] ret = new int[nums.length];
		  int count = 0;
		  for(int n : nums)
		  {
		    if(n != 10)
		    {
		      ret[count] = n;
		      count ++;
		    }
		  }
		  return ret;
		}

	public static int[] zeroMax(int[] nums) {
		  int max = 0;
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(nums[i] == 0)
		    {
		      for(int j = i; j < nums.length; j++)
		      {
		        if(nums[j] % 2 == 1)
		          max = Math.max(max, nums[j]);
		      }
		      nums[i] = max;
		    }
		    max = 0;
		  }
		  return nums;
		}

	public static int[] evenOdd(int[] nums) {
		  int[] ret = new int[nums.length];
		  int c = 0;
		  int d = 0;
		  int evens = 0;
		  for(int n : nums)
		    evens += n % 2 == 0 ? 1 : 0;
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(nums[i] % 2 == 0)
		    {
		      ret[c] = nums[i];
		      c ++;
		    }
		    else
		    {
		      ret[evens + d] = nums[i];
		      d++;
		    }
		  }
		  return ret;
		}

	public static String[] fizzBuzz(int start, int end) {
		  String[] ret = new String[end - start];
		  for(int i = start; i < end; i++)
		  {
		    if(i % 3 == 0 && i % 5 == 0)
		      ret[i - start] = "FizzBuzz";
		    else
		    {
		      if(i % 3 == 0)
		        ret[i - start] = "Fizz";
		      else
		      {
		        if(i % 5 == 0)
		          ret[i - start] = "Buzz";
		        else
		        {
		          ret[i-start] = "" + i + "";
		        }
		      }
		    }
		  }
		  return ret;
		}

}
