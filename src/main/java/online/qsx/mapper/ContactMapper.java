package online.qsx.mapper;

import java.util.List;
import online.qsx.model.Contact;
import online.qsx.model.ContactCriteria;
import org.apache.ibatis.annotations.Param;

public interface ContactMapper {
    int countByExample(ContactCriteria example);

    int deleteByExample(ContactCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Contact record);

    int insertSelective(Contact record);

    List<Contact> selectByExampleWithBLOBs(ContactCriteria example);

    List<Contact> selectByExample(ContactCriteria example);

    Contact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Contact record, @Param("example") ContactCriteria example);

    int updateByExample(@Param("record") Contact record, @Param("example") ContactCriteria example);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKeyWithBLOBs(Contact record);

    int updateByPrimaryKey(Contact record);
}