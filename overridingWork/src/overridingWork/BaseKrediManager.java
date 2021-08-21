package overridingWork;

public class BaseKrediManager {
	public /*final*/  double hesapla(double tutar) {//final eklersek override edilemez
		return tutar * 1.18;
	}

}
