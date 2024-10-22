package game;

public class Mago extends Personaje {

	@Override
	public void Ataca(Personaje p1) {
		if (this.getArma() instanceof Hechizo) {
			p1.setVida(p1.getVida() - this.getArma().ATAQUE -
					this.getAtaque());
		} else {
			p1.setVida(p1.getVida() - this.getArma().ATAQUE);
		}
	}

}
