package com.MyBookDemo.Models;

import java.sql.Date;
//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Publication_Type")
public abstract class Publication {


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id", updatable = false, nullable = false)
		protected Long id;

		@Column
		protected String title;

		@Version
		@Column(name = "version")
		private int version;

//		@ManyToMany
//		@JoinTable(name = "PublicationAuthor", joinColumns = { @JoinColumn(name = "publicationId", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "authorId", referencedColumnName = "id") })
//		private Set<E> authors = new HashSet<E>();

		@Column
//		@Temporal(TemporalType.DATE)
		private Date publishingDate;

}
