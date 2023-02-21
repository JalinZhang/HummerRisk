package com.hummer.common.mapper.mapper;

import com.hummer.common.mapper.domain.CloudNativeRule;
import com.hummer.common.mapper.domain.CloudNativeRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudNativeRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    long countByExample(CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int deleteByExample(CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int insert(CloudNativeRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int insertSelective(CloudNativeRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    List<CloudNativeRule> selectByExampleWithBLOBs(CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    List<CloudNativeRule> selectByExample(CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    CloudNativeRule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudNativeRule record, @Param("example") CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudNativeRule record, @Param("example") CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExample(@Param("record") CloudNativeRule record, @Param("example") CloudNativeRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKeySelective(CloudNativeRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(CloudNativeRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKey(CloudNativeRule record);
}