package io.xpelliars.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({
		@NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e ORDER BY e.email ASC"),
		@NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email=:pEmail")
})
public class Employee {
	
	@Id
	@GenericGenerator(name = "customUID", strategy = "uuid2")
	@GeneratedValue(generator="customUID")
	private String id;
	private String firstName;
	private String lastName;
	
//	@Column(columnDefinition = "CHAR")
	@Column(unique = true)
	private String email;
	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
