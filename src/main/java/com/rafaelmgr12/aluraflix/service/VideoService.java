package com.rafaelmgr12.aluraflix.service;

import com.rafaelmgr12.aluraflix.dto.VideoDetailsDto;
import com.rafaelmgr12.aluraflix.model.Video;
import com.rafaelmgr12.aluraflix.repository.VideosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideoService {

    @Autowired
    private VideosRepository videoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<VideoDetailsDto> listAllVideos(){
        List<Video> allVideos = videoRepository.findAll();
        return allVideos.stream().map(v->modelMapper.map(v,VideoDetailsDto.class)).collect(Collectors.toList());
    }
}
