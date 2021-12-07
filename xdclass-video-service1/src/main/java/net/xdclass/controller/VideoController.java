package net.xdclass.controller;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/video")
@RefreshScope
public class VideoController {

    @Value("${video.Title}")
    private String videoTitle;

    @Autowired
    VideoService videoService;

    @RequestMapping("find_by_id")
    public Video findById(int videoId){
        System.out.println(videoTitle);
        return videoService.findById(videoId);
    }
}
