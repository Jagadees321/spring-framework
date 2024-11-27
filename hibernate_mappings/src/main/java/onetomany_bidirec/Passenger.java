package onetomany_bidirec;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	@Id
  private  int pid;
  private String name;
  private String gender;
  @ManyToOne
  private Bus b;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Bus getB() {
	return b;
}
public void setB(Bus b) {
	this.b = b;
}
}
