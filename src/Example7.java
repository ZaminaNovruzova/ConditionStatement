import java.util.Scanner;

public class Example7 {
    //7.switch ile heftenin gunlerini tapmaq
    public static void main(String[] args) {
        Scanner hefteninGunu =new Scanner(System.in);
        System.out.println("gun");
        int x=hefteninGunu.nextInt();
        switch (x){
            case 1:
                System.out.println("bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                 System.out.println("bazar");
            default:

                    System.out.println("hatali ");

        }
    }
}
