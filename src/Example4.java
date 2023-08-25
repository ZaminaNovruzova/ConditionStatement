import java.util.Scanner;

public class Example4 {
    //4.Ədədin 2-ə və 5-ə bölünüb-bölünmədiyini yoxlamaq üçün proqram yazın
    public static void main(String[] args) {
        Scanner eded=new Scanner(System.in);
        System.out.println("eded:");
        int x=eded.nextInt();
                if (x%2==0 && x%5==0)
                    System.out.println("eded 2 ve 5 e bolunur");
                else {
                    System.out.println("eded 2 ve 5e bolunmur");
                }
    }
}
