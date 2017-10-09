package stock.model.dto;

public class StockDTO {
	String cname;
	int acc;
	String decision;
	
	public StockDTO() {
		super();
	}

	public StockDTO(String cname, int acc, String decision) {
		super();
		this.cname = cname;
		this.acc = acc;
		this.decision = decision;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "StockDTO [cname=" + cname + ", acc=" + acc + ", decision=" + decision + "]";
	}
}
