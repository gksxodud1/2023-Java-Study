package Week9;

import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        ArrayList<java.util.HashMap<String,String>> list = new ArrayList<java.util.HashMap<String,String>>();   //선언및 대입
        java.util.HashMap<String,String> personMap1 = new java.util.HashMap<String,String>();  //선언 및 대입

        personMap1.put("이름","박준수");
        personMap1.put("나이","23");
        personMap1.put("직업","학생");
        java.util.HashMap<String ,String> personMap2 = new java.util.HashMap<String,String>();
        personMap2.put("이름","장대현");
        personMap2.put("나이","23");
        personMap2.put("직업","학생");

        list.add(personMap1);
        list.add(personMap2);

        java.util.HashMap<String,String> takeMap1 = (java.util.HashMap<String, String>) list.get(0);
        String name1 = takeMap1.get("이름");
        String age1 = takeMap1.get("나이");
        String job1 = takeMap1.get("직업");

        java.util.HashMap<String,String> takeMap2 = (java.util.HashMap<String, String>) list.get(1);
        String name2 = takeMap2.get("이름");
        String age2 = takeMap2.get("나이");
        String job2 = takeMap2.get("직업");

        personMap1.forEach((strKey, strValue) -> System.out.println(strKey + ":" + strValue));
        personMap2.forEach((strKey, strValue) -> System.out.println(strKey + ":" + strValue));
          //자바 1.8 이상 사용가능
        //for( Map.Entry<String, String> entry : map.entrySet() ){
        //	String strKey = entry.getKey();
        //	String strValue = entry.getValue();
        //    System.out.println( strKey +":"+ strValue );
        //

     }
    }


