package com.rafaelmgr12.aluraflix.controller;


import com.rafaelmgr12.aluraflix.dto.PostVideosFormDto;
import com.rafaelmgr12.aluraflix.dto.VideoDetailsDto;
import com.rafaelmgr12.aluraflix.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

    @PostMapping

    public ResponseEntity<VideoDetailsDto> saveVideo(@RequestBody @Valid PostVideosFormDto videoDto, UriComponentsBuilder uriBuilder){
        VideoDetailsDto video = videosService.saveVideo(videoDto);
        URI uri = uriBuilder.path("/videos/{id}").buildAndExpand(video.getId()).toUri();
        return ResponseEntity.created(uri).body(video);
    }
}
