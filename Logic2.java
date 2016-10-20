
public class Logic2 {
	public static void main(String[] args) {
		int a = 4;
		int b = 1;
		int c = 9281375;
		System.out.println(makeChocolate(a,b,c));
	}
	public static boolean makeBricks(int small, int big, int goal) {
		  while(big > 0 && goal >= 5)
		  {
		    goal -= 5;
		    big --;
		  }
		  return (goal <= small);
		}
	public static int loneSum(int a, int b, int c) {
		  int sum = 0;
		  if(a != b && a!= c)
		    sum += a;
		  if(a != b && b!= c)
		    sum += b;
		  if(c != b && a!= c)
		    sum += c;
		  return sum;
		}

	public static int luckySum(int a, int b, int c) {
		  if(a == 13)
		  {
		    a = 0;
		    b = 0;
		    c = 0;
		  }
		  if(b == 13)
		  {
		    c = 0;
		    b = 0;
		  }
		  if(c == 13)
		    c = 0;
		  return a + b + c;
		}
	public static int fixTeen(int n){
		  if(n >= 13 && n <= 19 && n != 15 && n != 16)
			    n = 0;
			  return n;
			}
			public int noTeenSum(int a, int b, int c) {
			  a = fixTeen(a);
			  b = fixTeen(b);
			  c = fixTeen(c);
			  return a + b + c;
			}
	public static int roundSum(double a, double b, double c) {
		  a = round10(a);
		  b = round10(b);
		  c = round10(c);
		  return (int)(a + b + c);
		}
		public static double round10(double n){
		  n = Math.round(n/10) * 10;
		  return n;
		}
	public static boolean closeFar(int a, int b, int c) {
		  int x = Math.abs(a - b);
		  int y = Math.abs(b - c);
		  int z = Math.abs(a - c);
		  return(!(x < 2 && (y < 2 || z < 2) || (y < 2 && z < 2)) && (x > 1 || y > 1 || z > 1));
		}

	public static int blackjack(int a, int b) {
		  if(a > 21) a = 0;
		  if(b > 21) b = 0;
		  if(a == b && a == 0) return 0;
		  if(a - 21 > b - 21) return a;
		  return b;
		}

	public static boolean evenlySpaced(int a, int b, int c) {
		  if(a == b && b == c) return true;
		  if( a == b || b == c || a == c) return false;
		  int x = Math.abs(a - b);
		  int y = Math.abs(c - b);
		  int z = Math.abs(a - c);
		  return( x == y || y == z || x == z);
		}

	public static int makeChocolate(int small, int big, int goal) {
		  while(goal >= 5 && big > 0)
		  {
		    goal = goal - 5;
		    big = big - 1;
		  }
		  if(small >= goal) return goal;
		  return -1;
		}
}
