/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guajardo_3rd_challenge0;

/**
 *
 * @author rguajardo0103
 */
public class Guajardo_3rd_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<1000; i++){
            
        if(isDivisibleByFive(i) & isDivisibleByEleven(i)) {
           
                System.out.println("Animate Thias");
            
        }else if (isDivisibleByThree(i) & isDivisibleByEleven(i)){
            System.out.println("Herr Direktor");
        }else if (isDivisibleByTwo(i) & isDivisibleByEleven(i)){
            System.out.println("Ninja");
        }else if (isDivisibleByTwo(i) & isDivisibleByThree(i) & isDivisibleByFive(i)){
            System.out.println("Team Building");   
        }else if (isDivisibleByTwo(i) & isDivisibleByThree(i)){
            System.out.println("Chisme");
        }else if (isDivisibleByThree(i) & isDivisibleByFive(i)){
            System.out.println("Old School");
        }else if (isDivisibleByTwo(i)){
            System.out.println("Davis");
        }else if (isDivisibleByThree(i)){
            System.out.println("Claughton");
        }else if (isDivisibleByFive(i)){
            System.out.println("Vidal");
        }
        
        
        
    else{
            System.out.println(i);
        }
        }
    } 
       static boolean isDivisibleByTwo(int somenumber){
           return (somenumber % 2 == 0);
       }
       static boolean isDivisibleByThree(int somenumber){
           return (somenumber % 3 == 0);
       }
       static boolean isDivisibleByFive(int somenumber){
           return (somenumber % 5 == 0);
       }
       static boolean isDivisibleByEleven(int somenumber){
           return (somenumber % 11 == 0);
       }
}
