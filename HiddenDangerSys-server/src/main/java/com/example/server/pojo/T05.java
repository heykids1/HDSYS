package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 隐患中的图片、视频、音频等保存用表
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T05对象", description="隐患中的图片、视频、音频等保存用表")
public class T05 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "隐患媒体ID")
    @TableId(value = "F0501", type = IdType.AUTO)
    private String F0501;

    @ApiModelProperty(value = "隐患上报时，所上传图片的ID")
    private String F0502;

    @ApiModelProperty(value = "隐患上报时，所上传视频的ID")
    private String F0503;

    @ApiModelProperty(value = "隐患上报时，所上传语音的ID")
    private String F0504;

    @ApiModelProperty(value = "隐患上报后，标记隐患处理状态")
    private String F0505;

    @ApiModelProperty(value = "隐患排查后，所上传图片的ID")
    private String F0506;

    @ApiModelProperty(value = "隐患排查后，标记隐患处理状态")
    private String F0507;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0530;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0531;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0532;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0533;

    public String getF0501() {
        return F0501;
    }

    public void setF0501(String F0501) {
        this.F0501 = F0501;
    }
    public String getF0502() {
        return F0502;
    }

    public void setF0502(String F0502) {
        this.F0502 = F0502;
    }
    public String getF0503() {
        return F0503;
    }

    public void setF0503(String F0503) {
        this.F0503 = F0503;
    }
    public String getF0504() {
        return F0504;
    }

    public void setF0504(String F0504) {
        this.F0504 = F0504;
    }
    public String getF0505() {
        return F0505;
    }

    public void setF0505(String F0505) {
        this.F0505 = F0505;
    }
    public String getF0506() {
        return F0506;
    }

    public void setF0506(String F0506) {
        this.F0506 = F0506;
    }
    public String getF0507() {
        return F0507;
    }

    public void setF0507(String F0507) {
        this.F0507 = F0507;
    }
    public LocalDateTime getF0530() {
        return F0530;
    }

    public void setF0530(LocalDateTime F0530) {
        this.F0530 = F0530;
    }
    public LocalDateTime getF0531() {
        return F0531;
    }

    public void setF0531(LocalDateTime F0531) {
        this.F0531 = F0531;
    }
    public String getF0532() {
        return F0532;
    }

    public void setF0532(String F0532) {
        this.F0532 = F0532;
    }
    public String getF0533() {
        return F0533;
    }

    public void setF0533(String F0533) {
        this.F0533 = F0533;
    }

    @Override
    public String toString() {
        return "T05{" +
            "F0501=" + F0501 +
            ", F0502=" + F0502 +
            ", F0503=" + F0503 +
            ", F0504=" + F0504 +
            ", F0505=" + F0505 +
            ", F0506=" + F0506 +
            ", F0507=" + F0507 +
            ", F0530=" + F0530 +
            ", F0531=" + F0531 +
            ", F0532=" + F0532 +
            ", F0533=" + F0533 +
        "}";
    }
}
