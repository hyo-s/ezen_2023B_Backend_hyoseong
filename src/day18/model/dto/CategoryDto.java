package day18.model.dto;    // PACKAGE NAME

public class CategoryDto {  // CLASS START
// ================================= 필드 ================================= //
    private int bcno;
    private String bcategory;
// ================================= 생성자 ================================= //
    // ============== 기본 ============== //
    public CategoryDto(){}
    // ============== 풀 ============== //
    public CategoryDto(int cno, String bcategory) {
        this.bcno = bcno;
        this.bcategory = bcategory;
    }

    // ============== 추가 생성자(필요시 작성) ============== //


// ================================= 메소드 ================================= //

    public int getbCno() {
        return bcno;
    }

    public void setbCno(int cno) {
        this.bcno = cno;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "cno=" + bcno +
                ", bcategory='" + bcategory + '\'' +
                '}';
    }
}   // CLASS END
