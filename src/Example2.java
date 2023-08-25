import java.util.Scanner;

public class Example2 {
    //2.Üç ədəd arasında en kiciyi tapmaq üçün proqram yazın
    public static void main(String[] args) {
        Scanner minEded=new Scanner (System.in);
        System.out.println("eded1:, eded2:, eded3:");
        int eded1=minEded.nextInt();
        int eded2=minEded.nextInt();
        int eded3=minEded.nextInt();
        if (eded1<eded2 && eded1<eded3)
            System.out.println("en kicik eded: "+eded1 );
        else if (eded2<eded1 && eded2<eded3)
        System.out.println("en kicik eded: "+eded2 );
        else if (eded3<eded1 && eded3<eded2)
            System.out.println("en kicik eded: "+eded3);
    }
}
