
public class Array1 {
	public static void main(String[] args) {
		int[] n = {76, 48, 44};
		System.out.println(maxEnd3(n));
	}
	public static boolean firstLast6(int[] nums) {
		  if(nums[0] == 6 || nums[nums.length - 1] == 6)
			    return true;
			  return false;
			}
	
	public static boolean sameFirstLast(int[] num) {
		  if(num.length < 1)
			    return false;
			  return(num[0] == num[num.length - 1]);
			}

	public static int[] makePi() {
		  int[] pi = {3, 1, 4};
		  return pi;
		}

	public static boolean commonEnd(int[] a, int[] b) {
		  return(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
	}

	public static int sum3(int[] num) {
		  int sum = 0;
		  for(int i = 0; i < num.length; i++)
		    sum += num[i];
		  return sum;
		}

	public static int[] rotateLeft3(int[] nums) {
		  int[] ret;
		  ret = new int[nums.length];
		  ret[nums.length - 1] = nums[0];
		  for(int i = 1; i < nums.length; i++)
		    ret[i-1] = nums[i];
		  return ret;
		}

	public static int[] reverse3(int[] nums) {
		  int[] ret;
		  ret = new int[nums.length];
		  for(int i = 0; i < nums.length; i ++)
		  {
		    ret[nums.length - i - 1] = nums[i];
		  }
		  return ret;
		}

	public static int[] maxEnd3(int[] nums) {
		  int max = 0;
		  int[] ret;
		  ret = new int[nums.length];
		  max = Math.max(nums[0], nums[nums.length - 1]);
		  for(int i = 0; i < nums.length; i++)
		    ret[i] = max;
		  return ret;
		}

	public static int sum2(int[] nums) {
		  if(nums.length < 2)
		  {
		    if(nums.length == 0) return 0;
		    return nums[0];
		  }
		  return nums[0] + nums[1];
		}

	public static int[] middleWay(int[] a, int[] b) {
		  int c = a.length / 2;
		  int d = b.length / 2;
		  int[] ret = {a[c],b[d]};
		  return ret;
		}

	public static int[] makeEnds(int[] nums) {
		  int[] ret = {nums[0], nums[nums.length - 1]};
		  return ret;
		}

	public static boolean has23(int[] nums) {
		  for(int n : nums)
		  {
		    if(n == 2 || n == 3) return true;
		  }
		  return false;
		}

	public static boolean no23(int[] nums) {
		  for(int n : nums)
		  {
		    if(n == 2 || n == 3) return false;
		  }
		  return true;
		}

	public static int[] makeLast(int[] nums) {
		  int[] ret;
		  ret = new int[nums.length * 2];
		  ret[ret.length - 1] = nums[nums.length - 1];
		  return ret;
		}

	public static boolean double23(int[] nums) {
		  int c2 = 0;
		  int c3 = 0;
		  for(int n : nums)
		  {
		    if(n == 2) c2 ++;
		    if(n == 3) c3 ++;
		  }
		  return(c2 == 2 || c3 == 2);
		}

	public static int[] fix23(int[] nums) {
		  for(int i = 0; i < nums.length - 1; i++)
		  {
		    if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
		  }
		  return nums;
		}

	public static int start1(int[] a, int[] b) {
		  int c1 = 0;
		  if(a.length > 0 && a[0] == 1) c1 ++;
		  if(b.length > 0 && b[0] == 1) c1 ++;
		  return c1;
		}

	public static int[] biggerTwo(int[] a, int[] b) {
		  int aSum = 0;
		  int bSum = 0;
		  for(int n : a)
		    aSum += n;
		  for(int n : b)
		    bSum += n;
		  if(bSum > aSum) return b;
		  return a;
		}

	public static int[] makeMiddle(int[] nums) {
		  int[] ret = {nums[nums.length / 2 - 1],nums[nums.length / 2]};
		  return ret;
		}

	public static int[] plusTwo(int[] a, int[] b) {
		  int[] c = new int[a.length + b.length];
		  for(int i = 0; i < a.length; i++)
		    c[i] = a[i];
		  for(int i = 0; i < a.length; i++)
		    c[i + a.length] = b[i];
		  return c;
		}

	public static int[] swapEnds(int[] nums) {
		  int f = nums[0];
		  int l = nums[nums.length - 1];
		  nums[0] = l;
		  nums[nums.length - 1] = f;
		  return nums;
		}

	public static int[] midThree(int[] nums) {
		  int[] ret = {nums[nums.length/2 - 1], nums[nums.length/2], nums[nums.length/2 + 1]};
		  return ret;
		}

	public static int maxTriple(int[] nums) {
		  int max1 = Math.max(nums[nums.length/2], nums[nums.length - 1]);
		  return Math.max(max1, nums[0]);
		}

	public static int[] frontPiece(int[] nums) {
		  if(nums.length < 2) return nums;
		  int[] ret = {nums[0],nums[1]};
		  return ret;
		}

	public static boolean unlucky1(int[] nums) {
		  if(nums.length < 2) return false;
		  int[] check = {0, 1, nums.length - 2};
		  for(int n : check)
		  {
		    if(nums[n] == 1 && nums[n + 1] == 3) return true;
		  }
		  return false;
		}

	public static int[] make2(int[] a, int[] b) {
		  int ret[] = new int[2];
		  if(a.length > 1)
		  {
		    ret[0] = a[0];
		    ret[1] = a[1];
		    return ret;
		  }
		  if(a.length < 1)
		  {
		    ret[0] = b[0];
		    ret[1] = b[1];
		    return ret;
		  }
		  ret[0] = a[0];
		  ret[1] = b[0];
		  return ret;
		}

	public static int[] front11(int[] d, int[] e) {
		  boolean a = d.length == 0;
		  boolean b = e.length == 0;
		  int c = 0;
		  if(a != b)
		    c = 1;
		  if(!(a || b))
		    c = 2;
		  int[] ret = new int[c];
		  if(c == 0) return ret;
		  if(c == 1 && a)
		  {
		    ret[0] = e[0];
		    return ret;
		  }
		  if(c == 1 && b)
		  {
		    ret[0] = d[0];
		    return ret;
		  }
		  ret[0] = d[0];
		  ret[1] = e[0];
		  return ret;
		}
}
