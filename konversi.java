import java.util.Scanner;
 
public class konversi {
    float idr, usd, jpy;
    
    Scanner masukan = new Scanner(System.in);

    public static void main(String[] args) {
        int i,k;
        Scanner masukan1 = new Scanner(System.in);
        konversi uang = new konversi();
        System.out.println("Berapa banyak perulangan konversi mata uang : ");
        k = masukan1.nextInt();
        System.out.println();
        for(i=1; i<=k; i++){
        uang.IDR();
        uang.USD();
        uang.JPY();}
    }
    
    void IDR(){
        System.out.print("Masukan Rupiah =");
    idr = masukan.nextFloat();
    }
    void USD(){
    usd = (float) (idr*0.000071);
    System.out.println("hasil IDR ke USD = "+usd);
    }
    void JPY(){
    jpy = (float) (idr*0.0077);
    System.out.println("hasil IDR ke JPY ="+jpy);
    System.out.println();
    System.out.println();
    }
}