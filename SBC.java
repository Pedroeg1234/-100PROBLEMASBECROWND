import java.util.Scanner;

public class SBC {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int n2;
        while(sc.hasNext()){
            n=sc.nextInt();
            n2=n;
            int[] t=new int[n];
            int[] c=new int[n];
            int tempo=0;
            int i=0;
            while(n>0){
             t[i]=sc.nextInt();
             c[i]=sc.nextInt();
               i++;
                n--;
            }
            for(int j=0;j<(n2-1);j++){
                if(c[j]<t[j+1]){
                    tempo+= c[j]+(t[j+1]-c[j]);
                }
                else{
                    tempo+=c[j];
                }
            }
            System.out.println(tempo);

        }
    }
}