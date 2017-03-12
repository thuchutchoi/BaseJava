package GetterAndSetterTutorial;

public class Person {
    private int age;
    public Person(int age) {
	this.age=age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
	return new Person(age);
    }
    public int getAge() {
	return age;
    }
    public void setAge(int age) {
	this.age = age;
    }
    @Override
    public String toString() {
	return age+"/";
    }

}
