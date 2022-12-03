package com.rafaelmgr12.aluraflix.service;

import com.rafaelmgr12.aluraflix.dto.PostVideosFormDto;
import com.rafaelmgr12.aluraflix.dto.VideoDetailsDto;
import com.rafaelmgr12.aluraflix.model.Video;
import com.rafaelmgr12.aluraflix.repository.VideosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
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

    public VideoDetailsDto getVideoById(Long id){
        Video video = videoRepository.findById(id).orElseThrow();
        return modelMapper.map(video,VideoDetailsDto.class);
    }

    @Transactional
    public VideoDetailsDto saveVideo(PostVideosFormDto video){
        Video newVideo = modelMapper.map(video, Video.class);

        videoRepository.save(newVideo);
        return modelMapper.map(newVideo,VideoDetailsDto.class);

    }
}
