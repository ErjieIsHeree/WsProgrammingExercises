package game;

public class Guerrero extends Personaje {

	@Override
	public void Ataca(Personaje p1) {
		if (this.getArma() instanceof Espada || this.getArma() instanceof
				Arco) {
			p1.setVida(p1.getVida() - this.getArma().ATAQUE -
					this.getAtaque());
		} else {
			p1.setVida(p1.getVida() - this.getArma().ATAQUE);
		}
	}
	
	
	
}
