
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya olu�turuldu bu kapmanya y�zde "+campaign.getCampaignPercent()+" indirim sa�l�yor.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya g�ncellendi");
		
	}

}
