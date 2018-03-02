package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Experience;
import online.qsx.model.ExperienceCriteria;
import org.apache.ibatis.annotations.Param;

public interface ExperienceMapper {
    int countByExample(ExperienceCriteria example);

    int deleteByExample(ExperienceCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Experience record);

    int insertSelective(Experience record);

    List<Experience> selectByExample(ExperienceCriteria example);

    Experience selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Experience record, @Param("example") ExperienceCriteria example);

    int updateByExample(@Param("record") Experience record, @Param("example") ExperienceCriteria example);

    int updateByPrimaryKeySelective(Experience record);

    int updateByPrimaryKey(Experience record);
}