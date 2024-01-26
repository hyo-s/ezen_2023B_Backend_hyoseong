package day18.model.dto;    // PACKAGE NAME

public class BoardDto { // CLASS START
// ================================= 필드 ================================= //
    private int bno;
    private String btitle;
    private String bcontent;
    private String bdate;       // DB <--> JAVA 타입변환 필요.
    private int bview;
    private int cno_fk;
    private int mno_fk;
// ================================= 생성자 ================================= //
    // ============== 기본 ============== //
    public BoardDto(){}
    // ============== 풀 ============== //
    public BoardDto(int bno, String btitle, String bcontent, String bdate, int bview, int cno_fk, int mno_fk) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.bview = bview;
        this.cno_fk = cno_fk;
        this.mno_fk = mno_fk;
    }

    // ============== 추가 생성자(필요시 작성) ============== //

    public BoardDto(String btitle, String bcontent) {
        this.btitle = btitle;
        this.bcontent = bcontent;
    }

    // ================================= 메소드 ================================= //
    // ============== GETTER / SETTER ============== //
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getBview() {
        return bview;
    }

    public void setBview(int bview) {
        this.bview = bview;
    }

    public int getCno_fk() {
        return cno_fk;
    }

    public void setCno_fk(int cno_fk) {
        this.cno_fk = cno_fk;
    }

    public int getMno_fk() {
        return mno_fk;
    }

    public void setMno_fk(int mno_fk) {
        this.mno_fk = mno_fk;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bdate='" + bdate + '\'' +
                ", bview=" + bview +
                ", cno_fk=" + cno_fk +
                ", mno_fk=" + mno_fk +
                '}';
    }
} // CLASS END
