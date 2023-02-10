package com.fdmgroup.Spring_JPA_Proj_Complete.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.Media;
import com.fdmgroup.Spring_JPA_Proj_Complete.model.MediaType;


public interface MediaRepository extends JpaRepository<Media, Long> {
	
	List<Media> findByMediaType(MediaType mediaType);
	
	@Query("SELECT m FROM Media m WHERE " 
			+"lower(m.title) LIKE lower(concat('%', :searchTerm, '%')) OR "+
			"lower(m.description) LIKE lower(concat('%', :searchTerm, '%'))")
	List<Media> findBySearchTerm(@Param("searchTerm") String term);
	
}
