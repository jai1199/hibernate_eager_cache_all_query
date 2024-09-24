package inheritance.hibernate.in;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Motorcycle")
public class Motorcycle extends Vehicle {
    private int topSpeed;
    // other properties and methods specific to Motorcycle

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
    
}
