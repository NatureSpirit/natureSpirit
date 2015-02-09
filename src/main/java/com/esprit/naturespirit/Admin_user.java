package com.esprit.naturespirit;

import com.esprit.naturespirit.User;

import java.io.Serializable;
import java.lang.Boolean;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin_user
 *
 */
@Entity
@Table(name="T_Admin_user")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Admin_user extends User implements Serializable {

	
	private Boolean state_agent;
	private static final long serialVersionUID = 1L;

	public Admin_user() {
		super();
	}   
	public Boolean getState_agent() {
		return this.state_agent;
	}

	public void setState_agent(Boolean state_agent) {
		this.state_agent = state_agent;
	}
   
}
