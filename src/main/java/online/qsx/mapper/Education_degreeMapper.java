package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Education_degree;
import online.qsx.model.Education_degreeCriteria;
import org.apache.ibatis.annotations.Param;

public interface Education_degreeMapper {
    int countByExample(Education_degreeCriteria example);

    int deleteByExample(Education_degreeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Education_degree record);

    int insertSelective(Education_degree record);

    List<Education_degree> selectByExample(Education_degreeCriteria example);

    Education_degree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Education_degree record, @Param("example") Education_degreeCriteria example);

    int updateByExample(@Param("record") Education_degree record, @Param("example") Education_degreeCriteria example);

    int updateByPrimaryKeySelective(Education_degree record);

    int updateByPrimaryKey(Education_degree record);
}