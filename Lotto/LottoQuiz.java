package Lotto;

import java.util.*;


public class LottoQuiz {
    public static void main(String[] ar) {
        Map<Character, Integer> map = new HashMap();    //<키 자료형, 값 자료형>
        Scanner sc = new Scanner(System.in);
        for (int i = 65; i < 91; i++) {       //랜덤으로 문자를 입력하면 그 문자에 들어가있는 값을 출력 해주는 코드
            int random = (int) (Math.random() * 10);
            map.put((char) i, random);     //문자 타입도 랜덤 생성이 이렇게 하면 되는거였구나?
        }
        System.out.println(map); //정상출력 확인을 위한 map 출력
        System.out.println("찾을 숫자를 입력하세요");
        int search = sc.nextInt();




                Set <Map.Entry<Character,Integer>>  entrySet = map.entrySet();       //캐릭터랑 인티저값 들어간 맵 생성 해주고
                Iterator<Map.Entry<Character, Integer>> entryIterator = entrySet.iterator();      //얘도 마찬가지
                while (entryIterator.hasNext()) {
                    Map.Entry<Character, Integer> entry = entryIterator.next();
                    if(entry.getValue().equals(search)) {  //원리를 잘 모르게써.. 사실 ./...
                Character findKey = entry.getKey();
                        System.out.println(search + "는 " + findKey + "에 있습니다.");
                    }
                }
            }
        }



