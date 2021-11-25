package com.x62life.mo.model.order;

import java.sql.Timestamp;
// 예약판매정보
public class OdReserveGoods {
    private int seqno; //순번
    private String gdcd; //상품코드
    private String gdnm; //상품명
    private String unit; //단위
    private char divcd; //상품구분
    private char divcd1; //카테고리
    private float masterPrice; //가격
    private float applyPrice; //가격
    private float point; //포인트
    private float stockNum; //재고량
    private char odFrom; //주문기간 from
    private char odTo; //주문기간 to
    private char dlvFrom; //배송기간 from
    private char dlvTo; //배송기간 to
    private char useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private Timestamp candt; //취소일시
    private String gdExpalin; //상품설명
    private char type; //상품유형
    private char newyn; //신상품여부
    private char recommandyn; //추천상품여부
    private String packunit; //포장
    private String divcd2; //하위카테고리
    private String updid; //수정자id
    private char alltimesale; //상시판매

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }

    public String getGdnm() {
        return gdnm;
    }

    public void setGdnm(String gdnm) {
        this.gdnm = gdnm;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public char getDivcd() {
        return divcd;
    }

    public void setDivcd(char divcd) {
        this.divcd = divcd;
    }

    public char getDivcd1() {
        return divcd1;
    }

    public void setDivcd1(char divcd1) {
        this.divcd1 = divcd1;
    }

    public float getMasterPrice() {
        return masterPrice;
    }

    public void setMasterPrice(float masterPrice) {
        this.masterPrice = masterPrice;
    }

    public float getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(float applyPrice) {
        this.applyPrice = applyPrice;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getStockNum() {
        return stockNum;
    }

    public void setStockNum(float stockNum) {
        this.stockNum = stockNum;
    }

    public char getOdFrom() {
        return odFrom;
    }

    public void setOdFrom(char odFrom) {
        this.odFrom = odFrom;
    }

    public char getOdTo() {
        return odTo;
    }

    public void setOdTo(char odTo) {
        this.odTo = odTo;
    }

    public char getDlvFrom() {
        return dlvFrom;
    }

    public void setDlvFrom(char dlvFrom) {
        this.dlvFrom = dlvFrom;
    }

    public char getDlvTo() {
        return dlvTo;
    }

    public void setDlvTo(char dlvTo) {
        this.dlvTo = dlvTo;
    }

    public char getUseyn() {
        return useyn;
    }

    public void setUseyn(char useyn) {
        this.useyn = useyn;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }

    public Timestamp getCandt() {
        return candt;
    }

    public void setCandt(Timestamp candt) {
        this.candt = candt;
    }

    public String getGdExpalin() {
        return gdExpalin;
    }

    public void setGdExpalin(String gdExpalin) {
        this.gdExpalin = gdExpalin;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getNewyn() {
        return newyn;
    }

    public void setNewyn(char newyn) {
        this.newyn = newyn;
    }

    public char getRecommandyn() {
        return recommandyn;
    }

    public void setRecommandyn(char recommandyn) {
        this.recommandyn = recommandyn;
    }

    public String getPackunit() {
        return packunit;
    }

    public void setPackunit(String packunit) {
        this.packunit = packunit;
    }

    public String getDivcd2() {
        return divcd2;
    }

    public void setDivcd2(String divcd2) {
        this.divcd2 = divcd2;
    }

    public String getUpdid() {
        return updid;
    }

    public void setUpdid(String updid) {
        this.updid = updid;
    }

    public char getAlltimesale() {
        return alltimesale;
    }

    public void setAlltimesale(char alltimesale) {
        this.alltimesale = alltimesale;
    }
}