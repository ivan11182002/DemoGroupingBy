package demo.ivanman.groupingby;

public class InsuranceInfo {
	/* 要保人 */
	private String owner;
	/* 保單號 */
	private String policyNo;
	/* 險種代碼 */
	private String planCode;
	/* 保險金額 */
	private int amount;
	
	public InsuranceInfo(String owner, String policyNo, String planCode, int amount) {
		super();
		this.owner = owner;
		this.policyNo = policyNo;
		this.planCode = planCode;
		this.amount = amount;
	}
	
	/*  getter & setter  */
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
