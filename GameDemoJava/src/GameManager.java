
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar�yla eklendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ba�ar�yla silindi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi: " + game.getGameName());
		
	}

	@Override
	public void sell(Game game,Customer customer) {
		System.out.println(game.getGameName()+" adl� oyun "+customer.getFirstName()+" "+customer.getLastName()+" adl� kullan�c� taraf�ndan  "+game.getGamePrice()+" TL'ye sat�n ald�nd�.");
		
	}

	@Override
	public void sellCampaign(Game game, Customer customer, Campaign campaign) {
		int gamePrice = game.getGamePrice();
		int campaignPercent = campaign.getCampaignPercent();
		int campaignPrice= gamePrice - (gamePrice * campaignPercent/100);
		System.out.println(
				game.getGameName()+" adl� oyun "+
				customer.getFirstName()+" "+customer.getLastName()+" adl� kullan�c� taraf�ndan  "+
				campaign.getCampaignName()+" kampanyas� kullan�larak y�zde "+
				campaign.getCampaignPercent()+" indirimle "+
				campaignPrice +"TL'ye sat�n ald�nd�.");
		
		
	}
	
}
