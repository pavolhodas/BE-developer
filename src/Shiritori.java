import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shiritori {
    public ArrayList<String> words;
    private static boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Shiritori{" +
                "words=" + words +
                ", gameOver=" + gameOver +
                '}';
    }

    private static boolean runGame(String words01,String words02, String words03, String words04){
        Shiritori correctWords = new Shiritori();
        Shiritori shiritori = new Shiritori();

        shiritori.words.add(words01);
        shiritori.words.add(words02);
        shiritori.words.add(words03);
        shiritori.words.add(words04);

        if(words01.equals("")||words02.equals("")||words03.equals("")||words04.equals("")){
            System.out.println("words were deleted");
            gameOver = true;
            return true;
        }
        else if(play(shiritori.words, correctWords)) {
            System.out.println( correctWords.words + " = correct");
        }
        else{
            gameOver=true;
        }
        return false;
    }

    private static boolean play(ArrayList<String> words,Shiritori correctWords) {

        if (gameOver) {
            restart();
            gameOver = false;
            return false;
        }

        for (int i = 1; i < words.size(); i++) {
            if (words.get(i-1).toLowerCase().charAt(words.get(i-1).length() - 1) == words.get(i).toLowerCase().charAt(0) && !words.get(i - 1).toLowerCase().equals(words.get(i).toLowerCase())&&words.get(i-1).matches("[a-zA-Z]+")&&words.get(i).matches("[a-zA-Z]+")) {
                correctWords.words.add(words.get(i-1));
            }

        else {
                System.out.println("game over");
                return false;
            }
        }
        correctWords.words.add(words.get(words.size()-1));
        return true;
    }

    private static boolean restart()
    {
        runGame("", "", "", "");

        return false;
    }

    private static String getWords(){
        Shiritori shiritori = new Shiritori();


        shiritori.words.add("palo");
        shiritori.words.add("ovca");
        shiritori.words.add("adam");
        shiritori.words.add("madam");

        return String.valueOf(shiritori);
    }
        public static void main (String[]args){
            //restart();
            runGame("palo", "OvcA", "adam", "Madam");
            System.out.println(getWords());
        }

}
