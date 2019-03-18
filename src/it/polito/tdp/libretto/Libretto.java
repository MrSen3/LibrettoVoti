package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti; //quando è  possibile conviene dichiarare le cose nella maniera più generale possibile
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();//devo mantenere le interfacce più generali possibile, mentre le  implementazioni più specifiche
	}
	
	public void add(int voto, String corso, LocalDate data) {
		Voto v = new Voto (voto, corso, data);
		voti.add(v);
	}
	
	/**
	 * Aggiunge il nuovo voto al libretto
	 * 
	 * 
	 * @param v il{@link Voto} da aggiungere
	 */
	public void add (Voto v) {
		//meno dipendenze ho tra una classe e l'altra meglio è
		voti.add(v);
		//delega 
	}
	
	public void stampaLibretto() {
		System.out.println("Libretto di Amebibbi bitch: \n");
		for (Voto v: voti) {
			//System.out.println(v.getVoto()+ " " +v.getCorso()+ " " +v.getData());
			System.out.println(v.toString());
		}
		
		System.out.println("\n");
			
	}

	public void stampa25() {
		boolean trovato=false;
		System.out.println("Voti = 25: \n");
		for(Voto v: voti) {
			if(v.getVoto()==25) {
				trovato=true;
				System.out.println("- " +v.getCorso()+ "\n");	
			}
		}
		if(trovato==false)
			System.out.println("Non ci sono voti pari a 25\n");
	}
	
	public void trovaVoto (String nomeEsame) {
		boolean trovato=false;
		for(Voto v: voti) {
			if(v.getCorso().compareTo(nomeEsame)==0) {
				trovato=true;
				System.out.println("Hai preso " +v.getVoto()+ " di " +nomeEsame+ "\n");
				return; //metto return perche non ci possono essere esami duplicati
			}
		}
		if(trovato==false)
			System.out.println("Non ci sono voti corrispondenti al corso " +nomeEsame+ "\n");
		
		
	}
	
	public void esiste() {
		
	}

}
