package auction.app;

import auction.items.Item;
import auction.logic.Manager;
import auction.users.Buyer;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Manager var1 = new Manager();
      Item var2 = new Item("HP Laptop", (double)500.0F);
      Buyer var3 = new Buyer("Nivi", (double)1000.0F);
      Buyer var4 = new Buyer("Rishi", (double)1200.0F);
      
        System.out.println("Auction Begins...\n");
      try {
         var1.placeBid(var3, var2, (double)600.0F);
         var1.placeBid(var4, var2, (double)400.0F);
      } catch (Exception var7) {
         System.out.println("Error: " + var7.getMessage());
      }

      try {
         var1.placeBid(var4, var2, (double)1100.0F);
      } catch (Exception var6) {
         System.out.println("Error: " + var6.getMessage());
      }

      var1.finish(var2);
      
        System.out.println("Auction Ends...");
   }
}
