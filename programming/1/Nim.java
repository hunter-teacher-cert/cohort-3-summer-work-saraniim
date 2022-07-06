import java.io.*;
import java.util.*;

public class Nim  
{
    public static void main(String[] args)    
  {
    //include message tih name of game and objject of game
    
      int stones = 12;
      
      int stonesTaken;
    
    Scanner input = new Scanner(System.in);
    
    //loop until game end
    while(stones>0){
    
      //prompt user input
      System.out.println("Please pick how many stones to remove - between 1 and 3");
      int user = input.nextInt();
      
      //calcremaining stones.print
      //long version of below stones = stones - user
        stones -= user;
      System.out.println("You picked " + user);
      System.out.println("There are  "+ stones + " remaining.");        
      //check for win
      if (stones == 0){
        System.out.println("You win!");
        break;
      }
      //machine turn

      //check for win
      
    }
    }
  }
  