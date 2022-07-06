import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: First Last, First Last
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    //creates 2 d board
    char[][] board = new char[rows][cols];
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < cols; y++){
        board[x][y] = '+';  //amanda: i just read that the dead cells are ' ' - Saranii: okkie dokie
      } 
    } // for int x
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    //how many rows
    int rows = board.length;
    //how many columns
    int cols = board[0].length;    //who are you counting the col from??
                                // or ask yourself, what does the first [] represent?x? rows? yes! so you can write [0] to represent the first row yes!! ^_^ 👍 hahaha no no its teamwork!
//Great teacher amanda!
    //happy to visit your HS and take your class amanda LOL aww haha ty ^_^
 //following line creates a loop to iterate through the rows i = 0 so we start at 0, then I will go up one by one until it is less the number of rows
    for(int x = 0; x < rows; x++){      // rows = 3
      for(int y = 0; y < cols; y++){    // col = 3
        System.out.print(board[x][y] + " ");
      }
      System.out.println(); // 
    }
  }



  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    //given board, access the element by r and c
    board[r][c] = val;
  }


  //Counts number of living neigbours of board[r][c] and returns it
  public static int countNeighbours( char[][] board, int r, int c )
  {

    int count; //declare
    count = 0; //initalize

    // char current = board[r][c];
    // char neighbor = board[rown][coln]
    
    // int count = 0;
    
    //First loop; start in the row above which is row-1 go through row until the row cvalue is less than or equal to row+1 which is the row below the target , increment up until stop point is reached

    // rown = row neighbor
    // coln = col neighbor
    for (int rown = r-1; rown <= r+1; rown++){     // starts with the row above 
      if (rown >= 0 && rown < board.length) {      // checks for in bound
        for (int coln = c-1; coln <= c+1; coln++){  // starts with col to the left
          if (coln >= 0 && coln < board[r].length){ // checks for in bound
            if(rown == r && coln == c)              // checks to see if it's the target
              continue;
            else{ // if there is a neighbor
              // count the neighbors IF it's alive
              // if (neighbor == alive)
              if (board[rown][coln] == 'X')
                count++; // 
              
            }
            
          }
        }
      }
      
    }
    return count;
  } // NEIGHBORS row, col,
  
  // cell r, c

  // (BOARD, 2,2)
  // X X X O  
  // X X X O
  // X X @ O
  // O O O O
  // 3

  
  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    //mise en place
    char currentCell, nextCell; //declaring the 2 different types of char we are using
    int count; //how many are there
    currentCell = board[r][c];//target cell as indicated in the main
     
    // public static int countNeighbours( char[][] board, int r, int c )
    count = countNeighbours(board, r, c);
    nextCell = board[r][c]; // backup in case it doesn't meet the conditions we've set

    // ALIVE
    // if the cell is alive
    if (currentCell == 'X'){
      // if neighbors is 2 or 3, then stay alive
      if (count == 2 || count == 3){
        nextCell = 'X';
      }
      // if neighbors is less than 2, or greater than 3 then DIE
      else {
        nextCell = '+';
      }
    }
    
    // DEAD
    else {
      // if neighbors is exactly 3, reborn alive
      if (count == 3){
        nextCell = 'X';
      }
      else {  // not, stay dead
        nextCell = '+';
      }
    }
    return nextCell;
  }


  // //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {

    // get rows and cols from the given board
    int rows = board.length;
    int cols = board[0].length;
    
    //assemble the board using the parts already created 
    char[][] newBoard = new char [rows][cols];

    //traverse
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        //set the cell to be the next gen's cell
        setCell(board, i, j, getNextGenCell(board, i, j));
      }
    }
    // get the next gen cell

    return newBoard; 
  }


  public static void main( String[] args )
  {
    
    char[][] board; //declaration
    board = createNewBoard(25,25); //initializer
    
    
    // print board
    System.out.println("\nWelcome to the Game of Life");
    printBoard(board);
    System.out.println();

    
    
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    System.out.println("\nbreathe life into the cells");
    printBoard(board);
    System.out.println();

    System.out.println("\nTesting Count Neighbors");
    int c11 = countNeighbours(board, 1, 1 );  // should return 3
    int c01 = countNeighbours(board, 0, 1 );  // should return 2
    int c02 = countNeighbours(board, 0, 2 );  // should return 1
    int c55 = countNeighbours(board, 5, 5 );  // should return 0
    System.out.println("(1,1) returns " + c11);
    System.out.println("(0,1) returns " + c01);
    System.out.println("(0,2) returns " + c02);
    System.out.println("(5,5) returns " + c55);

    // public static char getNextGenCell( char[][] board,int r, int c )
    System.out.println("\nTesting getNextGenCell");
    char cell11 = getNextGenCell(board, 1, 1);   // should return X alive
    System.out.println("(1,1) will turn " + cell11);
    char cell01 = getNextGenCell(board, 0, 1);  //  should stay alive
    System.out.println("(0,1) will turn " + cell01);
    char cell02 = getNextGenCell(board, 0, 2);   // should stay dead
    System.out.println("(0,2) will turn " + cell02);
    char cell55 = getNextGenCell(board, 5, 5);  //  should stay dead
    System.out.println("(5,5) will turn " + cell55);

    System.out.println("\nTesting generateNextBoard");
    
    
    
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    // System.out.println("Gen X:");
    // printBoard(board);
    // System.out.println("--------------------------\n\n");
    
    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
  }//end main()

}//end class