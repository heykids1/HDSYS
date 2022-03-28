package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 耗材库（各种耗材的字典及单位）
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T10对象", description="耗材库（各种耗材的字典及单位）")
public class T10 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "材料ID")
    @TableId(value = "F1001", type = IdType.AUTO)
    private String F1001;

    @ApiModelProperty(value = "该材料的所属类别")
    private String F1002;

    @ApiModelProperty(value = "该材料的名称")
    private String F1003;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F1030;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F1031;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F1032;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F1033;

    public String getF1001() {
        return F1001;
    }

    public void setF1001(String F1001) {
        this.F1001 = F1001;
    }
    public String getF1002() {
        return F1002;
    }

    public void setF1002(String F1002) {
        this.F1002 = F1002;
    }
    public String getF1003() {
        return F1003;
    }

    public void setF1003(String F1003) {
        this.F1003 = F1003;
    }
    public LocalDateTime getF1030() {
        return F1030;
    }

    public void setF1030(LocalDateTime F1030) {
        this.F1030 = F1030;
    }
    public LocalDateTime getF1031() {
        return F1031;
    }

    public void setF1031(LocalDateTime F1031) {
        this.F1031 = F1031;
    }
    public String getF1032() {
        return F1032;
    }

    public void setF1032(String F1032) {
        this.F1032 = F1032;
    }
    public String getF1033() {
        return F1033;
    }

    public void setF1033(String F1033) {
        this.F1033 = F1033;
    }

    @Override
    public String toString() {
        return "T10{" +
            "F1001=" + F1001 +
            ", F1002=" + F1002 +
            ", F1003=" + F1003 +
            ", F1030=" + F1030 +
            ", F1031=" + F1031 +
            ", F1032=" + F1032 +
            ", F1033=" + F1033 +
        "}";
    }
}
