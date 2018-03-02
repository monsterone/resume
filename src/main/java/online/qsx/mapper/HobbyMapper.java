package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Hobby;
import online.qsx.model.HobbyCriteria;
import org.apache.ibatis.annotations.Param;

public interface HobbyMapper {
    int countByExample(HobbyCriteria example);

    int deleteByExample(HobbyCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Hobby record);

    int insertSelective(Hobby record);

    List<Hobby> selectByExample(HobbyCriteria example);

    Hobby selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hobby record, @Param("example") HobbyCriteria example);

    int updateByExample(@Param("record") Hobby record, @Param("example") HobbyCriteria example);

    int updateByPrimaryKeySelective(Hobby record);

    int updateByPrimaryKey(Hobby record);
}