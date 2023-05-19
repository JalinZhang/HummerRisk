package com.hummer.cloud.mapper;

import com.hummer.common.core.domain.RuleGroup;
import com.hummer.common.core.domain.RuleGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    long countByExample(RuleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int deleteByExample(RuleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int insert(RuleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int insertSelective(RuleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    List<RuleGroup> selectByExample(RuleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    RuleGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByExampleSelective(@Param("record") RuleGroup record, @Param("example") RuleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByExample(@Param("record") RuleGroup record, @Param("example") RuleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByPrimaryKeySelective(RuleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_group
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByPrimaryKey(RuleGroup record);
}
