import java.util.Scanner;
public class rechargedUnluckNumbers{

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        char  MaSorte[]={'1' , '3'};

        String entrada=scanner.nextLine();

        boolean maSorte= false;

        for (int i=0;i<entrada.length() -1;i++){

            char caractereAtual= entrada.charAt(i);
            char caractereSeguinte= entrada.charAt(i+1);


                if (caractereAtual== MaSorte[0] && caractereSeguinte== MaSorte[1]){

                    maSorte= true;
                }
            
        }

        if (maSorte){

            System.out.println (entrada + " es de Mala Suerte");
        } else{
            System.out.println (entrada + " No es de Mala Suerte");
        }
    }
}