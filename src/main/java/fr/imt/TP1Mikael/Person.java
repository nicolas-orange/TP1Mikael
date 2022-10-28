package fr.imt.TP1Mikael;

public class Person {

	private int rollingid = 0;
	private int id;
	private String name;
	private String surname;
	private String phone;
	private String city;

	public Person() {
	};

	public Person(String name, String surname, String phone, String city) {
		super();
		this.id = rollingid;
		rollingid++;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", city=" + city
				+ "]";
	}

}
