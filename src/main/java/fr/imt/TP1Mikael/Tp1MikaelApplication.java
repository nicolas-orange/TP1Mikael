package fr.imt.TP1Mikael;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Tp1MikaelApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1MikaelApplication.class, args);

		Person p1 = new Person("Abitbol", "Georges", "6,10f", "New York City");
		Person p2 = new Person("Luke", "Lucky", "5,9f", "Racoon City");
		Person p3 = new Person("Bardadou", "Cristitol", "6", "Montpellier");
		Map<Integer, Person> hm;
		hm = new HashMap<Integer, Person>();
		hm.put(1, new Person("Who", "Doctor", "0606060606", "London"));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Person pers1 = new Person();
		pers1.setSurname("Paul");
		pers1.setName("Personne");
		Person pers2 = new Person("Water", "Roger", "66", "London");
		
//		Jsonb jsonb = JsonbBuilder.create();
//		String result = jsonb.toJson(pers1);
//		result+=jsonb.toJson(pers2);
//		System.out.println(result);
		
		
// just a test
	}

}
