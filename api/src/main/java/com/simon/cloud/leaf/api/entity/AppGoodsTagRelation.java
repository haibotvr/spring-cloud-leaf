package com.simon.cloud.leaf.api.entity;

public class AppGoodsTagRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_goods_tag_relation.id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_goods_tag_relation.goods_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_goods_tag_relation.tag_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    private Long tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_goods_tag_relation.id
     *
     * @return the value of app_goods_tag_relation.id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_goods_tag_relation.id
     *
     * @param id the value for app_goods_tag_relation.id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_goods_tag_relation.goods_id
     *
     * @return the value of app_goods_tag_relation.goods_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_goods_tag_relation.goods_id
     *
     * @param goodsId the value for app_goods_tag_relation.goods_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_goods_tag_relation.tag_id
     *
     * @return the value of app_goods_tag_relation.tag_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_goods_tag_relation.tag_id
     *
     * @param tagId the value for app_goods_tag_relation.tag_id
     *
     * @mbg.generated Tue Apr 23 15:31:46 CST 2019
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}