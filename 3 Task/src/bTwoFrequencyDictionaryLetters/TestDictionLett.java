package bTwoFrequencyDictionaryLetters;
/**
 * Необходимо реализовать приложение на вход которого поступает текст,
 * а на выходе выводится частотный словарь букв латинского(английского) алфавита.
 */

public class TestDictionLett {
    public static void main(String[] args) {
        String text1 = "AABBBCCCCCDDDDDDDEFF";
        String text2 = "My name’s David. We’re in a small village near Chicago. My cousin’s getting married. My father and her father are twins. " +
                "A lot of relatives are here for the wedding party. We’re very busy. My uncle’s friend is making palov. " +
                "My sister Susan and Aunt Keane are making cakes. My mother’s helping her niece with her wedding dress. " +
                "My grandparents are here too. They’re very old. They live in Chicago. I’m making a video and taking photos. " +
                "It’s great. I want to be a reporter.";

        DictionLett dictionLett1 = new DictionLett(text1);
        dictionLett1.dictMethod();
        System.out.println("----------" );
        System.out.println("----------" );
        DictionLett dictionLett2 = new DictionLett(text2);
        dictionLett2.dictMethod();


    }
}
