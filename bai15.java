import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        String string;
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chuoi : ");
        string = sc.nextLine();
        System.out.println("==============MENU============");
        System.out.println(" 1 : Viet hoa toan bo chuoi ");
        System.out.println(" 2 : Viet thuong toan bo chuoi ");
        System.out.println(" 3 : Thoat");
        System.out.print("Ban chon : ");
        value = sc.nextInt();
        switch(value){
            case 1:
                System.out.print("Viet hoa toan bo chuoi : "+string.toUpperCase());
                break;
            case 2:
                System.out.print("Viet thuong toan bo chuoi : "+string.toLowerCase());
                break;
            case 3:
                break;
        }
    }
}
