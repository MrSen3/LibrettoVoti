package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti; //quando �  possibile conviene dichiarare le cose nella maniera pi� generale possibile
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();//devo mantenere le interfacce pi� generali possibile, mentre le  implementazioni pi� specifiche
	}
	
	/**
	 * Aggiunge il nuovo voto al libretto
	 * 
	 * 
	 * @param v il{@link Voto} da aggiungere
	 */
	public void add (Voto v) {
		//meno dipendenze ho tra una classe e l'altra meglio �
		voti.add(v);
		//delega 
	}

	/**Seleziona il sottoiniseme di voti che hanno il punteggio specificato
	 * 
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link voto} aventi quel punteggio
	 */
	
	
	public List<Voto> cercaVoti(int punti){
		List<Voto> result = new ArrayList <Voto>();
		for(Voto v: voti) {
			if(v.getPunti()==punti) {
				result.add(v);} //sto aggiungendo lo stesso oggetto che viene linkato  a questa seconda lista=  non vengono creati dei nuovi oggetti, i voti sono sempre 10 
			}
		return result;
	}
	
	/**
	 * 
	 * Ricerca un {@link Voto} relativo al corso di cui e` specificato il nome
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@linkVoto} corrisspondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame (String nomeEsame) {
		Voto voto = new Voto(0, nomeEsame, null); //sembra sbagliato ma in realta confronta tramite il metodo equals il quale confronta solo i nomi dei corsi quindi posso creare un voto fasullo come questo
		int pos = this.voti.indexOf(voto);
		if(pos==-1)
			return null;
		else
			return this.voti.get(pos);
			
	}
	
	/**
	 * Dato un {@link Voto} determina se esiste gia un voto con uguale punteggio
	 * 
	 * @param v
	 * @return {@code true}, se ha trovato un corso  e punteggio uguali, 
	 * 		   {@code false} se non ha trovato il corso, oppure l'ha trovato con voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos==-1)//non contiene v
			return false;
		else 
			return(v.getPunti() == this.voti.get(pos).getPunti());

		}

}
