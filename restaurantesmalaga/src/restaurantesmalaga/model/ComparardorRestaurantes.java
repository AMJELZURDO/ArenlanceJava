package restaurantesmalaga.model;

import java.util.Comparator;

public class ComparardorRestaurantes implements Comparator<Restaurante>{

	@Override
	public int compare(Restaurante o1, Restaurante o2) {

		o1.getNombre().compareTo(o2.getNombre());
		return 0;
	}
	
	

}
