
public class Intern implements Comparable<Intern> {

	int id;
	String name;
	String batch;
	int age;
	String technology;
	static int counter;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Intern(String name, String batch, int age, String technology) {
		super();
		id = ++counter;
		this.name = name;
		this.batch = batch;
		this.age = age;
		this.technology = technology;
	}
	/*public int compareTo(Intern i)
	{
		if(age==i.age)
			return 0;
		else if(age<i.age)
			return 1;
		else
			return -1;
	}*/
	public int compareTo(Intern i)
	{
		/*if(name==i.name)
			return 0;
		else if(name.compareTo(i.name)>0)
			return 1;
		else
			return -1;*/
		return this.name.compareTo(i.name);
	}
}
