import java.util.Scanner;

public class Example1 {
    //1.İki ədəd arasında maksimumu tapmaq üçün proqram yazın
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eded1:");
        System.out.println("eded2:");
        int eded1 = input.nextInt();
        int eded2 = input.nextInt();

        if (eded1 > eded2)
            System.out.println("max eded: "+ eded1);
        else {
            System.out.println("max eded: "+ eded2);
        }

    }
}