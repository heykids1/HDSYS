package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 耗材使用情况表
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T11对象", description="耗材使用情况表")
public class T11 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "耗材ID")
    @TableId(value = "F1101", type = IdType.AUTO)
    private String F1101;

    @ApiModelProperty(value = "隐患ID")
    private String F0201;

    @ApiModelProperty(value = "材料ID")
    private String F1001;

    @ApiModelProperty(value = "数量")
    private String F1102;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F1130;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F1131;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F1132;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F1133;

    public String getF1101() {
        return F1101;
    }

    public void setF1101(String F1101) {
        this.F1101 = F1101;
    }
    public String getF0201() {
        return F0201;
    }

    public void setF0201(String F0201) {
        this.F0201 = F0201;
    }
    public String getF1001() {
        return F1001;
    }

    public void setF1001(String F1001) {
        this.F1001 = F1001;
    }
    public String getF1102() {
        return F1102;
    }

    public void setF1102(String F1102) {
        this.F1102 = F1102;
    }
    public LocalDateTime getF1130() {
        return F1130;
    }

    public void setF1130(LocalDateTime F1130) {
        this.F1130 = F1130;
    }
    public LocalDateTime getF1131() {
        return F1131;
    }

    public void setF1131(LocalDateTime F1131) {
        this.F1131 = F1131;
    }
    public String getF1132() {
        return F1132;
    }

    public void setF1132(String F1132) {
        this.F1132 = F1132;
    }
    public String getF1133() {
        return F1133;
    }

    public void setF1133(String F1133) {
        this.F1133 = F1133;
    }

    @Override
    public String toString() {
        return "T11{" +
            "F1101=" + F1101 +
            ", F0201=" + F0201 +
            ", F1001=" + F1001 +
            ", F1102=" + F1102 +
            ", F1130=" + F1130 +
            ", F1131=" + F1131 +
            ", F1132=" + F1132 +
            ", F1133=" + F1133 +
        "}";
    }
}
