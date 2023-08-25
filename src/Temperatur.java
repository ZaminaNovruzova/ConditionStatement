import java.util.Scanner;

public class Temperatur {
    //6.Bir temperatur dəyişəni goturun onun dəyərini yoxlamaq üçün if-else-den istifadə edin.
    //Temperatur 0-dan az olarsa, proqram "soyuq",Temperatur 0 ilə 30 arasında olarsa, proqram "İlıq", Temperatur 30 ilə 50 arasında olarsa,
    //proqram "İsti" çap edəcək. Temperatur 50-dən çox və ya ona bərabər olarsa, proqram "cox Isti" cap etsin.
    public static void main(String[] args) {
        Scanner temperatur=new Scanner(System.in);
        System.out.println("derece:");
        int derece=temperatur.nextInt();
        if(derece<0)
            System.out.println("soyuq");
        else if (0<derece&& derece<30)
            System.out.println("Iliq");
        else if (30<derece&& derece<50)
            System.out.println("Isti");
        else if (derece>=50)
            System.out.println("Cox isti");
    }
}
