package restaurantesmalaga.model;

import java.util.Arrays;
import java.util.List;

public class Restaurante // implements Comparable<Restaurante>
{

	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", direccion=" + direccion + ", web=" + web + ", fichaGoogle="
				+ fichaGoogle + ", latitud=" + latitud + ", longitud=" + longitud + ", barrio=" + barrio
				+ ", especialidades=" + especialidades + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getWeb()=" + getWeb() + ", getFichaGoogle()=" + getFichaGoogle()
				+ ", getLatitud()=" + getLatitud() + ", getLongitud()=" + getLongitud() + ", getBarrio()=" + getBarrio()
				+ ", getEspecialidades()=" + getEspecialidades() + ",getPrecioMedio()=" + getPrecioMedio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean iguales = false;

		if (obj != null) {
			// conversion de objetos
			// de modo clasico sería:
			// if (obj instanceof Restaurante)
			// Restaurante r = (Restaurante)obj;
			if (obj instanceof Restaurante r) // Pattern Matching
			{
				// son iguales si tienen misma direccion
				iguales = this.direccion.equals(r.direccion);
			}

			return iguales;

		}
		return iguales;
	}

	// id?¿
	private String nombre;

	private String direccion;
	private String web;
	private String fichaGoogle;
	private float latitud;
	private float longitud;
	private String barrio;
	private List<String> especialidades;
	private float precioMedio;

	public Restaurante(String nombre, String direccion, String web, String fichaGoogle, float latitud, float longitud,
			String barrio, float precioMedio, String... especialidades) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.web = web;
		this.fichaGoogle = fichaGoogle;
		this.latitud = latitud;
		this.longitud = longitud;
		this.barrio = barrio;
		this.especialidades = Arrays.asList(especialidades);
		this.precioMedio = precioMedio;
	}

	public Restaurante() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getFichaGoogle() {
		return fichaGoogle;
	}

	public void setFichaGoogle(String fichaGoogle) {
		this.fichaGoogle = fichaGoogle;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	public float getPrecioMedio() {
		return precioMedio;
	}

	public void setPrecioMedio(float linea) {
		this.precioMedio = linea;
	}

	/*
	 * Ordenar por precio Orden natural
	 * 
	 * @Override public int compareTo(Restaurante o) { int num=0;
	 * if(this.precioMedio < o.precioMedio) { num = -1; }else if (this.precioMedio >
	 * o.precioMedio) { num = 1; } return num; }
	 */

}