package week11;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

    public class SungjukTest {

        public static void main(String[] args) throws IOException {
            JSONArray jsonArray = new JSONArray();



            ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();   //선언및 대입

            int n=0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Count : ");
            n = sc.nextInt();

            String name = "";
            ArrayList<Integer> score = null;
            int total = 0;
            int kor = 0;
            int eng = 0;
            int math = 0;
            double avg = 0.0;


            for(int i = 0;i<n;i++) {
                HashMap<String, Object> personMap =  new HashMap<String,Object>();
                System.out.print("Name : ");
                name = sc.next();
                personMap.put("name", name);

                score = new ArrayList<Integer>();
                System.out.print("국어점수 : ");
                kor = sc.nextInt();
                score.add(kor);
                total += kor;
                System.out.print("영어점수 : ");
                eng = sc.nextInt();
                score.add(eng);
                total += eng;
                System.out.print("수학점수 : ");
                math = sc.nextInt();
                score.add(math);
                total += math;
                score.add(total);
                personMap.put("score", score);

                avg = total/3.0f;
                personMap.put("avg", avg);

                list.add(personMap);

                jsonArray.put(personMap);    //제이슨어레이에 펄슨맵을 넣어주는거      //포문을 돌때마다 jsonArray 인덱스에 들어감
                String json = jsonArray.toString();
                System.out.println(json);

                Writer writer = new FileWriter("C:/Temp/SUCKK.txt");  //파일라이터 메소드로 텍스트파일에 집어넣는것
                writer.write(json);
                writer.flush();
                writer.close();




            }


            for(int i=0;i<n;i++) {
                HashMap<String, Object> personMap = list.get(i);
                System.out.println("name : " + personMap.get("name"));

                ArrayList<Integer> scores = (ArrayList<Integer>)personMap.get("score");
                System.out.println("국어 : " + scores.get(0));
                System.out.println("영어 : " + scores.get(1));
                System.out.println("수학 : " + scores.get(2));
                System.out.println("total : " + scores.get(3));
                System.out.println("average : " + personMap.get("avg") );
            }

        }

    }

