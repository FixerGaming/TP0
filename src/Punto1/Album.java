package Punto1;

import java.util.Vector;
public class Album {

	private String Nombre;
	private String Lugar;
	private int Fecha;
	Vector<Foto> albumFotos;
	int i,p;
	
	
	public Album(String Nombre, String Lugar, int Fecha)
	{
		this.setNombre(Nombre);
		this.setLugar(Lugar);
		this.setFecha(Fecha);
		albumFotos=new Vector<Foto>();
		i=0;
		p=0;
	}
	
	public void meterFoto(Foto myFoto)
	{
		albumFotos.add(myFoto);
	}

	
	public void borrarElement(int f){
	albumFotos.remove(f);
	}
	
	public Foto mostrarFoto(String n)
	{
		Foto aux=null;
		boolean enc=false;
		
		while(enc==false && p< albumFotos.size()){
			if (albumFotos.get(p).getNombre()==n){
				enc=true;
				aux=albumFotos.get(p);
			}
			else
				p++;
		}
		return aux;	
	}
	public void borrarFoto(String n)
	{
		boolean enc=false;
		
		while(enc==false && p< albumFotos.size()){
			if (albumFotos.get(p).getNombre()==n){
				enc=true;
				albumFotos.remove(p);
			}
			else
				p++;
		}	
	}
	
	
	
	public void mostrarVector(String nombre)
	{
		for(int i=0; i<albumFotos.size(); i++)
		{
			System.out.println(albumFotos.get(i).getNombre());
			System.out.println(albumFotos.get(i).getDescripcion());
			System.out.println("--------\n");
		}
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public int getFecha() {
		return Fecha;
	}

	public void setFecha(int fecha) {
		Fecha = fecha;
	}
	
	
}
