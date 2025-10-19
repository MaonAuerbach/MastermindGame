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
    private int numGuesses;
    private int numRoundsWon;
    private boolean quitGame;

    public Game(){
        scan= new Scanner(System.in);
        numGuesses=0;
        numRoundsWon=0;
        quitGame=false;
    }

    public Game(Scanner s){
        scan=s;
        numGuesses=0;
        numRoundsWon=0;
        quitGame=false;
    }

    public Scanner getScan(){
        return scan;
    }

    public void play(){
        while(quitGame==false){
            Round round=new Round(scan);
            round.play();
            
            if(round.getWin()){
                numGuesses=numGuesses+round.getNumGuesses();
                numRoundsWon++;
            }
            playAgain();
        }
        
        System.out.println("Rounds Won: "+ numRoundsWon);
        System.out.println("Average guesses per win: "+ getAverage());
    }

    public int getNumGuesses(){
        return numGuesses;
    }
    
    public int getNumRoundsWon(){
        return numRoundsWon;
    }
    
    public boolean getQuitGame(){
        return quitGame;
    }
    
    private void playAgain(){
        System.out.println("Do you want to play again? Type y for yes and n for no");
        String userPlayAgain=scan.nextLine();
        if(userPlayAgain.equals("n")){
            quitGame=true;
        }
    }
    
    private double getAverage(){
        double avg=0.0;
        if(numRoundsWon>0){
            avg=(double) numGuesses/numRoundsWon;
        }
        return avg;
    }
}
