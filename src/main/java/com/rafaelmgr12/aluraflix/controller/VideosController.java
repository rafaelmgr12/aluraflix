package com.rafaelmgr12.aluraflix.controller;


import com.rafaelmgr12.aluraflix.dto.VideoDetailsDto;
import com.rafaelmgr12.aluraflix.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideosController {
    @Autowired
    private VideoService videosService;

    @GetMapping
    public List<VideoDetailsDto> listarTodos() {
        return videosService.listAllVideos();
    }
    @GetMapping("/{id}")
    public VideoDetailsDto getVideoById(Long id){
        return videosService.getVideoById(id);
    }
}
