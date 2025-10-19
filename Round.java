import java.util.Scanner;
/**
 * Write a description of class Round here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Round
{
    private int secret;
    private int numGuesses;
    private boolean win;
    private boolean quit;
    private Scanner scan;
    
    public Round(Scanner s){
        secret=12345;
        numGuesses=0;
        win=false;
        quit=false;
        scan=s;
    }
    
    public int getSecret(){
        return secret;
    }
    
    public int getNumGuesses(){
        return numGuesses;
    }
    
    public boolean getWin(){
        return win;
    }
    
    public boolean getQuit(){
        return quit;
    }
    
    public Scanner getScan(){
        return scan;
    }
    
    private int askForGuess(){
        System.out.println("Guess a 5 digit number or type -1 to quit");
        int userGuess=scan.nextInt();
        scan.nextLine();
        
        if(userGuess==-1){
            quit=true;
        }
        else{
            numGuesses++;
        }
        return userGuess;
    }
    
    private void checkWin(int g){
        if(g==secret){
            win=true;
        }
    }
    
    public void play(){
        while(win!=true && quit!=true){
            int guess=askForGuess();
            System.out.println("You guessed "+ guess);
            checkWin(guess);
        }
        
        if(win==true){
            System.out.println("You won after "+ numGuesses +" guesses");
        }
        else if(quit==true){
            System.out.println("You quit after "+ numGuesses +" guesses");
        }
    }
}
