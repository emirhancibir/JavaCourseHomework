package Concrete;

import java.rmi.RemoteException;

import Abstract.GameSaleService;
import Abstract.PlayerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(Player player, Game game, Campaign campaign) throws NumberFormatException, RemoteException {
		double discountedPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount()/100);
		
		PlayerCheckService checkService = new MernisServiceAdapter();
		
		
		if (checkService.checkIfRealPlayer(player)) {
			System.out.println( "The " + game.getGameName() + " game was sold to " + player.getFirstName() + " player for "
					+ discountedPrice + " with a %" + campaign.getCampaignDiscount() + " discount with the " + campaign.getCampaignName()+ " Campaign" );
		}else {
			System.out.println("You are not a real Player");
		}
		
		
		
	}

}
