
public class Campaign {
	private int id;
	private String campaignName;
	private int campaignPercent;
	
	public Campaign() {
		
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

	public int getCampaignPercent() {
		return campaignPercent;
	}

	public void setCampaignPercent(int campaignPercent) {
		this.campaignPercent = campaignPercent;
	}

	public Campaign(int id, String campaignName, int campaignPercent) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignPercent = campaignPercent;
	}
	
}
