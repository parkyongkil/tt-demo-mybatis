package tt.demo.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the phone database table.
 * 
 */
@Entity
@Table(name="phone")
@NamedQuery(name="Phone.findAll", query="SELECT p FROM Phone p")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PhonePK id;

	public Phone() {
	}

	public PhonePK getId() {
		return this.id;
	}

	public void setId(PhonePK id) {
		this.id = id;
	}

}