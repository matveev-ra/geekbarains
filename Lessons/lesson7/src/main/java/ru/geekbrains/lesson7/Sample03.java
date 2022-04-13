package ru.geekbrains.lesson7;

public class Sample03 {

    public static void main(String[] args) {

        String message = "За окном потоп, а я ем торт.";

        printWords(message);

    }

    static void printWords(String message){
       String[] words = message.split("[ ,.!?;:-]");
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= 3 && words[i].charAt(0) == words[i].charAt(words[i].length() -1)){
                System.out.println(words[i]);
            }
        }
    }

}
