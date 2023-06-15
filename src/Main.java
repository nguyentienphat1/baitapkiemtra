import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void tongmang(int a[]){
        int tong=0;
        System.out.println("tong mang la");
        for (int i=0;i< a.length;i++){
            tong= tong+ a[i];
        }
        System.out.println(tong);
    }
    public static void tongchan(int a[]){
        int tong=0;
        System.out.println("tong chan la ");
        for (int i=0;i< a.length;i++){
            if (a[i]%2==0){
                tong = tong+a[i];
            }
        }
        System.out.println(tong);
    }
    public static void tongle(int a[]){
        int tong=0;
        System.out.println("tong le la :");
        for (int i=0;i< a.length;i++){
            if (a[i]%2!=0){
                tong=tong +a[i];
            }
        }
        System.out.println(tong);
    }
    public static boolean isprime( int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i< n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void xuli(int a[]){
        int tong=0;
        System.out.println("tong cac so nguyen to la : ");
        for (int i=0;i< a.length;i++){
            if (isprime(a[i])){
                tong = tong +a[i];
            }
        }
        System.out.println(tong);
    }
    public static void themmang(int a[], int z, int n){
        int array1[] = new int [n+1];
        for (int i=0;i< a.length;i++){
            array1[i+1]=a[i];
        }
        for (int i=0;i< array1.length;i++){
//            array1[i+1]=array1[i];
            array1[0]=z;
            System.out.println(" mang sau khi them phan tu la : "+array1[i]);
        }
    }
    public static void xoaphantu(int a[],int k,int n){
        for (int i=k;i< a.length-1;i++){
            a[i]= a[i+1];
        }
        int array1[] = new int[n-1];
        for (int i=0;i< n-1;i++){
            array1[i]= a[i];
            System.out.println(" mang sau khi xoa phan tu la : "+array1[i]);
        }
    }
    public static void xuatvitri(int a[],int x){
        for (int i=0;i< a.length;i++){
            if (a[i]==x){
                System.out.println("vi tri cua phan tu x la "+i);
            }
        }
    }
    public static void main(String[] args) {
        int n;
        boolean contuneu = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n= scanner.nextInt();
        int array[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap gia tri phan tu : "+i);
            array[i]= scanner.nextInt();
        }
        do {
            System.out.println(" 1. tong cua mang ");
            System.out.println("2. tong chan cua mang");
            System.out.println("3. tong le cua mang");
            System.out.println("4. tong so nguyen to trong mang");
            System.out.println("5. them 1 phan tu trong mang");
            System.out.println(" 6.xoa phan tu thu k cua mang");
            System.out.println(" 7.xuat vi tri cua x trong mang");
            System.out.println("0. ket thuc chuong trinh");
            System.out.println("nhap chon");
            int chon = scanner.nextInt();
            switch (chon){
                case 1:
                        tongmang(array);
                        break;
                case 2:
                    tongchan(array);
                    break;
                case 3:
                    tongle(array);
                    break;
                case 4 :
                    xuli(array);
                    break;
                case 5:
//                    int array1[] = new int [n+1];
//                    for (int i=0;i< n;i++){
//                        array1[i+1]=array[i];
//                    }
                    System.out.println("nhap z");
                    int z= scanner.nextInt();
                    themmang(array,z,n);
                    break;
                case 6:
                    System.out.println("nhap k");
                    int k = scanner.nextInt();
                    xoaphantu(array,k,n);
                    break;
                case 7:
                    System.out.println("nhap x");
                    int x = scanner.nextInt();
                    xuatvitri(array,x);
                case 0:
                    System.out.println("ket thuc chuong trinh");
                    contuneu= false;
                default:
                    System.out.println(" nhap chon sai xin nhap lai");
            }
        }while (contuneu);
    }
}