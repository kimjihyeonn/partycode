package co.kr.mono.training.dto;

public class MsalesDTO {
	
	private String prodId;
	private String prodNm;
	private String saleCnt;
	public MsalesDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MsalesDTO(String prodId, String prodNm, String saleCnt) {
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
		return "MsalesDTO [prodId=" + prodId + ", prodNm=" + prodNm + ", saleCnt=" + saleCnt + "]";
	}
	

}
