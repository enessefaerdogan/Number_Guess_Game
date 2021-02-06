
package tahmin_oyunu;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Tahmin_Oyunu {
    public static final String ANSI_RESET = "\u001B[0m"; 
public static final String ANSI_BLACK = "\u001B[30m"; 
public static final String ANSI_RED = "\u001B[31m"; 
public static final String ANSI_GREEN = "\u001B[32m"; 
public static final String ANSI_YELLOW = "\u001B[33m"; 
public static final String ANSI_BLUE = "\u001B[34m"; 
public static final String ANSI_PURPLE = "\u001B[35m"; 
public static final String ANSI_CYAN = "\u001B[36m"; 
public static final String ANSI_WHITE = "\u001B[37m"; 
   

    public static void main(String[] args) throws InterruptedException {
       
        Scanner input=new Scanner(System.in);
        
                
        Random r=new Random();
        
        System.out.println(">>>Number Guessing Game<<<");
        
        String[]isim=new String[1];
        for(int j=0;j<isim.length;j++){
              System.out.println("Please enter your name :  ");
             isim[j]=input.next();
              System.out.println(isim[j]+" welcome!");
        }
        System.out.println("I wanna learn information about the game.(1)"+"\n"+"I wanna play the game.(2)");
        int secim=input.nextInt();
       switch (secim){
           
           case 1:
               
           System.out.println("1-Random Numbers are between 0-100."+"\n"+"2-Your guess should be between 0-100.");
           TimeUnit.SECONDS.sleep(2);
           
           case 2:
               
            
        System.out.print("Determine how many times you will guess :  "+"\n");
        int tahminsınır=input.nextInt();
        int puan=3;
        System.out.print(ANSI_BLUE+" Starting points you have : "+puan+"\n"+ANSI_RESET);
    
        for(int i=0;i<tahminsınır;i++){
            
           int a=r.nextInt(100);
           
           System.out.print("A random number is drawn...  "+"\n");
           TimeUnit.SECONDS.sleep(1);

           System.out.print("What's your guess? : "+"\n");
           int tahmin=input.nextInt();
           int b=Math.abs(a-tahmin);
           
           if(b<=5){
               puan+=4;
           System.out.println(ANSI_GREEN +" Congratulations! You earned 4 points."+ ANSI_RESET);
           }
           if(b<15 && b>5){
               
               puan+=3;
               System.out.println(ANSI_GREEN +" Congratulations! You earned 3 points."+ ANSI_RESET);
           }
           if(b<=30 && b>14){
               puan+=2;
               System.out.println(ANSI_GREEN +" Congratulations! You earned 2 points."+ ANSI_RESET);
           }
           if(b<45 && b>30){
               
               puan++;
               System.out.println(ANSI_GREEN +"Congratulations! You earned 1 points."+ ANSI_RESET);
           }
           if(b>=45){
               puan--;
                System.out.println(ANSI_RED +" Sorry, you lost 1 point."+ ANSI_RESET);
           }
         
            System.out.println("What was the number withdrawn from the bag ? : "+a);
        }
       System.out.print(ANSI_BLUE+" Total point you have : "+puan+ANSI_RESET+"\n");
        
        break;
           
           
       }
        
    }
    
}
