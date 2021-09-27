class PsdMaker
{
    public static void main(String args[])
	{
        String s1=args[0];
        int flag=0;
        int length = s1.length();
        char c=s1.charAt(0);
        // System.out.println("test output: " + c);
        if (c>='A'&&c<='Z') {
            flag++;
        }
        if (length>=8&&length<=15) {
            flag++;
        }
        if (s1.charAt(length-1)>='0'&&s1.charAt(length-1)<='9') {
            flag++;
        }
        for(int i=1;i<=length-2;i++){  
            if (s1.charAt(i)>='a'&&s1.charAt(i)<='a') {
                flag++;
                break;
            }
        }
        int a;
        for(int i=1;i<=length-2;i++){  
            a=s1.charAt(i);
            // System.out.println("test output: " + a);

            if (a>=33&&a<=47) {
                flag++;
                break;
            }
            if (a>=58&&a<=64) { 
                flag++;
                break;
            }
            if (a>=91&&a<=96) {
                flag++;
                break;
            }
        }
        // System.out.println("test output: " + flag);
        if(flag==5)
      {
         System.out.println("Valid Password ");
      }
      else
      {
         System.out.println("Invalid Password");
      }


        // System.out.println("string length is: "+args.length());
        // System.out.println("test output: " + args.length);
        // System.out.println("test output: " + s1);
        // System.out.println("test output: " + s1.length());

	}
}