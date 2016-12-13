package com.rsm.cloud.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Module extends BaseModelObject {

	private static final long serialVersionUID = -3623917426152875859L;

	private String name;

	@OneToOne
	private Login login;

	@OneToMany
	private List<SubModule> subModules;

}
