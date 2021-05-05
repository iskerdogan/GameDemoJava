
public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void sell(Game game, Customer customer);
	void sellCampaign(Game game, Customer customer, Campaign campaign);
}
