
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya oluþturuldu bu kapmanya yüzde "+campaign.getCampaignPercent()+" indirim saðlýyor.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya güncellendi");
		
	}

}
