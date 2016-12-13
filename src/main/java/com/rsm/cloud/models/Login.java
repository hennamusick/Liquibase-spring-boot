package com.rsm.cloud.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Login extends BaseModelObject {

	private static final long serialVersionUID = -7558705326466796139L;

	private String userName;

	private String Password;

	@OneToMany
	private List<Role> role;

	@OneToMany
	private List<Module> module;

	@OneToMany
	private List<SubModule> subModules;

}
