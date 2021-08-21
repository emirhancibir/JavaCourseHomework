package abstractClasses;

public abstract class GameCalculator {

	public abstract void calculate();
	//abstract olduðu zaman hepsini override etmem gerekiyor

	public final void gameOver() {
		System.out.println("Game Over !!!");
	}
}
