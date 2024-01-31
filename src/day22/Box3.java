package day22;  // PACKAGE NAME

public class Box3 <T> { // CLASS START
    // 제네릭타입 : 클래스에서 타입을 정하지 않고 객체를 생성할때 정의
    private T t;
        // t라는 필드는 타입이 제네릭(정해져 있지 않다)
        // 객체를 만들때 정하자

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}   // CLASS END
/*

    Box3 <Integer> box = new Box<>()
    box{
        Integer t
        public Integer getT(){
            return t;
        }
        public void setT(Integer t){
            this.t = T;
    }

    Box3 <String> box = new Box<>()
    box{
        String t
        public String getT(){
            return t;
        }
        public void setT(String t){
            this.t = T;
    }

*/