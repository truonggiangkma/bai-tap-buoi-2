import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int duong[] = new int[20],p = 0;
        int am[] = new int[20],q = 0;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n;i++){
            if(arr[i] > 0)
                duong[p++] = arr[i];
            else
                am[q++] = arr[i];
        }
        int tg;
        for(int i = 0 ; i < p-1 ; i++){
            for(int j = i+1 ; j < p ; j++){
                if(duong[i] > duong[j]){
                    tg = duong[i];
                    duong[i] = duong[j];
                    duong[j] = tg;
                }
            }
        }
        for(int i = 0 ; i < q-1 ; i++){
            for(int j = i+1 ; j < q ; j++){
                if(am[i] < am[j]){
                    tg = am[i];
                    am[i] = am[j];
                    am[j] = tg;
                }
            }
        }
        for(int  i = 0 ; i < p ; i++)
            System.out.print(" " + duong[i]);
        for(int  i = 0 ; i < q ; i++)
            System.out.print(" " + am[i]);
    }
}
