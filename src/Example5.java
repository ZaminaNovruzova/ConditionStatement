import java.util.Scanner;

public class Example5 {
    //5.Ədədin cüt və ya tək olduğunu yoxlamaq üçün proqram yazın
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("eded:");
        int eded=input.nextInt();
        if (eded%2==0&&eded!=0)
            System.out.println("deyisen cut ededdir");
        else if(eded!=0) {
            System.out.println("deyisen tek ededdir");
        }else {
            System.out.println("deyisen ne tek ne de cut ededdir");
        }
    }
}
