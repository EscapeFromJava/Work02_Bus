import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,h,sum;
        System.out.print("Введите количество мостов: ");
        n = in.nextInt();
        for(i=1; i<=n; i++){
            System.out.println("Введите высоту "+i+" моста: ");
            h = in.nextInt();
            sum =+h;
            if (h<=437)  {
                System.out.println("Crash " + i);
                break;
            }
            if (i==n)
                System.out.println("No crash");
        }
    }
}