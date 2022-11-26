package com.rafaelmgr12.aluraflix.repository;

import com.rafaelmgr12.aluraflix.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosRepository extends JpaRepository<Video, Long> {

}