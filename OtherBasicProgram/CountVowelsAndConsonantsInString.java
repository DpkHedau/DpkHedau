import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CountVowelsAndConsonantsInString {
    public static void main(String[] args) {
        String myName = "Dipak Shamrao Hedau";
        List<String> vowelsList =  new ArrayList<>();
        List<String> consonantList =  new ArrayList<>();

        String[] stringArray= myName.replace(" ","").toLowerCase().split("");
        int i = 0;
        for(String s: stringArray){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
                    vowelsList.add(s);
                }else{
                    consonantList.add(s);
                }
            }
        }
        System.out.println("vowelsList:::"+vowelsList.size());
        System.out.println("consonantList:::"+consonantList.size());

    }
}
