package com.MyBookDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyBookDemo.Dao.PublicationDao;
import com.MyBookDemo.Models.Publication;

@RestController
@RequestMapping("/publication")
public class PublicationController {
	
	@Autowired
	private PublicationDao dao;
	
	@PostMapping("/publication")
	public Publication createPublication(Publication publication)
	{
		dao.save(publication);
		return publication;
	}
	
	@RequestMapping("/publicatins")
	public List<Publication> getPublications(){
		return (List<Publication>)dao.findAll();
	}
	
	@RequestMapping("/publicatins/{id}")
	public Optional<Publication> getPublication(@PathVariable Long id){
		return dao.findById(id);
	}
//	
//	@DeleteMapping("/publications/{id}")
//	public String deletePublication(@PathVariable Long id) {
//		Optional<Publication> publication = dao.findById(id);
//		dao.delete(publication);
//		return "Deleted";
//	}
	
	@PutMapping("/publication")
	public Publication updatePublication(Publication publication) {
		dao.save(publication);
		return publication;
	}
	

}
