package online.qsx.mapper;

import java.util.List;
import online.qsx.model.About_me;
import online.qsx.model.About_meCriteria;
import org.apache.ibatis.annotations.Param;

public interface About_meMapper {
    int countByExample(About_meCriteria example);

    int deleteByExample(About_meCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(About_me record);

    int insertSelective(About_me record);

    List<About_me> selectByExample(About_meCriteria example);

    About_me selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") About_me record, @Param("example") About_meCriteria example);

    int updateByExample(@Param("record") About_me record, @Param("example") About_meCriteria example);

    int updateByPrimaryKeySelective(About_me record);

    int updateByPrimaryKey(About_me record);
}