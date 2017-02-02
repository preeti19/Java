public class StringBuffDemo
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("God");
		System.out.println ("Initially the string is " + str);
		str.append("is great");
		str.append("!");
		System.out.println("Now the String is :" + str);
	}
}