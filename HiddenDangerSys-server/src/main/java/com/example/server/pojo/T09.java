package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 消息通知用表
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T09对象", description="消息通知用表")
public class T09 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消息通知ID")
    @TableId(value = "F0901", type = IdType.AUTO)
    private String F0901;

    @ApiModelProperty(value = "用户ID")
    private String F0101;

    @ApiModelProperty(value = "隐患ID")
    private String F0201;

    @ApiModelProperty(value = "通知类别ID")
    private String F0902;

    @ApiModelProperty(value = "通知内容")
    private String F0903;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0930;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0931;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0932;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0933;

    public String getF0901() {
        return F0901;
    }

    public void setF0901(String F0901) {
        this.F0901 = F0901;
    }
    public String getF0101() {
        return F0101;
    }

    public void setF0101(String F0101) {
        this.F0101 = F0101;
    }
    public String getF0201() {
        return F0201;
    }

    public void setF0201(String F0201) {
        this.F0201 = F0201;
    }
    public String getF0902() {
        return F0902;
    }

    public void setF0902(String F0902) {
        this.F0902 = F0902;
    }
    public String getF0903() {
        return F0903;
    }

    public void setF0903(String F0903) {
        this.F0903 = F0903;
    }
    public LocalDateTime getF0930() {
        return F0930;
    }

    public void setF0930(LocalDateTime F0930) {
        this.F0930 = F0930;
    }
    public LocalDateTime getF0931() {
        return F0931;
    }

    public void setF0931(LocalDateTime F0931) {
        this.F0931 = F0931;
    }
    public String getF0932() {
        return F0932;
    }

    public void setF0932(String F0932) {
        this.F0932 = F0932;
    }
    public String getF0933() {
        return F0933;
    }

    public void setF0933(String F0933) {
        this.F0933 = F0933;
    }

    @Override
    public String toString() {
        return "T09{" +
            "F0901=" + F0901 +
            ", F0101=" + F0101 +
            ", F0201=" + F0201 +
            ", F0902=" + F0902 +
            ", F0903=" + F0903 +
            ", F0930=" + F0930 +
            ", F0931=" + F0931 +
            ", F0932=" + F0932 +
            ", F0933=" + F0933 +
        "}";
    }
}
