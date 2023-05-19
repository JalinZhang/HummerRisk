package com.hummer.cloud.mapper;

import com.hummer.common.core.domain.Rule;
import com.hummer.common.core.domain.RuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    long countByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int deleteByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int insert(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int insertSelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    List<Rule> selectByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    Rule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByExampleSelective(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByExample(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByPrimaryKeySelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Fri May 19 22:42:27 CST 2023
     */
    int updateByPrimaryKey(Rule record);
}
