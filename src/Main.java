import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        List<List<String>> groupAnagrams = new ArrayList<>();
        List<Integer> checkedIndices = new ArrayList<>();

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (!checkedIndices.contains(i)) {
                int count = 0;
                List<String> temp = new ArrayList<>();
                temp.add(arrayOfStrings[i]);
                count++;
                for (int j = 0; j < arrayOfStrings.length; j++) {
                    boolean isAnagram = true;
                    if (i != j) {
                        if (arrayOfStrings[i].length() == arrayOfStrings[j].length()) {
                            int k = 0;
                            String currentWord = arrayOfStrings[i];
                            while (isAnagram && k < arrayOfStrings[i].length()) {
                                if (arrayOfStrings[j].indexOf(currentWord.charAt(k)) == -1) {
                                    isAnagram = false;
                                } else {
                                    k++;
                                }
                            }
                            if (isAnagram) {
                                temp.add(arrayOfStrings[j]);
                                checkedIndices.add(j);
                                count++;
                            }
                        }
                    }
                }
                groupAnagrams.add(temp);
            }
        }

        System.out.println(groupAnagrams);
    }
}