package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 关联区域排查人员
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T07对象", description="关联区域排查人员")
public class T07 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域排查人员ID")
    @TableId(value = "F0701", type = IdType.AUTO)
    private String F0701;

    @ApiModelProperty(value = "区域ID")
    private String F0601;

    @ApiModelProperty(value = "用户ID")
    private String F0101;

    @ApiModelProperty(value = "人员类型")
    private String F0702;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0730;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0731;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0732;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0733;

    public String getF0701() {
        return F0701;
    }

    public void setF0701(String F0701) {
        this.F0701 = F0701;
    }
    public String getF0601() {
        return F0601;
    }

    public void setF0601(String F0601) {
        this.F0601 = F0601;
    }
    public String getF0101() {
        return F0101;
    }

    public void setF0101(String F0101) {
        this.F0101 = F0101;
    }
    public String getF0702() {
        return F0702;
    }

    public void setF0702(String F0702) {
        this.F0702 = F0702;
    }
    public LocalDateTime getF0730() {
        return F0730;
    }

    public void setF0730(LocalDateTime F0730) {
        this.F0730 = F0730;
    }
    public LocalDateTime getF0731() {
        return F0731;
    }

    public void setF0731(LocalDateTime F0731) {
        this.F0731 = F0731;
    }
    public String getF0732() {
        return F0732;
    }

    public void setF0732(String F0732) {
        this.F0732 = F0732;
    }
    public String getF0733() {
        return F0733;
    }

    public void setF0733(String F0733) {
        this.F0733 = F0733;
    }

    @Override
    public String toString() {
        return "T07{" +
            "F0701=" + F0701 +
            ", F0601=" + F0601 +
            ", F0101=" + F0101 +
            ", F0702=" + F0702 +
            ", F0730=" + F0730 +
            ", F0731=" + F0731 +
            ", F0732=" + F0732 +
            ", F0733=" + F0733 +
        "}";
    }
}
