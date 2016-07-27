package demo.model;

public class User {
	private Integer id;

	private Integer age;

	private String name;

	public User(String userName, int age) {
		this.name = userName;
		this.age = age;
	}

	public User() {
	}

	public User(int id2, String userName, int age2) {
		this(userName, age2);
		this.id = id2;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}