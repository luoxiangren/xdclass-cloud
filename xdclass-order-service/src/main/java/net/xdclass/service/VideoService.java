package net.xdclass.service;

import net.xdclass.domain.Video;
import net.xdclass.service.impl.VideoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "xdclass-video-service",fallback = VideoServiceFallback.class)
public interface VideoService {
    @GetMapping("/api/v1/video/find_by_id")
    Video findById(@RequestParam("videoId")int videoId);
}
