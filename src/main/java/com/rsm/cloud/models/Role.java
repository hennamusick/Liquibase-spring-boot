package com.rsm.cloud.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role extends BaseModelObject {

	private static final long serialVersionUID = 5979897219543063316L;

	private String name;

	@OneToMany
	private List<Login> login;
}
