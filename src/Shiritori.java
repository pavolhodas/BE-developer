import java.util.ArrayList;
import java.util.List;

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

        if(play(shiritori.words, correctWords)) {
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
        final String validChars = "0123456789+-*/()[]{}";
        for (int i = 1; i < words.size(); i++) {
            for(int a = 0; a < words.get(i-1).length()-1; a++) {
                if(!validChars.contains(words.get(i-1).charAt(a))) {
                    System.out.println("invalid string, try again: ");
                }
            }
            if (words.get(i-1).charAt(words.get(i-1).length() - 1) == words.get(i).charAt(0) && words.get(i-1) != words.get(i)) {
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
        System.out.println("words were deleted");

        return false;
    }

    private static String getWords(){
        Shiritori shiritori = new Shiritori();

        String words01 = new String("halo");
        String words02 = new String("ozaj");
        String words03 = new String("jez");
        String words04 = new String("oskvarky");

        shiritori.words.add(words01);
        shiritori.words.add(words02);
        shiritori.words.add(words03);
        shiritori.words.add(words04);

        return String.valueOf(shiritori);
    }
        public static void main (String[]args){
            runGame("Palo", "ovca", "anglicky", "ypsilon");

            System.out.println(getWords());
        }

}
