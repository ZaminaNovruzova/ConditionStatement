import java.util.Scanner;

public class Example3 {
    //3.Ədədin mənfi, müsbət və ya sıfır olduğunu yoxlamaq üçün proqram yazın
    public static void main (String []args){
        Scanner input2 = new Scanner(System.in);
        System.out.println("eded:");
        int eded = input2.nextInt();

        if (eded < 0)
            System.out.println("eded menfidir");
        else if (eded > 0)
            System.out.println("eded1 musbetdir");
        else if (eded==0)
            System.out.println("eded1 sifira beraberdir");
    }
}
