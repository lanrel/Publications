package com.MyBookDemo.Models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "BlogPost")
@DiscriminatorValue("Blog")
public class BlogPost extends Publication{
	@Column
	private String url;

}
