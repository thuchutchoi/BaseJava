package GetterAndSetterTutorial;

import java.util.Date;

public class Mistake1 {
    String name;//default scope,default value la null.
    private String workaroundName;//sua sai bang cach dung protected,private
    //primitive types, and String object is the same
    private Date birthDate;
    public Date getBirthDate() {
	return (Date) birthDate.clone();
    }
    public String getName() {
	return this.name;
    }
    public String getWorkaroundName() {
	return workaroundName;
    }
    public void setBirthDate(Date birthDate) {
	this.birthDate = (Date) birthDate.clone();
    }
    /**
     * @param name
     * Chu yeu ko cho no co name invalid
     */
    public void setName(String name) {
	if(name==null||name.isEmpty()||name.split(" ").length==0||name.split("	").length==0||name.length()<3) {
	    throw new IllegalArgumentException("Name is invalid");
	}
	this.name = name;
    }
    public void setWorkaroundName(String workaroundName) {
	if(workaroundName==null||workaroundName.isEmpty()||workaroundName.split(" ").length==0||workaroundName.split("	").length==0||workaroundName.length()<3) {
	    throw new IllegalArgumentException("workaroundName is invalid");
	}
	this.workaroundName = workaroundName;
    }
    @Override
    public String toString() {
	return name+"/"+workaroundName;
    }
}
