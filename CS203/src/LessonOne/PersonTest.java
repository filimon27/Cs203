package LessonOne;
import myutil.Person;
public class PersonTest {

	public static void main(String[] args) {
		Person person= new Person();
		person.getName();
		System.out.println(person.getName());
		person.setName("Filimon Bihonegn");
		System.out.println(person.getName());
	}
}
