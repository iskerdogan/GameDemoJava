
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Erdoðan", "IÞIK", "abc@gmail.com");
		Customer customer2 = new Customer(2, "Salih", "GÜMÜÞ", "absc@gmail.com");
		Game game = new Game(1, "Birinci oyun", 100);
		Campaign campaign = new Campaign(1, "ilk kampanya", 10);
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer);
		customerManager.delete(customer);
		customerManager.update(customer);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		gameManager.sell(game,customer);
		gameManager.sellCampaign(game,customer2,campaign);
		
		
		

	}

}
