package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallRegionStreet;
import org.linlinjava.litemall.db.domain.LitemallRegionStreetExample;

public interface LitemallRegionStreetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(LitemallRegionStreet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(LitemallRegionStreet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<LitemallRegionStreet> selectByExample(LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallRegionStreet> selectByExampleSelective(@Param("example") LitemallRegionStreetExample example, @Param("selective") LitemallRegionStreet.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallRegionStreet record, @Param("example") LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") LitemallRegionStreet record, @Param("example") LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegionStreet selectOneByExample(LitemallRegionStreetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegionStreet selectOneByExampleSelective(@Param("example") LitemallRegionStreetExample example, @Param("selective") LitemallRegionStreet.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_street
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRegionStreet selectByPrimaryKeySelective(@Param("selective") LitemallRegionStreet.Column ... selective);
}