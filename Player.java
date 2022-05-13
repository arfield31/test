package baseballObjects;

public class Player {
	int age;
	String firstName;
	String lastName;
	int contactSkill;
	int powerSkill;
	public Player (String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	@Override
	public String toString() {
		return "Player [firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}
