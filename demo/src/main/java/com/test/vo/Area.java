package com.test.vo;

import java.util.Date;

public class Area {
    /**
     * id
     */
    private Long id;

    /**
     * 编号
     */
    private String number;

    /**
     * 分类	 1:行政区划,2:灌区区划,3:项目区划
     */
    private Integer type;

    /**
     * 等级分类	 11：省，12：市，13：区（县），14：镇（乡），15：村，16：地块 ;21：流域，22：灌区;31：项目。
     */
    private Integer gradetype;

    /**
     * 父区域ID	 没有父地区则为0
     */
    private Long fatherid;

    /**
     * 名称	 第一灌区,...
     */
    private String aname;

    /**
     * 类型	 1：多边形；2：圆型。
     */
    private Integer atype;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 轮廓或圆心	 GPS 多边性序列
     */
    private String points;

    /**
     * 半经	 圆形时半径，米
     */
    private Integer radius;

    /**
     * 颜色
     */
    private Integer color;

    /**
     * 项目信息	 json
     */
    private String projinfo;

    /**
     * 简称
     */
    private String abbreviation;

    /**
     * 
     */
    private Float area;

    /**
     * created_at
     */
    private Date createdAt;

    /**
     * created_user
     */
    private String createdUser;

    /**
     * updated_at
     */
    private Date updatedAt;

    /**
     * updated_user
     */
    private String updatedUser;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 编号
     * @return number 编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 编号
     * @param number 编号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 分类	 1:行政区划,2:灌区区划,3:项目区划
     * @return type 分类	 1:行政区划,2:灌区区划,3:项目区划
     */
    public Integer getType() {
        return type;
    }

    /**
     * 分类	 1:行政区划,2:灌区区划,3:项目区划
     * @param type 分类	 1:行政区划,2:灌区区划,3:项目区划
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 等级分类	 11：省，12：市，13：区（县），14：镇（乡），15：村，16：地块 ;21：流域，22：灌区;31：项目。
     * @return gradetype 等级分类	 11：省，12：市，13：区（县），14：镇（乡），15：村，16：地块 ;21：流域，22：灌区;31：项目。
     */
    public Integer getGradetype() {
        return gradetype;
    }

    /**
     * 等级分类	 11：省，12：市，13：区（县），14：镇（乡），15：村，16：地块 ;21：流域，22：灌区;31：项目。
     * @param gradetype 等级分类	 11：省，12：市，13：区（县），14：镇（乡），15：村，16：地块 ;21：流域，22：灌区;31：项目。
     */
    public void setGradetype(Integer gradetype) {
        this.gradetype = gradetype;
    }

    /**
     * 父区域ID	 没有父地区则为0
     * @return fatherid 父区域ID	 没有父地区则为0
     */
    public Long getFatherid() {
        return fatherid;
    }

    /**
     * 父区域ID	 没有父地区则为0
     * @param fatherid 父区域ID	 没有父地区则为0
     */
    public void setFatherid(Long fatherid) {
        this.fatherid = fatherid;
    }

    /**
     * 名称	 第一灌区,...
     * @return aname 名称	 第一灌区,...
     */
    public String getAname() {
        return aname;
    }

    /**
     * 名称	 第一灌区,...
     * @param aname 名称	 第一灌区,...
     */
    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    /**
     * 类型	 1：多边形；2：圆型。
     * @return atype 类型	 1：多边形；2：圆型。
     */
    public Integer getAtype() {
        return atype;
    }

    /**
     * 类型	 1：多边形；2：圆型。
     * @param atype 类型	 1：多边形；2：圆型。
     */
    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    /**
     * 纬度
     * @return lat 纬度
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 纬度
     * @param lat 纬度
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 经度
     * @return lng 经度
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 经度
     * @param lng 经度
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 轮廓或圆心	 GPS 多边性序列
     * @return points 轮廓或圆心	 GPS 多边性序列
     */
    public String getPoints() {
        return points;
    }

    /**
     * 轮廓或圆心	 GPS 多边性序列
     * @param points 轮廓或圆心	 GPS 多边性序列
     */
    public void setPoints(String points) {
        this.points = points == null ? null : points.trim();
    }

    /**
     * 半经	 圆形时半径，米
     * @return radius 半经	 圆形时半径，米
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * 半经	 圆形时半径，米
     * @param radius 半经	 圆形时半径，米
     */
    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    /**
     * 颜色
     * @return color 颜色
     */
    public Integer getColor() {
        return color;
    }

    /**
     * 颜色
     * @param color 颜色
     */
    public void setColor(Integer color) {
        this.color = color;
    }

    /**
     * 项目信息	 json
     * @return projinfo 项目信息	 json
     */
    public String getProjinfo() {
        return projinfo;
    }

    /**
     * 项目信息	 json
     * @param projinfo 项目信息	 json
     */
    public void setProjinfo(String projinfo) {
        this.projinfo = projinfo == null ? null : projinfo.trim();
    }

    /**
     * 简称
     * @return abbreviation 简称
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 简称
     * @param abbreviation 简称
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    /**
     * 
     * @return area 
     */
    public Float getArea() {
        return area;
    }

    /**
     * 
     * @param area 
     */
    public void setArea(Float area) {
        this.area = area;
    }

    /**
     * created_at
     * @return created_at created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * created_at
     * @param createdAt created_at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * created_user
     * @return created_user created_user
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * created_user
     * @param createdUser created_user
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    /**
     * updated_at
     * @return updated_at updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * updated_at
     * @param updatedAt updated_at
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * updated_user
     * @return updated_user updated_user
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * updated_user
     * @param updatedUser updated_user
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser == null ? null : updatedUser.trim();
    }
}