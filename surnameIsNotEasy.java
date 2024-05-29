import java.util.Scanner;

public class surnameIsNotEasy{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);


        int quantidade=scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<quantidade;i++){

            String word= scanner.nextLine();
            boolean surnameIsEasy=false;

           
            for (int j=0;j<word.length();j++){

                char caractereAtual= word.charAt(j);
                int Easy=0;
                for (int k=j; k< word.length(); k++){
                    
                    char caractereWord= word.charAt(k);
                    if (EhConsoante(caractereWord)){

                        Easy++;
                    } else{

                        break;
                    }

                    if (Easy==3){

                        surnameIsEasy=true;
                    }
                }
            }

            if (surnameIsEasy){
                System.out.println (word + " nao eh facil");
            } else{
                System.out.println (word + " eh facil"); 
            }
        }

    }

    public static boolean EhConsoante(char letra){

        if (letra!= 'A' && letra!='a' 
        && letra!= 'E' && letra!= 'e' 
        && letra!='I' && letra!= 'i'
        && letra!='O' && letra!='o'
        && letra!='U' && letra!='u'){

            return true;
        } else{

            return false;
        }

    }
}