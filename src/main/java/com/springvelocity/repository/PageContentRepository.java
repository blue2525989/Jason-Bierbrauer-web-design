package com.springvelocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springvelocity.model.PageContent;

public interface PageContentRepository extends JpaRepository<PageContent, Long> {
	
	PageContent findByType(String type);
	
	PageContent findByTitle(String title);
	
	PageContent findById(Long id);

}
