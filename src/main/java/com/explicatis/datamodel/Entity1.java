package com.explicatis.datamodel;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Entity1 extends BaseEntity
{

	@Id
	private Long	id;

	@Basic
	private String	label;
}
