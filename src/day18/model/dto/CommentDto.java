package day18.model.dto;    // PACKAGE NAME

public class CommentDto {   // CLASS START
// ================================= 필드 ================================= //
    private int cno;
    private String ccontent;

    private int bno_fk;
    private int mno_fk;
// ================================= 생성자 ================================= //
    // ============== 기본 ============== //
    public CommentDto(){}
    // ============== 풀 ============== //
    public CommentDto(int cno, String ccontent, int bno_fk, int mno_fk) {
        this.cno = cno;
        this.ccontent = ccontent;
        this.bno_fk = bno_fk;
        this.mno_fk = mno_fk;
    }

    // ============== 추가 생성자(필요시 작성) ============== //

// ================================= 메소드 ================================= //
    // ============== GETTER / SETTER ============== //
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public int getBno_fk() {
        return bno_fk;
    }

    public void setBno_fk(int bno_fk) {
        this.bno_fk = bno_fk;
    }

    public int getMno_fk() {
        return mno_fk;
    }

    public void setMno_fk(int mno_fk) {
        this.mno_fk = mno_fk;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "cno=" + cno +
                ", ccontent='" + ccontent + '\'' +
                ", bno_fk=" + bno_fk +
                ", mno_fk=" + mno_fk +
                '}';
    }
}   // CLASS END
