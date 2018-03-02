package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Working_status;
import online.qsx.model.Working_statusCriteria;
import org.apache.ibatis.annotations.Param;

public interface Working_statusMapper {
    int countByExample(Working_statusCriteria example);

    int deleteByExample(Working_statusCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Working_status record);

    int insertSelective(Working_status record);

    List<Working_status> selectByExample(Working_statusCriteria example);

    Working_status selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Working_status record, @Param("example") Working_statusCriteria example);

    int updateByExample(@Param("record") Working_status record, @Param("example") Working_statusCriteria example);

    int updateByPrimaryKeySelective(Working_status record);

    int updateByPrimaryKey(Working_status record);
}