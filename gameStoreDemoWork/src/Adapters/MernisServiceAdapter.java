package Adapters;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;

public class MernisServiceAdapter implements PlayerCheckService{
	

	
	@Override
	public boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		boolean result = mernis.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getBirthYear());
		if (result == true) {
			return true;
		}else {
			return false;
		}
	}

}
