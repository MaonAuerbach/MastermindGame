
/**
 * Write a description of class Guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guess
{
    public static boolean checkGuess(int g){
        if((g<10000||g>99999) && g!=-1){
            System.out.println("Error - guess must be 5 digits");
            return false;
        }
        else{
            return true;
        }
    }
    
    public static int countApples(int guess, int secret){
        int apples=0;
        
        String gStr=String.valueOf(guess);
        String sStr=String.valueOf(secret);

        for(int i=0;i<5;i++){
            String guessDigit=gStr.substring(i,i+1);
            String secretDigit=sStr.substring(i,i+1);
            
            if(guessDigit.equals(secretDigit)){
                apples++;
            }
        }
        
        return apples;
    }
    
    public static int countOranges(int guess, int secret){
        int oranges=0;
        
        String gStr=String.valueOf(guess);
        String sStr=String.valueOf(secret);

        for(int i=0;i<5;i++){
            String guessDigit=gStr.substring(i,i+1);
            String secretDigit=sStr.substring(i,i+1);

            if(!guessDigit.equals(secretDigit)){
                for(int j=0;j<5;j++){
                    secretDigit=sStr.substring(j,j+1);
                    if(i!=j){
                        if(guessDigit.equals(secretDigit)){
                          oranges++;  
                        }
                    }
                }
            }
        }
        
        return oranges;
    }
}
