package modulo1.ejercicio38.services;
	

	import java.util.ArrayList;
	import java.util.Date;
	

	import modulo1.ejercicio38.model.Asiento;
	import modulo1.ejercicio38.model.Usuario;
	import modulo1.ejercicio38.model.Vuelo;
	

	public interface ReservaService {
	

		public ArrayList<Vuelo> consultaVuelos(Date horarioInicio, Date horarioFin);
	

		public ArrayList<Vuelo> consultaVuelos(Vuelo vuelo);
		
		public ArrayList<Vuelo> consultaVuelos(int precioMenor, int precioMayor);
		
		public int reservaVuelo(Vuelo vuelo, Usuario usuario, ArrayList<Asiento> asientos);
	

		public int compraPasajes(Vuelo vuelo, Usuario usuario, ArrayList<Asiento> asientos, int montoPagado);
	

	}
