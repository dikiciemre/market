import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Arrays;
import java.util.Scanner;

public class categories extends Main{

    String[] stringArray = new String[6];

    greengrocery manav1 = new greengrocery();
    Butcher butcher1 = new Butcher();

    Scanner scanner = new Scanner(System.in);
    public void check(){ /** kullanıcıdan kategori seçtirdik. **/
       System.out.println("1-)GROCERY 2-)BUTCHER");
       int categories = this.scanner.nextInt();


    if(categories == 1){ /** manav reyonu için ürün seçimi yapıldı **/
        System.out.println("You Choosed Grocery Categories.");
        System.out.println(Arrays.toString(manav1.urunler));
        System.out.println("Please select a product for add to your basket");

        int select = this.scanner.nextInt();
        if (select == 1){
            System.out.println("You chossed apple.\n Apple price : 3 $ ");
            stringArray[0] = "apple";
            check();
        }else if (select == 2){
            System.out.println("You chossed Banana.\n Banana price : 5 $");
            stringArray[1] = "banana";
            check();
        }else if (select == 3){
            System.out.println("You chossed Peach.\n Peach price : 7 $ ");
            stringArray[2] = "peach";

            check();
        }else if(select == 4){ /** kullanıcı 4 değerini seçerse döngüden çıkar ve aldığı ürünleri kullanıcıya bastırır **/
          System.out.println("CALCULATİNG..");
            for (int i = 0; i < 6; i++) {
                System.out.println((i+1) + ". değer: " + stringArray[i]);
            }

        } else{
            showMessageDialog(null, "Please Make Sure You Choose The Correct Button ");
        }



    }else if(categories == 2){ /** kasap reyonu için ürün seçimi yapıldı **/
        System.out.println("You Choosed Butcher Categories.");
        System.out.println(Arrays.toString(butcher1.urunler1));
        System.out.println("Please select a product for add to your basket");

        int select = this.scanner.nextInt();
        if (select == 1){
            System.out.println("You chossed Beef.\n beef price : 13 $ ");
            stringArray[3] = "beef";
            check();
        }else if (select == 2){
            System.out.println("You chossed Pork.\n pork price : 10 $ ");
            stringArray[4] = "pork";
            check();
        }else if (select == 3){
            System.out.println("You chossed Chicken. \n chicken price : 12 $");
            stringArray[5] = "chicken";
            check();
        }else if(select == 4){
            System.out.println("CALCULATİNG..");
            for (int i = 0; i < 6; i++) {
                System.out.println((i+1) + ". değer: " + stringArray[i]);
            }

        }else{
            showMessageDialog(null, "Please Make Sure You Choose The Correct Button ");
        }

    }else{
        System.out.println("Please Make Sure You Choose The Correct Button");
    }
    }



}
