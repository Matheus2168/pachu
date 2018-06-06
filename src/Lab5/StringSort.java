package Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

    public static void main(String[] args) {

        String sentence = typeSentence();

        char[] chars = convert(sentence);

        System.out.println(Arrays.toString(chars));

        quicksort(chars,0, chars.length-1);

        System.out.println(Arrays.toString(chars));



    }

    private static char[] quicksort(char tablica[], int x, int y) {
        System.out.println("wyw");

        int i,j,v,temp;

        i=x;
        j=y;
        v=tablica[(x+y) / 2];
        do {
            while (tablica[i]<v)
                i++;
            while (v<tablica[j])
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=(char)temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quicksort(tablica,x,j);
        if (i<y)
            quicksort(tablica,i,y);

        return tablica;
    }

    private static String typeSentence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz zdanie:");
        return sc.nextLine();
    }

    private static char[] convert(String sentence){

        char[] chars = new char[sentence.length()];

        for (int i = 0 ; i < sentence.length() ; i++){
            chars[i] = sentence.charAt(i);
        }
        return chars;
    }
}
