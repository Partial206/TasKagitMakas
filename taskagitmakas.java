import java.io.ObjectInputFilter.Status;
import java.util.Scanner;


public class taskagitmakas {
    public static void main(String[] args) {
       for(int i = 2; i > 1; i++){
        int random = (int)(Math.random() * 3 - 1 + 1) +  1;
       String yapayzekaninsecimi;
       Scanner scan = new Scanner(System.in);
       System.out.println("Bir Seçim yap Tas mı Kagit mı Makas mı?");
       String a = scan.nextLine();
       if(a.isEmpty() == true){
         System.out.println("Sistem 206 koduyla çıkış yaptı");
         System.exit(206);
       }
       switch(random){
        case 1:
        yapayzekaninsecimi = "Taş";
        System.out.println("Karşı Taraf " + yapayzekaninsecimi + " Seçti");
        System.out.println("Sen ise " + a + " Seçtin");
        switch(a){
         case "Kagit":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kazandın!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         break;
         case "Tas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kaybettin!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kazandın");
         }
         break;
         case "Makas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kazandin");
         }
         break;
        }
        break;
        case 2:
        yapayzekaninsecimi = "Kağıt";
        System.out.println("Karşı Taraf " + yapayzekaninsecimi + " Seçti");
        System.out.println("Sen ise " + a + " Seçtin");
        switch(a){
         case "Kagit":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kazandın!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         break;
         case "Tas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kaybettin!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kazandın");
         }
         break;
         case "Makas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kazandin");
         }
         break;
        }
        break;
        case 3:
        yapayzekaninsecimi = "Makas";
        System.out.println("Karşı Taraf " + yapayzekaninsecimi + " Seçti");
        System.out.println("Sen ise " + a + " Seçtin");
        switch(a){
         case "Kagit":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kazandın!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         break;
         case "Tas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kaybettin!");
         }
         if(yapayzekaninsecimi == "Makas"){
            System.out.println("Yapay Zekaya Karşı Kazandın");
         }
         break;
         case "Makas":
         if(yapayzekaninsecimi == a){
            System.out.println("Berabere");
         }
         if(yapayzekaninsecimi == "Taş"){
            System.out.println("Yapay Zekaya Karşı Kaybettin");
         }
         if(yapayzekaninsecimi == "Kağıt"){
            System.out.println("Yapay Zekaya Karşı Kazandin");
         }
         break;
        }
        break;
       }
       }
    }
}
