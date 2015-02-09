package com.esprit.naturespirit;

import com.esprit.naturespirit.User;

import java.io.Serializable;
import java.lang.Boolean;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Simple_user
 *
 */
@Entity
@Table(name="T_Simple_user")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Simple_user extends User implements Serializable {

	
	private Boolean state_journalist;
	private static final long serialVersionUID = 1L;

	public Simple_user() {
		super();
	}   
	public Boolean getState_journalist() {
		return this.state_journalist;
	}

	public void setState_journalist(Boolean state_journalist) {
		this.state_journalist = state_journalist;
	}
   
}
