package day3wh3;

public class Campaign {
	private int id; 
	private String campaignName;
	private double discountPercantage;
	public Campaign(int id, String campaignName, double discountPercantage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercantage = discountPercantage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscountPercantage() {
		return discountPercantage;
	}
	public void setDiscountPercantage(double discountPercantage) {
		this.discountPercantage = discountPercantage;
	} 
	
}
