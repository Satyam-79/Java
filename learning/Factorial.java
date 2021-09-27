class Factorial
{
   public static void main(String args[])
   {
      int n = Integer.parseInt(args[0]);
      int p = 1;
      while(n>=1)
      {
         p = p*n;
         n--;
      }
      System.out.println("Factorial is : "+p);
    }
}