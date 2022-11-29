import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        double price,vatratio,vatamount;
        Scanner input=new Scanner (System.in);

        System.out.print("KDV'siz Ürün Fiyatı:");
        price=input.nextDouble();

        boolean comp=(price>0)&&(price<=1000);
        vatratio=comp?0.18:0.08;                    // 0 ve 0'dan küçük değerler için programlanmadı
        System.out.println("KDV Oranı:" +vatratio);

        vatamount=price*vatratio;
        System.out.println("KDV Tutarı:"+vatamount);
        System.out.print("KDV'li Ürün Fiyatı:"+(price+vatamount));

    }
}
