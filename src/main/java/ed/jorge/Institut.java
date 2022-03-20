package ed.jorge;

public class Institut {

	public static void main(String[] args) {

		Alumne p = new Alumne();

		p.nom = "Jorge";
		p.cognoms = "Gregori Tandazo";
		p.cicleFormatiu = "1º DAW";
		p.any = 2022;

		System.out.println(p.toString());

	}

}
