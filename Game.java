import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
   private Scanner scan;
   
   public Game(){
       scan= new Scanner(System.in);
   }
   
   public Game(Scanner s){
       scan=s;
   }
   
   public Scanner getScan(){
       return scan;
   }
   
   public void play(){
       Round round= new Round(scan);
       round.play();
   }
}
