package com.MyBookDemo.Models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Book")
@DiscriminatorValue("Book")
public class Book extends Publication{
	@Column
	private int pages;

}
