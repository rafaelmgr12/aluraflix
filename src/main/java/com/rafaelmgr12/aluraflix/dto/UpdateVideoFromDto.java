package com.rafaelmgr12.aluraflix.dto;

import javax.validation.constraints.NotNull;

public class UpdateVideoFromDto extends PostVideosFormDto {

    @NotNull
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
