package main;

import java.util.Scanner;

import entidad.Muniemon;
import enumerador.TipoElemento;
import entidad.Interfaz;

public class Combate {
	
	static Scanner sc = new Scanner(System.in);
	private Muniemon munieOne;
	private Muniemon munieTwo;
	
	public Combate() {
		super();
	}

	public Combate(Muniemon munieOne, Muniemon munieTwo) {
		super();
		this.munieOne = munieOne;
		this.munieTwo = munieTwo;
	}

	public Muniemon getMunieOne() {
		return munieOne;
	}

	public void setMunieOne(Muniemon munieOne) {
		this.munieOne = munieOne;
	}

	public Muniemon getMunieTwo() {
		return munieTwo;
	}

	public void setMunieTwo(Muniemon munieTwo) {
		this.munieTwo = munieTwo;
	}

	@Override
	public String toString() {
		return "Combate [munieOne=" + munieOne + ", munieTwo=" + munieTwo + "]";
	}
	
	public void empezarCombate() {
		
		Muniemon muniemonA = null;
		Muniemon muniemonB = null;
		
		multiplicadorPorElemento();
		
		if (munieOne.getVelocidad() >= munieTwo.getVelocidad()) {
			muniemonA = munieOne;
			muniemonB = munieTwo;
		} else {
			muniemonA = munieTwo;
			muniemonB = munieOne;
		}
		
		int contador = 0;
		do {
			
			Interfaz.openingFuncion(muniemonA.getNombre() + " ataca a " +
					muniemonB.getNombre());
			
			if (muniemonA.getVida() == 0) {
				System.out.println(muniemonA.getNombre() +
						" está muerto, no puede atacar");
			} else if (muniemonB.getVida() == 0) {
				System.out.println(muniemonB.getNombre() +
						" está muerto, no puede atacar");
			} else {
				if (muniemonA.getAtaque() > muniemonB.getDefensa()) {
					muniemonB.setVida((muniemonB.getVida() - muniemonA.getAtaque())
							+ muniemonB.getDefensa()) ;
					System.out.println("Le quitaste " + (muniemonA.getAtaque()
							- muniemonB.getDefensa()) + " puntos de vida");
					if (muniemonB.getVida() < 0) {
						muniemonB.setVida(0);
						System.out.println("Mataste a " + muniemonB.getNombre());
					}
				} else if (muniemonA.getAtaque() <= muniemonB.getDefensa()) {
					System.out.println("La defensa de " + muniemonB.getNombre() +
							" es superior");
				}
			}
			
			Muniemon guardaMunie = muniemonA;
			muniemonA = muniemonB;
			muniemonB = guardaMunie;
			
			Interfaz.endingFuncion("l ataque");
			System.out.println("Pulsa enter para continuar");
			sc.nextLine();
			
		} while (muniemonA.getVida() != 0 && muniemonB.getVida() != 0);

		if (munieOne.getVida() == 0) {
			System.out.println(munieOne.getNombre() + " ha caído");
		} else {
			System.out.println(munieTwo.getNombre() + " ha caído");
		}
	}
	
	public void multiplicadorPorElemento() {
		if (munieOne.getTipoElemento() == TipoElemento.AGUA) {
			if (munieTwo.getTipoElemento() == TipoElemento.FUEGO) {
				munieOne.setAtaque((int) (munieOne.getAtaque() * 1.5));
			} else if (munieTwo.getTipoElemento() == TipoElemento.PLANTA) {
				munieTwo.setAtaque((int) (munieTwo.getAtaque() * 1.5));
			}
		} else if (munieOne.getTipoElemento() == TipoElemento.FUEGO) {
			if (munieTwo.getTipoElemento() == TipoElemento.PLANTA) {
				munieOne.setAtaque((int) (munieOne.getAtaque() * 1.5));
			} else if (munieTwo.getTipoElemento() == TipoElemento.AGUA) {
				munieTwo.setAtaque((int) (munieTwo.getAtaque() * 1.5));
			}
		} else if (munieOne.getTipoElemento() == TipoElemento.PLANTA) {
			if (munieTwo.getTipoElemento() == TipoElemento.AGUA) {
				munieOne.setAtaque((int) (munieOne.getAtaque() * 1.5));
			} else if (munieTwo.getTipoElemento() == TipoElemento.FUEGO) {
				munieTwo.setAtaque((int) (munieTwo.getAtaque() * 1.5));
			}
		}
	}
	
}
