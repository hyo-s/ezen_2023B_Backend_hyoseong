package day23;  // PACKAGE NAME

import java.util.Map;

// < A~Z > 아무거나
public class SimpleList< E > {   // CLASS START
    // 1. 필드
    private Object[] array; // 여러 타입을 저장
    private int size;   // 0

    // 2. 생성자
    public SimpleList(){
        array = new Object[0];
    }
    // 3. 메소드
        // 1. 삽입 메소드
    public boolean add( E element ){
        try {
            // 1. 배열의 사이즈 증가.
            this.size++;

            // 2. 배열 길이의 마지막 인덱스에 입력받은 값 ( 매개변수 ) 저장
            // 배열의 메모리 재할당해서 가변길이 만들기.
                // 1. 현재 size 만큼 배열 선언
            Object[] newArray = new Object[size];

                // 2. 배열 복사 : 기존 배열에 있던 객체들을 새로운 배열에 복사
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = array[i];
            }

                // 3. 기존 배열필드에 새로운 배열 대입
            array = newArray;
                // 4. 마지막 인덱스에 매개변수 대입
            array[this.size - 1] = element;

            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
        // 2. 특정 요소 호출 메소드
    public E get(int index){
        return (E)this.array[index];
    }

        // 3. 삭제 메소드
    public Object remove(int index){
        // 1. 배열의 사이즈 감소
        this.size--;

        // 2. 감소된 사이즈 만큼 배열 재할당
        Object[] newArray = new Object[size];

        Object oldValue = array[index];

        // 3. 배열 복사 // i : 기존배열 인덱스 // j : 새로운배열 인덱스
        int j = 0;
        for (int i = 0 ; i < this.array.length; i++){

            newArray[j] = array[i];
            // 삭제 : 삭제할 인덱스 빼고 카피
                // 만약에 삭제할인덱스(매개변수)가 아니면.
            if(i != index) j++;
        }
        // 4. 기존 배열필드에 새로운 배열 대입
        array = newArray;
        return oldValue;
    }
        // 4. 현재 길이를 출력하는 메소드
    public int size(){
        return this.size;
    }

        // 5. toString 메소드
    @Override
    public String toString(){
        String str = "[";
        for (int i = 0; i<this.array.length; i++){
            // 각 인덱스에 str 값을 누적
            str += array[i].toString();
            // 마지막 인덱스-1가 아니면 뒤에 , 추가
            str += i != this.array.length-1 ? ", " : "";
        }
        return str+"]";
    }



}   // CLASS END