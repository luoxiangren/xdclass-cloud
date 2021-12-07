package net.xdclass.service.impl;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.stereotype.Component;

@Component
public class VideoServiceFallback implements VideoService {
    @Override
    public Video findById(int videoId) {
        Video video = new Video();
        video.setId(999);
        video.setTitle("异常返回");
        video.setPrice(99);
        video.setSummary("异常返回");
        return video;
    }
}
