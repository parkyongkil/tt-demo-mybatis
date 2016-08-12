package tt.demo.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the phone database table.
 * 
 */
@Embeddable
public class PhonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="customer_id", unique=true, nullable=false, length=45)
	private String customerId;

	@Column(name="phone_no", unique=true, nullable=false, length=45)
	private String phoneNo;

	public PhonePK() {
	}
	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PhonePK)) {
			return false;
		}
		PhonePK castOther = (PhonePK)other;
		return 
			this.customerId.equals(castOther.customerId)
			&& this.phoneNo.equals(castOther.phoneNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.customerId.hashCode();
		hash = hash * prime + this.phoneNo.hashCode();
		
		return hash;
	}
}