package com.ibm.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Table_dtls")
public class Contact {

	@jakarta.persistence.Id
	@GeneratedValue
	private Integer Id;
	private String name;
	private String email;
	private long mobnum;
	public Object getContactId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
