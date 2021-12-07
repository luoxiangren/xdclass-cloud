package xdclass.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xdclass.entity.ClusterAll;
import java.util.List;


@Mapper
public interface ClusterAllMapper {
    // 写入数据
    void saveData (ClusterAll clusterAll) ;
    // ID 查询
    ClusterAll selectById (@Param("id") Integer id) ;
    // 查询全部
    List<ClusterAll> selectList () ;
}
