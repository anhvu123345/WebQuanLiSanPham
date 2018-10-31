package com.example.demo.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;





@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	
	@Column(name="email", nullable = false, unique = true)
	@Email(message="Vui lòng nhập một email hợp lệ")
	@NotEmpty(message="Làm ơn nhập vào một email")
	private String email;
	
	@Column(name="password", nullable= false)
	private String passWord;
	
	@JoinTable(
			name = "user_role", 
			joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")}, 
			inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
		)
	    @ManyToMany(cascade = CascadeType.MERGE)
	    private Set<Role> roles = new HashSet<>();
	
	@Column(name="firt_name" )
	@NotEmpty(message="Làm ơn nhập họ")
	private String firtName;
	
	@Column(name="lastname")
	@NotEmpty(message="Làm ơn nhập tên")
	private String lastName;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "reset_token")
	private String resetToken;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
}
