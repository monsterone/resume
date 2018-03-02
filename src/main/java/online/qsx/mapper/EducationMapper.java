package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Education;
import online.qsx.model.EducationCriteria;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    int countByExample(EducationCriteria example);

    int deleteByExample(EducationCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationCriteria example);

    Education selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationCriteria example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationCriteria example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}