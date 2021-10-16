import java.util.ArrayList;
import java.util.List;

public class Shiritori {
    public ArrayList<Words> words;
    private static boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<Words>();
    }

    @Override
    public String toString() {
        return "Shiritori{" +
                "words=" + words +
                ", gameOver=" + gameOver +
                '}';
    }

    private static boolean runGame(Words words01, Words words02, Words words03, Words words04){
        Shiritori shiritori = new Shiritori();
        Shiritori correctWords = new Shiritori();

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

    private static boolean play(ArrayList<Words> words,Shiritori correctWords) {

        if (gameOver) {
            System.out.println("game over");
            gameOver = false;
            return false;
        }
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i-1).Name.charAt(words.get(i-1).Name.length() - 1) == words.get(i).Name.charAt(0) && words.get(i-1) != words.get(i)) {
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
    public static boolean restart(){
        Words words01 = new Words("");
        Words words02 = new Words("");
        Words words03 = new Words("");
        Words words04 = new Words("");
        System.out.println("words were deleted");

        return false;
    }

        public static void main (String[]args){
        Words words01 = new Words("Palo");
        Words words02 = new Words("ovca");
        Words words03 = new Words("anglicky");
        Words words04 = new Words("ypsilon");

            runGame(words01, words02,words03,words04);
        }

}
