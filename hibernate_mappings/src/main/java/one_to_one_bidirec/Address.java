package one_to_one_bidirec;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
    private int aid;
    private int pin;
    private String city;
    @OneToOne
    private Building b;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Building getB() {
		return b;
	}
	public void setB(Building b) {
		this.b = b;
	}
}
