import java.util.Scanner;

public class test {
}
public static void main(String[] args) {
    int n1, n2, select;

    Scanner input = new Scanner(System.in);
    System.out.println("Ilk Sayiyi Giriniz");
    n1 = input.nextInt();
    System.out.println("Ikinci Sayiyi Giriniz");
    n2 = input.nextInt();

    System.out.println("1=Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
    System.out.print("Seciminiz  :");
    select = input.nextInt();

    System.out.println(select);

    switch (select) {
        case 1:
            System.out.println("Sonuc : " + (n1 + n2));
            System.out.print("Program Bitti");
            break;

        case 2:
            System.out.println("Sonuc : " + (n1 - n2));
            System.out.print("Program Bitti");
            break;

        case 3:
            System.out.println("Sonuc : " + (n1 * n2));
            System.out.print("Program Bitti");
            break;

        case 4:
            switch (n2){
                case 0:
                System.out.println("Bir Sayi 0'a bolunemez!");
                break;

                default:
                System.out.println("Sonuc : " + (n1 / n2));
                break;
            }

            System.out.println("Program Bitti");
            break;

        default:
            System.out.println("Hatali Giris Yaptiniz");

    }
    }