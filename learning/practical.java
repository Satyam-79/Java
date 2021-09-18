class practical
{
  public static void main(String args[])
  {
    int N=Integer.parseInt(args[0]);
    int g = N/144;
    int a = N%144;
    int d = a/12;
    int l = a%12;
    System.out.println("Your number of eggs in gross is: "+g);
    System.out.println("Your number of eggs in dozen is: "+d);
    System.out.println("Your number of eggs left out is: "+l);
  }
}