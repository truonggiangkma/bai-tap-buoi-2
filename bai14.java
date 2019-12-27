import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        String string1,string2,string3;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chuoi 1 : ");
        string1 = sc.nextLine();
        System.out.print("\nNhap chuoi 2 : ");
        string2 = sc.nextLine();
        string3 = string1.concat(string2);
        System.out.print("\nNoi 2 chuoi vua nhap ta duoc : "+string3);
    }
}
