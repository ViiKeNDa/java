package pr1;

import java.util.Arrays;
interface Costumer{
    String findMaxByUnic(String[] mystrings);
}

class CostumerImpl implements Costumer{

    @Override
    public String findMaxByUnic(String[] mystrings){
        String maxString = "";
        int maxUnique = 0;

        for (String s : mystrings) {
            int uniqueChars = (int) Arrays.stream(s.split(""))
                    .distinct()
                    .count();

            if (uniqueChars > maxUnique) {
                maxUnique = uniqueChars;
                maxString = s;
            }
        }

        return maxString;
    }
}
public class Main{
    public static void main(String[] args) {
        String[] strings = {"abc", "abbbbbba", "aaaabbbbblvjhmxoznasssssfg", "abcdefgrk"};
        CostumerImpl costumer = new CostumerImpl();
        System.out.println(costumer.findMaxByUnic(strings));

    }
}
