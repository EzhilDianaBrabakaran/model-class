package com.mentorondemand.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
     
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Id
	@Column(name="email")
    private String email;
	@Column(name="password")
    private String password;
	@Column(name="role")
    private String role;
	
	
	public String getRole() {
		return role;
	}
    @JoinColumn(name="email",unique=true)
	@OneToOne(cascade=CascadeType.ALL)
    private Admin admin;

	public Login( Admin admin) {
		super();
		this.email = admin.getEmail();
		this.password=admin.getPassword();
		this.role=admin.getRole();
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin getAdmin() {
		return admin;
	}

	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public float getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}