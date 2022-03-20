package ed.jorge;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Arturo";
		p.apellido = "Candela";
		p.clase = "1º DAM/DAW";
		p.anyo = 2021;
		
		System.out.println(p.toString());

	}

}
