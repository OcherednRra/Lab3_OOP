import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args){
		/*
		1515 % 3 = 0  ----> StringBuilder
		1515 % 17 = 2 ----> Знайти слово в першому реченні, якого не має в наступних
		*/

        StringBuilder text = new StringBuilder("Їхав грека через річку.");
        text.append("Бачить грека в річці рак.");
        text.append("Сунув грека руку в річку.");
        text.append("Рак за руку греку цап!");

        String[] allSentences = text.toString().split("\\.");
        String[] firstSentenceWords = allSentences[0].split(" ");
        String otherSentenceWords = text.toString().replace(Arrays.toString(firstSentenceWords), "");

        for (String word : firstSentenceWords){
            if (otherSentenceWords.contains(word)){
                System.out.println(word);
                break;
            }
            System.out.println("BruhError");
        }
    }
}
