
public class Array3 {
	public static void main(String[] args) {
		int[] n = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		System.out.println(countClumps(n));
	}
	public static int maxSpan(int[] nums) {
		  if(nums.length < 2)
			    return nums.length;
			  int count = 0;
			  for(int j = 0; j < nums.length; j ++){
			    for(int i = 0; i < nums.length; i++)
			    {
			      if( nums[i] == nums[j] )
			        count = Math.max(count, i - j);
			    }
			  }
			  return count + 1;
			}

	public static int[] fix34(int[] nums) {
		  int non34 = 1;
		  for(int n : nums)
		  {  
		    if(n != 4 && n != 3)
		    {
		      non34 = n;
		      break;
		    }
		  }
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(nums[i] == 4 && nums[i-1] != 3)
		      nums[i] = non34;
		  }
		  for(int i = 0; i < nums.length - 1; i++)
		  {
		    if(nums[i] == 3)
		      nums[i+1] = 4;
		  }
		  return nums;
		}

	public static int[] fix45(int[] nums) {
		  int non45 = 1;
		  for(int n : nums)
		  {  
		    if(n != 4 && n != 5)
		    {
		      non45 = n;
		      break;
		    }
		  }
		  for(int i = 1; i < nums.length; i++)
		  {
		    if(nums[i] == 5 && nums[i-1] != 4)
		      nums[i] = non45;
		    if(nums[0] == 5)
		      nums[0] = non45;
		  }
		  for(int i = 0; i < nums.length - 1; i++)
		  {
		    if(nums[i] == 4)
		      nums[i+1] = 5;
		  }
		  return nums;
		}

	public static boolean canBalance(int[] nums) {
		  int sum1 = 0;
		  int sum2 = 0;
		  for(int i = 0; i < nums.length; i++)
		  {
		    for(int j = 0; j < i; j++)
		      sum1 += nums[j];
		    for(int j = i; j < nums.length; j++)
		      sum2 += nums[j];
		    if(sum1 == sum2)
		      return true;
		    sum1 = 0;
		    sum2 = 0;
		  }
		  return false;
		}

	public static boolean linearIn(int[] outer, int[] inner) {
		  if(inner.length == 0) return true;
		  int inside = 0;
		  for(int n : outer)
		  {
		    if(inside == inner.length)
		      break;
		    if(n == inner[inside])
		    {
		      inner[inside] = 0;
		      inside ++;
		    }
		  }
		  inside = 0;
		  for(int n : inner)
		    inside += n;
		  return inside == 0;
		}

	public static int[] squareUp(int n) {
		  int count = 0;
		  int steps = n - 1;
		  int[] nums = new int[n*n];
		  for(int i = 0; i < nums.length; i++)
		  {
		    if(i >= steps)
		    {
		      nums[i] = n - i % n;
		      if(nums[i] == 1)
		        steps += n-1;
		    }
		  }
		  return nums;
		}

	public static int[] seriesUp(double n) {
		  int check = 1;
		  int input = 0;
		  int[] ret = new int[(int)(n / 2 * (n + 1))];
		  for(int i = 0; i < ret.length; i++)
		  {
		    input ++;
		    ret[i] = input;
		    if(input == check)
		    {
		      input = 0;
		      check ++;
		    }
		  }
		  return ret;
		}

	public static int maxMirror(int[] nums) {
		  int c = 0;
		  int d = 0;
		  for(int i = 0; i < nums.length; i++)
		  {
		    c = 0;
		    for(int j = nums.length - 1; c + i < nums.length && j >= 0; j--)
		    {
		      if(nums[i+c] == nums[j])
		       {
		         c++;
		       }
		      else
		      {
		        d = Math.max(c,d);
		        c = 0;
		      }
		    }
		    d = Math.max(c,d);
		  }
		  return d;
		}
	public static int countClumps(int[] nums) {
		  boolean wasThere = false;
		  int prev = -1;
		  int count = 0;
		  for(int n : nums)
		  {
		    if(n == prev && ! wasThere)
		    {
		      count ++;
		      wasThere = true;
		    }
		    if(n != prev)
		      wasThere = false;
		    prev = n;
		  }
		  return count;
		}

}
