// to calculate Tax according to tax slabs and category.
public class Tax {
     public static void main(String args[]) {
          double Income = Double.parseDouble(args[0]);
          String Category = args[1];
          String myStr1 = "General";
          String myStr2 = "Women";
          double Tax;

          if (Category.equalsIgnoreCase(myStr1)) {
               if (Income <= 180000) {
                    Tax = 0;
               } else if (Income <= 500000) {
                    Tax = 180000 * 0 + (Income - 180000) * 0.10;
               } else if (Income <= 800000) {
                    Tax = 180000 * 0 + 500000 * 0.10 + (Income - 500000) * 0.20;
               } else {
                    Tax = 180000 * 0 + 500000 * 0.10 + 800000 * 0.20 + (Income - 800000) * 0.30;
               }
               System.out.println("Tax is : " + Tax);

          } else if (Category.equalsIgnoreCase(myStr2)) {
               if (Income <= 190000) {
                    Tax = 0;
               } else if (Income <= 500000) {
                    Tax = 190000 * 0 + (Income - 190000) * 0.10;
               } else if (Income <= 800000) {
                    Tax = 190000 * 0 + 500000 * 0.10 + (Income - 500000) * 0.20;
               } else {
                    Tax = 190000 * 0 + 500000 * 0.10 + 800000 * 0.20 + (Income - 800000) * 0.30;

               }
               System.out.println("Tax is : " + Tax);

          } else {
               System.out.println("wrong choice");
          }
     }
}