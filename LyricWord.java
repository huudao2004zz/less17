import java.util.*;


public class LyricWord {
    private static  final String[] lyric = {"you","say","it","best","When","you","say","nothing","at","all"};

    public static void main(String[] args) {
        //create a list that's implemented by ArrayList
        List words = new ArrayList();
        //Add


        for(String w : lyric)
            words.add(w);
        for (Object o : words)
            System.out.printf(o + " ");
        System.out.printf("\n--------------------\n");

        System.out.printf("Contains[you] ?:\n"+ words.contains("you"));
        System.out.printf("Contains[me]?:\n" + words.contains("me"));
        System.out.printf("Where's [say]?:\n" + words.indexOf("say"));
        System.out.printf("Where's the last [say]?:\n" + words.lastIndexOf("say"));

        //sort words
        Collections.sort(words);

        //show all elements of words
        for(Object o : words){
            System.out.printf(  o + " ");
        }
    }
}
