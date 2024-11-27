package one_to_one_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Bus {
	@Id
	private int id;
	private String name;
	private String type;
	@OneToMany(mappedBy="b")
	  private List<Passenger> p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Passenger> getP() {
		return p;
	}
	public void setP(List<Passenger> p) {
		this.p = p;
	}
	

}
