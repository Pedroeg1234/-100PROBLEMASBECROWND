import java.util.Scanner;

public class bloggoshortcuts{

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String texto= scanner.nextLine();

        StringBuilder str= new StringBuilder();

        boolean abreFechaBold= true;
        boolean abreFechaItalic= true;

        for (int i=0;i<texto.length();i++){

            char caractereAtual= texto.charAt(i);

            if (caractereAtual=='_'){

                if (abreFechaItalic){

                    str.append("<i>");

                    abreFechaItalic= !abreFechaItalic;
                } else {
                    str.append ("</i>");

                    abreFechaItalic= !abreFechaItalic;
                }
            } 

            else if (caractereAtual== '*'){

                if (abreFechaBold){

                    str.append("<b>");

                    abreFechaBold= !abreFechaBold;

                } else{

                    str.append("</b>");
                }
            } else{

                str.append(caractereAtual);
            }
        }

        System.out.println(str.toString());

    }
}