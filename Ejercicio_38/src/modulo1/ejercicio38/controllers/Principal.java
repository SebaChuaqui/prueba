package modulo1.ejercicio38.controllers;

	

	import modulo1.ejercicio38.model.Aeropuerto;
	

	import java.util.ArrayList;
	import java.util.Date;

import ej37.Imprimir;
import modulo1.ejercicio38.model.Aerolinea;
	import modulo1.ejercicio38.model.Asiento;
	import modulo1.ejercicio38.model.Avion;
	import modulo1.ejercicio38.model.Reserva;
	import modulo1.ejercicio38.model.Tarifa;
	import modulo1.ejercicio38.model.Usuario;
	import modulo1.ejercicio38.model.Vuelo;
	import modulo1.ejercicio38.services.ReservaService;
	import modulo1.ejercicio38.services.ReservaServiceImpl;
	

	public class Principal {
	

		ReservaServiceImpl rs;
		
		public static void main(String[] args) {
	

			// TODO Auto-generated method stub
			inicializacion();
	

		}

		public static void inicializacion() {
			ArrayList<Avion> aviones = new ArrayList<Avion>(); //arreglo de avion
			ArrayList<Asiento> asiento = new ArrayList<Asiento>(); //arreglo de Asiento
			ArrayList<Tarifa> tarifa = new ArrayList<Tarifa>(); //arreglo de Tarifa
			Date date1 = new Date();  
			Date date2 = new Date();
			Date date3 = new Date();
			Date date4 = new Date();
			
			Avion avion1 = new Avion("BOING","767",180);  //implementacion de avion en "avion1"
			Avion avion2 = new Avion("BOING","777",240);
			
			aviones.add(avion1);  //agregamos avion 1 al arreglo
			aviones.add(avion2);
			
			Aerolinea aerolinea = new Aerolinea(); //implementacion de aerolinea
			aerolinea.setNombre("PIRAÑA");
			
			aerolinea.setAviones(aviones); //definimos los aviones de la aerolinea
	

			Aeropuerto aeroSantiago = new Aeropuerto("SLC","AeropuertoMerinoBenites","Santiago","Chile");
			Aeropuerto aeroPuntaarenas = new Aeropuerto("PUQ","AeropuertoCarlosIbáñezdelCampo","Punta Arenas","Chile");
			Aeropuerto aeroConcepcion = new Aeropuerto("CCP","AeropuertoCarrielSur","Concepcion","Chile");
			Aeropuerto aeroIquique = new Aeropuerto("IQQ","AeropuertoDiegoAracena","Iquique","Chile");
			Aeropuerto aeroCalama = new Aeropuerto("CJC","AeropuertoElLoa","Calama","Chile");
			
			
			Usuario kath = new Usuario("Kath","kath123","micasa");	
			
			
			Asiento asiento1 = new Asiento(1, "A", false);
			Asiento asiento2 = new Asiento(2, "B", false);
			Asiento asiento3 = new Asiento(3, "C", false);
			Asiento asiento4 = new Asiento(10, "B", false);
			Asiento asiento5 = new Asiento(11, "C", false);
			asiento.add(asiento1);
			asiento.add(asiento2);
			asiento.add(asiento3);
			asiento.add(asiento4);
			asiento.add(asiento5);
					
			Reserva reserva = new Reserva(asiento, 25000, 1, kath);
			
			Tarifa tarifa1 = new Tarifa("Alta",100000,19);
			Tarifa tarifa2 = new Tarifa("Media",55000,19);
			Tarifa tarifa3 = new Tarifa("Baja",25000,19);
			tarifa.add(tarifa1);
			tarifa.add(tarifa2);
			tarifa.add(tarifa3);
					
			Vuelo vuelo = new Vuelo("4A",aerolinea,aeroSantiago,aeroPuntaarenas,asiento,tarifa,date1,date2);
			Vuelo vuelo1= new Vuelo("4B",aerolinea,aeroPuntaarenas,aeroSantiago,asiento,tarifa,date2,date3);
			Vuelo vuelo2 = new Vuelo("7A",aerolinea,aeroSantiago,aeroConcepcion,asiento,tarifa,date1,date2);
			Vuelo vuelo3= new Vuelo("7B",aerolinea,aeroConcepcion,aeroSantiago,asiento,tarifa,date2,date3);
			Vuelo vuelo4 = new Vuelo("14A",aerolinea,aeroSantiago,aeroIquique,asiento,tarifa,date1,date2);
			Vuelo vuelo5= new Vuelo("14B",aerolinea,aeroIquique,aeroSantiago,asiento,tarifa,date2,date3);
			Vuelo vuelo6 = new Vuelo("28A",aerolinea,aeroSantiago,aeroCalama,asiento,tarifa,date2,date3);
			
		}	
		
		
	}
