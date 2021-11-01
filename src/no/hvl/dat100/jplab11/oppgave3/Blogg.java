package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledige = 0;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < nesteledige; i++) {
			if(innlegg.erLik(innleggtabell[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		for (int i = 0; i < nesteledige; i++) {
			if(innlegg.erLik(innleggtabell[i])) {
				finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		if (nesteledige < innleggtabell.length) {
			ledig = true;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige++;
			lagtTil = true;
		}
		return lagtTil;
	}
	
	public String toString() {
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
