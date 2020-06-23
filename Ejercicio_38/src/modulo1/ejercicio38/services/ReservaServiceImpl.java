package modulo1.ejercicio38.services;
	
	import java.util.ArrayList;
	import java.util.Date;
	

	import modulo1.ejercicio38.model.Asiento;
	import modulo1.ejercicio38.model.Usuario;
	import modulo1.ejercicio38.model.Vuelo;
	

	public class ReservaServiceImpl implements ReservaService {
	

		@Override
		public ArrayList<Vuelo> consultaVuelos(Date horarioInicio, Date horarioFin) {
			// TODO Auto-generated method stub
			return null;
		}
	

		@Override
		public ArrayList<Vuelo> consultaVuelos(Vuelo vuelo) {
			// TODO Auto-generated method stub
			return null;
		}
	

		@Override
		public ArrayList<Vuelo> consultaVuelos(int precioMenor, int precioMayor) {
			// TODO Auto-generated method stub
			return null;
		}
	

		@Override
		public int reservaVuelo(Vuelo vuelo, Usuario usuario, ArrayList<Asiento> asientos) {
			// TODO Auto-generated method stub
			return 0;
		}
	

		@Override
		public int compraPasajes(Vuelo vuelo, Usuario usuario, ArrayList<Asiento> asientos, int montoPagado) {
			// TODO Auto-generated method stub
			return 0;
		}
	

	}
