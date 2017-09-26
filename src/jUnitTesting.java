
public class jUnitTesting {
	public static String addstring(String e,String f)
	{
		String g=e+f;
		return g;
	}
	public static int addnumbers(int m,int n)
	{
		int o=m+n;
		return o;
	}

	public static void main(String[] args) {
		int a=2,b=3;
		String c="ari",d="jeet";
		System.out.println("final answer in string:"+ addstring(c,d));
		System.out.println(" ");
		System.out.println("final answer in integer:"+ addnumbers(a,b));

	}

}
