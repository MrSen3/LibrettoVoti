package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti; //quando è  possibile conviene dichiarare le cose nella maniera più generale possibile
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();//devo mantenere le interfacce più generali possibile, mentre le  implementazioni più specifiche
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
	
	//Inutile
	public void add(int voto, String corso, LocalDate data) {
		Voto v = new Voto (voto, corso, data);
		voti.add(v);
	}
	
	public void stampaLibretto() {
		System.out.println("Libretto: \n");
		for (Voto v: this.voti) {
			//System.out.println(v.getVoto()+ " " +v.getCorso()+ " " +v.getData());
			System.out.println(v.toString());
		}
		System.out.println("\n");
	}
	
	public List<Voto> cercaVoti(int voto){
		List<Voto> result = new ArrayList <Voto>();
		for(Voto v: voti) {
			if(v.getPunti()==voto) {
				result.add(v);} //sto aggiungendo lo stesso oggetto che viene linkato  a questa seconda lista=  non vengono creati dei nuovi oggetti, i voti sono sempre 10 
			}
		return result;
	}
	public List<Voto> trovaVoto (String nomeEsame) {
		
		List<Voto> result = new ArrayList <Voto>();
		for(Voto v: voti) {
			if(v.getCorso().compareTo(nomeEsame)==0) {
				result.add(v);
				return result; //metto return perche non ci possono essere esami duplicati
			}
		}
		System.out.println("Non ci sono voti corrispondenti al corso " +nomeEsame+ "\n");
		return null;
			
	}

}
