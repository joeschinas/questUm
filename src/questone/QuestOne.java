
package questone;

import java.util.Locale;
import java.util.Scanner;


public class QuestOne {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read= new Scanner (System.in);
        double count=0;
        double num;
        do{
        
  System.out.println("Digite o numero de 1 a 100, tente descobrir o numero sorteado: "); 
   num = read.nextDouble();
   count++;
  
  if(num<51){
                System.out.println("numero sortedo é maior que :"+num);
  }
  else if(num>51){
  
  
      System.out.println("numero sorteado é menor :"+num);
  }
  
  
  
  
        }while(51!=num);
        System.out.println("parabens vc acertou o numero da sorte:"+51);
        System.out.println("voce jogou :"+count);
        
        read.close();
    }
    
}
