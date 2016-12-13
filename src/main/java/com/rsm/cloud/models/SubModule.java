package com.rsm.cloud.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SubModule extends BaseModelObject {

	private static final long serialVersionUID = -6106265617178940305L;

	private String name;

	@OneToOne
	private Login login;

	@OneToOne
	private Module module;
}
