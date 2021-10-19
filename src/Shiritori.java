import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shiritori {
    public ArrayList<String> alreadySaidWords;
    private boolean gameOver;

    public Shiritori() {
        this.alreadySaidWords = new ArrayList<>();
        gameOver = false;
    }

    @Override
    public String toString() {
        return "Shiritori{" +
                "words=" + alreadySaidWords +
                ", gameOver=" + gameOver +
                '}';
    }

    private boolean runGame(List<String> wordsToPlay){

        for (int i = 0; i < wordsToPlay.size(); i++) {
            if(play(wordsToPlay.get(i))){
                alreadySaidWords.add(wordsToPlay.get(i));
            }
            else{
                System.out.println("Game over");
                return false;
            }
        }
        System.out.println(alreadySaidWords);
        return false;
    }

    private boolean play(String word) {

            if(!word.matches("[a-zA-Z]+")||gameOver) return false;

            else if (alreadySaidWords.isEmpty()||alreadySaidWords.get(alreadySaidWords.size() - 1).toLowerCase().charAt(alreadySaidWords.get(alreadySaidWords.size()-1).toLowerCase().length()-1) == word.toLowerCase().charAt(0) && !alreadySaidWords.get(alreadySaidWords.size() - 1).equals(word))
                return true;

            else return false;
    }

    private  boolean restart()
    {
        alreadySaidWords.clear();
        return false;
    }

    private boolean getWords(){
        System.out.println(alreadySaidWords);
        return false;
    }
        public static void main (String[]args){
            Shiritori shiritori = new Shiritori();

            shiritori.runGame(Arrays.asList("palo", "ovca", "Adam", "Madam"));
            shiritori.restart();
            shiritori.getWords();

        }

}
