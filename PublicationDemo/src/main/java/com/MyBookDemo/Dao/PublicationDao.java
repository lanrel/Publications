package com.MyBookDemo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.MyBookDemo.Models.Publication;

public interface PublicationDao extends CrudRepository<Publication, Long>{

}
