package day23;  // PACKAGE NAME

public class SimpleMap <E, V> {    // CLASS START
    // ======================== MAP 구현 ======================== //
    // 필드
    public Object[] object;
    public E key;
    public V value;
    public int size;

    //
    public SimpleMap(){
        object = new Object[0];
    }
    public SimpleMap(E key, V value){
        this.key = key;
        this.value = value;
    }

    // 메소드

    // key : value 추가
    public boolean put (E key, V value){
        try{
        // 사이즈 1증가
        this.size++;
        // 오브젝트 배열 생성 사이즈는 1증가한 사이즈 1
        // 오브젝트 배열 생성 사이즈는 1증가한 사이즈 2
        Object[] newObject = new Object[size];
        // 제네릭 객체 생성1 // put 2번하면 두개임
        // 제네릭 객체 생성2
        SimpleMap<E, V> simpleMap = new SimpleMap<>(key, value);

        // 길이가 1일때 1번 반복함 오브젝트 배열 길이만큼 새로 만든 오브젝트 0 번째에 오브젝트 0번째 대입
        // 길이가 2일때 2번 반복함 오브젝트 배열 길이만큼 새로 만든 오브젝트 1 번째에 오브젝트 1번째 대입

        // 복 붙
        for (int i = 0; i < this.object.length; i++) {
            newObject[i] = object[i];

        }
        // 필드에 새로 만든 배열 대입
        object = newObject;
        // 4. 마지막 인덱스에 매개변수 대입
        object[this.size - 1] = simpleMap;
        return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }
    // key : value 추가
    public V get(E key){
        V result = null;
        for (int i=0; i<object.length; i++){
            SimpleMap<E, V> simpleMap = (SimpleMap)object[i];
            if(simpleMap.key.equals(key)){
                result = simpleMap.value;
            }
        }
        return result;
    }

    public boolean remove(int index){
        // 1. 배열의 사이즈 감소
        this.size--;

        // 2. 감소된 사이즈 만큼 배열 재할당
        Object[] newObject = new Object[size];

        // 3. 배열 복사 // i : 기존배열 인덱스 // j : 새로운배열 인덱스
        int j = 0;
        for (int i = 0 ; i < this.object.length; i++){
            newObject[j] = object[i];
            // 삭제 : 삭제할 인덱스 빼고 카피
            // 만약에 삭제할인덱스(매개변수)가 아니면.
            if(i != index) j++;
        }

        // 4. 기존 배열필드에 새로운 배열 대입
        object = newObject;

        for (int i = 0 ; i < this.object.length; i++){
            System.out.println("ooooo"+object);
        }
        System.out.println("ooooxxxxxxo"+object[0].toString());
        return true;
    }
    // toString



}   // CLASS END
