/**
 * santastranslator
 */

 import java.util.Scanner;
public class santastranslator {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String[] countries = {
            "brasil", "alemanha", "austria", "coreia", "espanha", "grecia", 
            "estados-unidos", "inglaterra", "australia", "portugal", "suecia", 
            "turquia", "argentina", "chile", "mexico", "antardida", "canada", 
            "irlanda", "belgica", "italia", "libia", "siria", "marrocos", "japao"
        };

        String[] translations = {
            "Feliz Natal!", "Frohliche Weihnachten!", "Frohe Weihnacht!", 
            "Chuk Sung Tan!", "Feliz Navidad!", "Kala Christougena!", 
            "Merry Christmas!", "Merry Christmas!", "Merry Christmas!", 
            "Feliz Natal!", "God Jul!", "Mutlu Noeller", "Feliz Navidad!", 
            "Feliz Navidad!", "Feliz Navidad!", "Merry Christmas!", 
            "Merry Christmas!", "Nollaig Shona Dhuit!", "Zalig Kerstfeest!", 
            "Buon Natale!", "Buon Natale!", "Milad Mubarak!", "Milad Mubarak!", 
            "Merii Kurisumasu!"
        };

        int n= scanner.nextInt();
        scanner.nextLine();
        for (int z=0;z<n;z++){
        String entrada= scanner.nextLine();
            boolean encontrou= false;
        for (int i=0;i< countries.length;i++){

            if (entrada.equals(countries[i])){

                System.out.println(translations[i]);
                encontrou=true;
            }
        }

        if (!encontrou){

            System.out.println ("--- NOT FOUND ---");
        }

    }
}
}