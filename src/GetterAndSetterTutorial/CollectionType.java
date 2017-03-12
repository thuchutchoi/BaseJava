package GetterAndSetterTutorial;

import java.util.ArrayList;
import java.util.List;

public class CollectionType {
    public static void main(String[] args) throws CloneNotSupportedException {
	CollectionType app = new CollectionType();
	List<String> titles1 = new ArrayList();
	titles1.add("Name");
	titles1.add("Address");
	titles1.add("Email");
	titles1.add("Job");

	app.setListTitles(titles1);

	System.out.println("Titles 1: " + titles1);

	titles1.set(2, "Habilitation");

	List<String> titles2 = app.getListTitles();
	System.out.println("Titles 2: " + titles2);

	titles2.set(0, "Full name");

	List<String> titles3 = app.getListTitles();
	System.out.println("Titles 3: " + titles3);



	List<Person> list1 = new ArrayList<Person>();
	list1.add(new Person(1));
	list1.add(new Person(2));
	list1.add(new Person(3));

	app.setListPerson(list1);

	System.out.println("List 1: " + list1);

	list1.get(2).setAge(100);

	List<Person> list2 = app.getListPerson();
	System.out.println("List 2: " + list2);

	list1.get(0).setAge(99);

	List<Person> list3 = app.getListPerson();
	System.out.println("List 3: " + list3);

    }
    private List<String> listTitles;
    private List<Person> listPerson= new ArrayList<>();
    public List<Person> getListPerson() throws CloneNotSupportedException {
	//return new ArrayList<>(listPerson);
	List<Person> lstRs = new ArrayList<>();
	for (Person p:listPerson) {
	    lstRs.add((Person) p.clone());
	}
	return lstRs;
    }
    public List<String> getListTitles() {
	return new ArrayList<>(listTitles);
    }
    public void setListPerson(List<Person> listPerson) throws CloneNotSupportedException {
	//this.listPerson = new ArrayList<>(listPerson);
	for (Person p:listPerson) {
	    this.listPerson.add((Person) p.clone());
	}
    }
    public void setListTitles(List<String> listTitles) {
	this.listTitles = new ArrayList<>(listTitles);
    }
}
