package com.meizhuliu.zl.finance.mapper;

import com.meizhuliu.zl.finance.domian.UserAccountsDO;
import com.meizhuliu.zl.finance.domian.UserAccountsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountsDOMapper {
    long countByExample(UserAccountsDOExample example);

    int deleteByExample(UserAccountsDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAccountsDO record);

    int insertSelective(UserAccountsDO record);

    List<UserAccountsDO> selectByExample(UserAccountsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_accounts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<UserAccountsDO> selectByExampleSelective(@Param("example") UserAccountsDOExample example, @Param("selective") UserAccountsDO.Column ... selective);

    UserAccountsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_accounts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UserAccountsDO selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") UserAccountsDO.Column ... selective);

    int updateByExampleSelective(@Param("record") UserAccountsDO record, @Param("example") UserAccountsDOExample example);

    int updateByExample(@Param("record") UserAccountsDO record, @Param("example") UserAccountsDOExample example);

    int updateByPrimaryKeySelective(UserAccountsDO record);

    int updateByPrimaryKey(UserAccountsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_accounts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UserAccountsDO selectOneByExample(UserAccountsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_accounts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UserAccountsDO selectOneByExampleSelective(@Param("example") UserAccountsDOExample example, @Param("selective") UserAccountsDO.Column ... selective);
}