package Abstract;

import java.rmi.RemoteException;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {
	
	void sell(Player player,Game game, Campaign campaign) throws NumberFormatException, RemoteException;
	
}
