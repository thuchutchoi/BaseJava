package GetterAndSetterTutorial;

public class Mistake2 {
    private int[] scores=new int [6];//bao nhieu cach khai bao mang 1 chieu
    private int[] workAroundScores = new int [6];
    private Person[] arrayPerson = new Person[2];
    public void displayPerson() {
	int lengthPerson= arrayPerson.length;
	for (int i = 0; i < lengthPerson; i++) {
	    System.out.print(this.arrayPerson[i]);
	}
	System.out.println();
    }
    public void displayScores() {
	int lengthScores= scores.length;
	for (int i = 0; i < lengthScores; i++) {
	    System.out.print(this.scores[i] + "/");
	}
	System.out.println();
    }
    public void displayScores2() {
	int lengthScores= workAroundScores.length;
	for (int i = 0; i < lengthScores; i++) {
	    System.out.print(this.workAroundScores[i] + "/");
	}
	System.out.println();
    }
    public Person[] getArrayPerson() {
	return arrayPerson;
    }
    public int[] getScores() {
	return scores;
    }
    public int[] getWorkAroundScores() {
	//return this.workAroundScores.clone();
	return workAroundScores;
    }
    public void setArrayPerson(Person[] arrayPerson) {
	this.arrayPerson = arrayPerson.clone();
	//this.arrayPerson = new Person[arrayPerson.length];
	//System.arraycopy(arrayPerson, 0, this.arrayPerson, 0, arrayPerson.length);
    }
    public void setScores(int[] scores) {
	this.scores = scores;
    }
    public void setWorkAroundScores(int[] workAroundScores) {
	for (int i = 0; i < workAroundScores.length; i++) {
	    System.out.println("hashcode"+System.identityHashCode(workAroundScores[i]));
	}
	this.workAroundScores = workAroundScores.clone();
	for (int i = 0; i < this.workAroundScores.length; i++) {
	    System.out.println("hashcode this.workAroundScores"+System.identityHashCode(this.workAroundScores[i]));
	}
	int []copyWorkAroundScores=new int [workAroundScores.length];
	System.arraycopy(workAroundScores, 0, copyWorkAroundScores, 0, workAroundScores.length);
	for (int i = 0; i < copyWorkAroundScores.length; i++) {
	    System.out.println("hashcode copyWorkAroundScoress"+System.identityHashCode(copyWorkAroundScores[i]));
	}
    }
}



