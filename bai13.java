import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        String string;
        char x,y;
        int dem=0,length;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chuoi : ");
        string = sc.nextLine();
        System.out.print("\nNhap 1 ki tu ban muon kiem tra : ");
        x = sc.nextLine().charAt(0);
        length = string.length();
        for(int i = 0 ; i < length ; i++){
            y = string.charAt(i);
            if(y == x){
                dem++;
            }
            else
                continue;
        }
        if(dem != 0){
            System.out.print("\nKi tu '"+x+"' co trong chuoi, va xuat hien "+ dem +" lan . ");
        }
        else
            System.out.print("\nKi tu '"+ x +"' khong co trong chuoi . ");


    }
}
