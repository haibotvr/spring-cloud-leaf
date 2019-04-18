package com.simon.cloud.leaf.provider.dao;

import com.simon.cloud.leaf.api.entity.AppGoods;
import com.simon.cloud.leaf.api.entity.AppGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    long countByExample(AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int deleteByExample(AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int insert(AppGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int insertSelective(AppGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    List<AppGoods> selectByExampleWithBLOBs(AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    List<AppGoods> selectByExample(AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    AppGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") AppGoods record, @Param("example") AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") AppGoods record, @Param("example") AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByExample(@Param("record") AppGoods record, @Param("example") AppGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByPrimaryKeySelective(AppGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(AppGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_goods
     *
     * @mbg.generated Thu Apr 18 10:43:18 CST 2019
     */
    int updateByPrimaryKey(AppGoods record);
}