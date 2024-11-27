package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boy {
	@Id
    private int bid;
	private String name;
    private int age;
    
    public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	
}
