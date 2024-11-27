package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	private int aid;
	private long ano;
	private String city;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
