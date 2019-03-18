package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto libretto= new Libretto();
				
		libretto.add(new Voto(18, "Fisica 1", LocalDate.of(2019, 01, 17)));
		libretto.add(new Voto(24, "Analisi 1", LocalDate.of(2017, 02, 02)));
		libretto.add(new Voto(25, "Ricerca operativa", LocalDate.of(2018, 06, 27)));
		libretto.add(new Voto(25, "Sistemi elettrici", LocalDate.of(2018, 07, 06)));
		libretto.add(new Voto(26, "Diritto Privato", LocalDate.of(2018, 05, 07)));
		libretto.add(new Voto(24, "Chimica", LocalDate.of(2019, 02, 10)));
		libretto.add(new Voto(25, "Fisica 2", LocalDate.of(2018, 10, 04)));
		libretto.add(new Voto(30, "Sistemi di produzione", LocalDate.of(2018, 11, 17)));
		libretto.add(new Voto(18, "Analisi 2", LocalDate.of(2017, 12, 17)));
		libretto.add(new Voto(22, "Informatica", LocalDate.of(2016, 02, 25)));
		
		libretto.stampaLibretto();
		libretto.stampa25();
		libretto.trovaVoto("Fisica 1");

	}

}
