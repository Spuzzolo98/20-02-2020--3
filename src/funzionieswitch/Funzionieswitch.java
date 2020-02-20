
package funzionieswitch; //DA CONTINUARE A CASA
import java.util.Scanner;

public class Funzionieswitch 
{

    
    public static void main(String[] args) 
    {
        Scanner kekkeroni = new Scanner(System.in);
        int casistica=0;
        int controllo=0;
        System.out.print("kekosavorresti fare? ");
        switch(controllo)
        {
            case 1: casistica=1;
            case 2: casistica=2;
            case 3: casistica=3;
            case 4: casistica=4;
            case 5: casistica=5;
            case 6: casistica=6;
            case 7: casistica=7;
        }
        System.out.print(casistica);
        
        
        
    }
    
}
