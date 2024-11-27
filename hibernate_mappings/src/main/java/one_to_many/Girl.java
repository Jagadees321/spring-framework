package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Girl {
	@Id
    private int gid;
    private String name;
    private int age;
    @OneToMany
    private List<Boy> b;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
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

	public List<Boy> getB() {
		return b;
	}

	public void setB(List<Boy> b) {
		this.b = b;
	}
    
}
