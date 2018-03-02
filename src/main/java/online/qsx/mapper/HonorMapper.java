package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Honor;
import online.qsx.model.HonorCriteria;
import org.apache.ibatis.annotations.Param;

public interface HonorMapper {
    int countByExample(HonorCriteria example);

    int deleteByExample(HonorCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Honor record);

    int insertSelective(Honor record);

    List<Honor> selectByExample(HonorCriteria example);

    Honor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Honor record, @Param("example") HonorCriteria example);

    int updateByExample(@Param("record") Honor record, @Param("example") HonorCriteria example);

    int updateByPrimaryKeySelective(Honor record);

    int updateByPrimaryKey(Honor record);
}