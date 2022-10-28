package fr.imt.TP1Mikael;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;


public class testPerson {

	public static void main(String[] args) {
		// creation d'une personne
		Person pers1 = new Person();
		pers1.setSurname("Paul");
		pers1.setName("Personne");
		Person pers2 = new Person("Water", "Roger", "66", "London");

		Jsonb jsonb = JsonbBuilder.create();
		String result = jsonb.toJson(pers1);
		result+=jsonb.toJson(pers2);
		System.out.println(result);

	}

}
