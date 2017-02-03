public  class StringBuffDel
{
	
public static void main(String args[])
{
	StringBuffer str1 = new StringBuffer("Impossible");
	System.out.print("The word " +str1);
	str1.delete(0,2);
	System.out.println("is changed to" +str1);
}
}