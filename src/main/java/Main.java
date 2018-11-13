import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        sortListByLength(setList());
    }

    public static List<String> setList() throws IOException {
        ArrayList list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = reader.readLine();
            if (str.equals(""))
                break;
            else list.add(str);
        }
        return list;
    }

    public static void sortListByLength(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });
        for (String l : list){
            System.out.println(l);
        }
    }
}
