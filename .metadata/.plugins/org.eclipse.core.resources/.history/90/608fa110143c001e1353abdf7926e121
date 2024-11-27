package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	 @Id
     private int sid;
     private String name;
     @ManyToMany
     private List<Subject> s;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getS() {
		return s;
	}
	public void setS(List<Subject> s) {
		this.s = s;
	}
}
