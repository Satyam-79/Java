class Tax
{ 
  public static void main(String args[])
  {
    double Income = Double.parseDouble(args[0]);
    String Category = args[1];
    String myStr1 = "General";
    String myStr2 = "Women";
    
    double Tax;
    if(Category.equalsIgnoreCase(myStr1)&&Income<=180000||Category.equalsIgnoreCase(myStr2)&&Income<=190000)
    {
        Tax = 0;
           System.out.println("Tax is : "+Tax);
    }
    else if(Income<=180000)
        {
            Tax = 0;
            System.out.println("Tax is : "+Tax);
        }
        else if(Income<=500000)
        {
             Tax = 180000*0+(Income - 180000)*0.10;
             System.out.println("Tax is : "+Tax);
        }
        else if(Income<=800000)
        {
             Tax = 180000*0+500000*0.10+(Income - 500000)*0.20;
             System.out.println("Tax is : "+Tax);
        }
        else if(Income>800000)
        {
             Tax = 180000*0+500000*0.10+800000*0.20+(Income - 800000)*0.30;
             System.out.println("Tax is : "+Tax);
      }
   
   else
   {
     System.out.println("wrong choice");
   }
 }
}