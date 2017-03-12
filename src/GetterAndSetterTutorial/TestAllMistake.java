package GetterAndSetterTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestAllMistake {
    public static void main(String[] args) {
	Mistake1 mis = new Mistake1();
	//mis.setName(" ");
	//mis.setName("	");
	//mis.setName(null);
	//mis.setName("");
	//mis.setName("ha");
	mis.name="Ha";
	System.out.println(mis);
	mis.name="Khong phai Nguyen Tu Nghia roi";//thay doi gia tri bien khong thong qua ham set.
	//mis.workaroundName="la";
	System.out.println(mis);
	//---------------------------------------------------------------------------------------
	Mistake2 mis2 = new Mistake2();
	mis2.displayScores();
	int[] myScores = {5, 5, 4, 3, 2, 4};
	mis2.setScores(myScores);
	mis2.displayScores();
	myScores[1] = 1;//thay doi gia tri bien khong thong qua ham set
	mis2.displayScores();
	System.out.println(System.identityHashCode(myScores));
	System.out.println(System.identityHashCode(mis2.getScores()));
	//---------------------------------------------------------------------------------------
	int[] myScores2 = {5, 5, 4, 3, 2, 4};
	mis2.setWorkAroundScores(myScores2);
	mis2.displayScores2();
	myScores2[1] = 1;//thay doi gia tri bien khong thong qua ham set
	mis2.displayScores2();
	System.out.println(System.identityHashCode(myScores2));
	System.out.println(System.identityHashCode(mis2.getWorkAroundScores()));
	int[] myScores3 =mis2.getWorkAroundScores();
	myScores3[5]=9876;
	mis2.displayScores2();
	//----------------------------------------------------------------------------------------
	Person p1 = new Person(2);
	Person[] myPerson = {p1,new Person(3)};
	mis2.setArrayPerson(myPerson);
	mis2.displayPerson();
	//p1.setAge(123);
	Person[]myPerson2= mis2.getArrayPerson();
	myPerson2[1]= new Person(4321);
	mis2.displayPerson();
	//----------------------------------------------------------------------------------------
	ArrayList<Integer> arrayList= new ArrayList<>();
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(3);

	ArrayList<Integer> copyArr = new ArrayList<>(3) ;
	copyArr.add(null);
	copyArr.add(null);
	copyArr.add(null);
	//= new ArrayList<>(arrayList);
	Collections.copy(copyArr, arrayList);
	ArrayList<Integer> clone = (ArrayList<Integer>) arrayList.clone();
	Iterator<Integer> iterator = arrayList.iterator();
	while (iterator.hasNext()) {
	    System.out.println("AL:"+System.identityHashCode(iterator.next()));
	}

	Iterator<Integer> iterator2 = clone.iterator();
	while (iterator2.hasNext()) {
	    System.out.println("ALC:"+System.identityHashCode(iterator2.next()));
	}
	Iterator<Integer> iterator3 = copyArr.iterator();
	while (iterator3.hasNext()) {
	    System.out.println("ALCA:"+System.identityHashCode(iterator3.next()));
	}
	//--------------------------------------------------------------------
	Mistake3 mis3 = new Mistake3();
	int[] myScores4 = {5, 5, 4, 3, 2, 4};
	mis3.setScores(myScores4);
	mis3.displayScores();
	int[] scores = mis3.getScores();
	scores[0]=99;//thay doi gia tri ma ko can dung ham set
	mis3.displayScores();
    }
}
