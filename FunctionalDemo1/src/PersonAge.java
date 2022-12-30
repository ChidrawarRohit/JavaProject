import java.util.function.Consumer;

public class PersonAge {
	//Functional Interface Types--4types
	//2.consumer--modifies data--no output
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public static void main(String[] args) {
		PersonAge p = new PersonAge();
		Consumer<PersonAge> setName=t->t.setName("18");
		setName.accept(p);
		System.out.println(p.getName());
	}   
}
