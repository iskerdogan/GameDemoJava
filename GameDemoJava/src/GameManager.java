
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun baþarýyla eklendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun baþarýyla silindi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarýyla güncellendi: " + game.getGameName());
		
	}

	@Override
	public void sell(Game game,Customer customer) {
		System.out.println(game.getGameName()+" adlý oyun "+customer.getFirstName()+" "+customer.getLastName()+" adlý kullanýcý tarafýndan  "+game.getGamePrice()+" TL'ye satýn aldýndý.");
		
	}

	@Override
	public void sellCampaign(Game game, Customer customer, Campaign campaign) {
		int gamePrice = game.getGamePrice();
		int campaignPercent = campaign.getCampaignPercent();
		int campaignPrice= gamePrice - (gamePrice * campaignPercent/100);
		System.out.println(
				game.getGameName()+" adlý oyun "+
				customer.getFirstName()+" "+customer.getLastName()+" adlý kullanýcý tarafýndan  "+
				campaign.getCampaignName()+" kampanyasý kullanýlarak yüzde "+
				campaign.getCampaignPercent()+" indirimle "+
				campaignPrice +"TL'ye satýn aldýndý.");
		
		
	}
	
}
