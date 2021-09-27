//Command-line args
class CmdLine
{
	public static void main(String args[])
	{
		int a=123;	//static approach
		int b=Integer.parseInt(args[0]);		//Wrapper class or type conversion
		String c=args[1];

		System.out.println(a);
		System.out.println("b equals to ="+b);
		System.out.println("c equals to ="+c);
	}
}