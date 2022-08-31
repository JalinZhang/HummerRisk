package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryCodeResultLog;
import com.hummerrisk.base.domain.HistoryCodeResultLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryCodeResultLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    long countByExample(HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int deleteByExample(HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int insert(HistoryCodeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int insertSelective(HistoryCodeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    List<HistoryCodeResultLog> selectByExampleWithBLOBs(HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    List<HistoryCodeResultLog> selectByExample(HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    HistoryCodeResultLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCodeResultLog record, @Param("example") HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCodeResultLog record, @Param("example") HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByExample(@Param("record") HistoryCodeResultLog record, @Param("example") HistoryCodeResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCodeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCodeResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_code_result_log
     *
     * @mbg.generated Fri Aug 26 05:57:26 CST 2022
     */
    int updateByPrimaryKey(HistoryCodeResultLog record);
}