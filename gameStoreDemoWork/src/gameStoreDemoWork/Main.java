package gameStoreDemoWork;

import java.rmi.RemoteException;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Campaign campaign = new Campaign(1, "Bayram Kampanyasý", 15);
		Game game = new Game(1, "Cyberpunk 2077", 310);
		Player player = new Player(1, "Abuzer", "Komurcu","12345678910", 1975);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(player, game, campaign);
		

	}

}
