package com.explicatis.datamodel;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class BaseEntity
{

	@Transient
	public String getString()
	{
		return "";
	}
}
