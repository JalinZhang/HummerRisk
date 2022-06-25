package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.ImageResultLog;
import com.hummerrisk.base.domain.ImageResultLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageResultLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    long countByExample(ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int deleteByExample(ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int insert(ImageResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int insertSelective(ImageResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    List<ImageResultLog> selectByExampleWithBLOBs(ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    List<ImageResultLog> selectByExample(ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    ImageResultLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") ImageResultLog record, @Param("example") ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") ImageResultLog record, @Param("example") ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByExample(@Param("record") ImageResultLog record, @Param("example") ImageResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByPrimaryKeySelective(ImageResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(ImageResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_result_log
     *
     * @mbg.generated Sat Jun 25 17:09:30 CST 2022
     */
    int updateByPrimaryKey(ImageResultLog record);
}