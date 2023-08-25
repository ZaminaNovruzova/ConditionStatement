import java.util.Scanner;

public class Example8 {
    //8.switch ile ilde olan ay-lari tapmaq
    public static void main(String[] args) {
        Scanner ay=new Scanner(System.in);
        System.out.println("ay");
        int x=ay.nextInt();
        switch (x) {
            case 1:
                System.out.println("yanvar");
                break;
            case 2:
                System.out.println("fevral");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("aprel");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("iyun");
                break;
            case 7:
                System.out.println("iyul");
                break;
            case 8:
                System.out.println("avqust");
                break;
            case 9:
                System.out.println("sentyabr");
                break;
            case 10:
                System.out.println("oktyabr");
                break;
            case 11:
                System.out.println("noyabr");
                break;
            case 12:
                System.out.println("dekabr");
                break;
            default:
                System.out.println("hatali");


        }
    }
}
