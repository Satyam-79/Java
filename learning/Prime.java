class Prime
{
   public static void main(String args[])
   {
      int n = Integer.parseInt(args[0]);
      int i = 1;
      int count = 0;
      while(i<=n)
      {
      if(n%i==0)
      {
        count++;
      }
      i++;
      }
      if(count==2)
      {
         System.out.println("Prime number ");
      }
      else
      {
         System.out.println("Not prime ");
      }
   }
}

