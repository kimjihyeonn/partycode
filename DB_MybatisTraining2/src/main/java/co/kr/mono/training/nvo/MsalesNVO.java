package co.kr.mono.training.nvo;

public class MsalesNVO {
	
	private String prodId;
	private String prodNm;
	private String saleCnt;
	public MsalesNVO() {
		// TODO Auto-generated constructor stub
	}
	
	public MsalesNVO(String prodId, String prodNm, String saleCnt) {
		super();
		this.prodId = prodId;
		this.prodNm = prodNm;
		this.saleCnt = saleCnt;
	}

	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdNm() {
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}
	public String getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(String saleCnt) {
		this.saleCnt = saleCnt;
	}

	@Override
	public String toString() {
		return "MsalesNVO [prodId=" + prodId + ", prodNm=" + prodNm + ", saleCnt=" + saleCnt + "]";
	}
	

}
