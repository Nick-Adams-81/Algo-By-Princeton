package Warmups;

public class CountVowels {

    public int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for(char c : str.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
