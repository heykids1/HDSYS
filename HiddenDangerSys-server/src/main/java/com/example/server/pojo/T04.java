package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 包含隐患的安全等级，与隐患表相关联
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T04对象", description="包含隐患的安全等级，与隐患表相关联")
public class T04 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "隐患等级ID")
    @TableId(value = "F0401", type = IdType.AUTO)
    private String F0401;

    @ApiModelProperty(value = "隐患等级名称")
    private String F0402;

    @ApiModelProperty(value = "隐患处理的时间长度")
    private String F0405;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0430;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0431;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0432;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0433;

    public String getF0401() {
        return F0401;
    }

    public void setF0401(String F0401) {
        this.F0401 = F0401;
    }
    public String getF0402() {
        return F0402;
    }

    public void setF0402(String F0402) {
        this.F0402 = F0402;
    }
    public String getF0405() {
        return F0405;
    }

    public void setF0405(String F0405) {
        this.F0405 = F0405;
    }
    public LocalDateTime getF0430() {
        return F0430;
    }

    public void setF0430(LocalDateTime F0430) {
        this.F0430 = F0430;
    }
    public LocalDateTime getF0431() {
        return F0431;
    }

    public void setF0431(LocalDateTime F0431) {
        this.F0431 = F0431;
    }
    public String getF0432() {
        return F0432;
    }

    public void setF0432(String F0432) {
        this.F0432 = F0432;
    }
    public String getF0433() {
        return F0433;
    }

    public void setF0433(String F0433) {
        this.F0433 = F0433;
    }

    @Override
    public String toString() {
        return "T04{" +
            "F0401=" + F0401 +
            ", F0402=" + F0402 +
            ", F0405=" + F0405 +
            ", F0430=" + F0430 +
            ", F0431=" + F0431 +
            ", F0432=" + F0432 +
            ", F0433=" + F0433 +
        "}";
    }
}
