package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Skill;
import online.qsx.model.SkillCriteria;
import org.apache.ibatis.annotations.Param;

public interface SkillMapper {
    int countByExample(SkillCriteria example);

    int deleteByExample(SkillCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Skill record);

    int insertSelective(Skill record);

    List<Skill> selectByExample(SkillCriteria example);

    Skill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillCriteria example);

    int updateByExample(@Param("record") Skill record, @Param("example") SkillCriteria example);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}