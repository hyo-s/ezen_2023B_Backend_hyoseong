package day23;  // PACKAGE NAME

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 배열타입 : 고정길이
        String[] strArray = new String[3];
            // String 타입 데이터 3개를 저장하는 배열타입
        strArray[0] = "유재석";
        // strArray[1] = 100;  // 타입이 다르기 때문에 오류
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        // strArray[3] = "서장훈"; // ArrayIndexOutOfBoundsException

        System.out.println("배열 상태 : " + Arrays.toString(strArray));   // 주소값 출력
        System.out.println("배열 요소 호출 : " + strArray[1]);
        System.out.println("배열 길이 : " + strArray.length);
        strArray[1] = null;
            // Object 클래스 toString( ) 메소드 객체의 주소값 반환
            // Arrays.toString( 배열타입변수 ) : 해당 배열 상태 호출

        // 2. 클래스타입 : *컬렉션프레임워크 ( 수집관련 라이브러리 제공 )
            // 1. ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
            // 클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        // strList.add("100");
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("리스트 상태 : " + strList);
        System.out.println("리스트 요소 호출 : " + strList.get(1));
        System.out.println("리스트 길이 : " + strList.size());
        System.out.println("리스트 삭제 : " + strList.remove(1));
        System.out.println("리스트 상태 : " + strList);

        System.out.println("======================================");
        // 3. 가변길이 배열객체 만들기
            // SimpleList{ 객체, 객체, 객체 }
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println("리스트 상태 : " + simpleList.toString());
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));
        System.out.println("리스트 길이 : " + simpleList.size());
        System.out.println("리스트 삭제 : " + simpleList.remove(1));
        // simpleList.remove(1);
        System.out.println("리스트 상태 : " + simpleList.toString());


        SimpleList<Integer> intList = new SimpleList<>();
        intList.add(100);

        System.out.println("======================================");

        HashMap<String, String> map1 = new HashMap<String,String>();
        map1.put("이름", "유재석");
        map1.put("age", "40");
//        HashMap<String, Integer> map2 = new HashMap<String,Integer>();
//        map2.put("age", 40);
//        System.out.println("1. Map Value : " + map1.get("이름"));

//        System.out.println("2"+map1);
//        System.out.println("3"+map2);
//        System.out.println("4"+map1.toString());
//        System.out.println("5"+map2.toString());

        SimpleMap<String, String> simpleMap1 = new SimpleMap<>();
        simpleMap1.put("name","박효성");
        simpleMap1.put("age","40");
        simpleMap1.put("name","강호동");
        simpleMap1.put("age","20");
//      SimpleMap<String, Integer> simpleMap2 = new SimpleMap<>("age", 40);
//        System.out.println("7"+simpleMap2.toString());
//        System.out.println(simpleMap1.get(1));
        System.out.println(simpleMap1.toString());
        System.out.println(simpleMap1.get("name"));
        System.out.println(simpleMap1.remove(1));
        System.out.println(simpleMap1.toString());

        // [ {박효성:} , {강호동:20} ]
        //      0            1

    }   // MAIN END
}   // CLASS END
/*

    MAP 구현
        JS : { 키 : 값, 키 : 값, 키 : 값 }
        속성명은 중복 불가
        let object = {
            name = "유재석",
            age = 40
        }

*/