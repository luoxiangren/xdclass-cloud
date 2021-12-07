package xdclass.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xdclass.entity.ClusterAll;

import java.util.List;
import java.util.Map;

@Mapper
public interface AppMapper {

    List<Map<String, Object>> getAppActByCountry();
}
