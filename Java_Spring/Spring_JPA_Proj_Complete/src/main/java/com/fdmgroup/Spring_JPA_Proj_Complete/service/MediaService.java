package com.fdmgroup.Spring_JPA_Proj_Complete.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.Media;
import com.fdmgroup.Spring_JPA_Proj_Complete.repository.MediaRepository;

@Service
public class MediaService {
	private MediaRepository mediaRepo;

	public MediaService(MediaRepository mediaRepo) {
		super();
		this.mediaRepo = mediaRepo;
	}
	
	public List<Media> getAllMedia(){
		return mediaRepo.findAll();
	}
}
