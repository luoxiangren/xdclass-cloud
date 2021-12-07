package xdclass.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xdclass.config.JsonResult;
import xdclass.config.StatusCode;
import xdclass.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/getUserSexRatio")
    JsonResult getUserSexRatio()
    {
        List<Map<String, Object>> list = userMapper.getUserSexRatio();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getUserAgeRatio")
    JsonResult getUserAgeRatio()
    {
        List<Map<String, Object>> list = userMapper.getUserAgeRatio();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getTotUserRegCnt")
    JsonResult getTotUserRegCnt()
    {
        List<Map<String, Object>> list = userMapper.getTotUserRegCnt();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getRegCntByConuntry")
    JsonResult getRegCntByConuntry()
    {
        List<Map<String, Object>> list = userMapper.getRegCntByConuntry();
        return new JsonResult(StatusCode.OK,list);
    }

    @RequestMapping(value = "/getRegCntLastMon")
    JsonResult getRegCntLastMon()
    {
        List<Map<String, Object>> list = userMapper.getRegCntLastMon();
        return new JsonResult(StatusCode.OK,list);
    }

}
