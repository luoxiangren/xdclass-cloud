package net.xdclass.controller;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.bouncycastle.math.Primes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/video_order")
public class OrderController {

    @Autowired
    VideoService videoService;

    @RequestMapping("/find_by_id")
    public Video findById(int videoId){
        return videoService.findById(videoId);
    }

}
