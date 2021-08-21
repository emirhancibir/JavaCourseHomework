package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println("Player is added : " + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player is updated : " + player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player is deleted : " + player.getFirstName());
		
	}

	@Override
	public void list(Player player) {
		System.out.println("Player is listed : " + player.getFirstName());
		
	}

}
