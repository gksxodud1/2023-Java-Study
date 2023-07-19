package Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Count : ");
        n= sc.nextInt();
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> h1 = new HashMap<String, Object>();
        Map<String, Object> h2 = new HashMap<String, Object>();
        h1.put("A", 1);
        h1.put("B", 2);
        h1.put("C", 3);
        h2.put("A", 4);
        h2.put("B", 5);
        h2.put("C", 6);
        list.add(h1);
        list.add(h2);
        String s = "";
        for(int i = 0; i < list.size(); i++) {
            s += list.get(i).get("C");
            s += ", ";
        }
        s = s.substring(0, s.lastIndexOf(','));

        System.out.print(s);


    }
}
