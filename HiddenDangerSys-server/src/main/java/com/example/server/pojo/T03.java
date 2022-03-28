package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * .隐患类型ID等全部的隐患类型，后期可由用户维护。
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T03对象", description=".隐患类型ID等全部的隐患类型，后期可由用户维护。")
public class T03 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "隐患类型ID")
    @TableId(value = "F0301", type = IdType.AUTO)
    private String F0301;

    @ApiModelProperty(value = "隐患类型名称")
    private String F0302;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0330;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0331;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0332;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0333;

    public String getF0301() {
        return F0301;
    }

    public void setF0301(String F0301) {
        this.F0301 = F0301;
    }
    public String getF0302() {
        return F0302;
    }

    public void setF0302(String F0302) {
        this.F0302 = F0302;
    }
    public LocalDateTime getF0330() {
        return F0330;
    }

    public void setF0330(LocalDateTime F0330) {
        this.F0330 = F0330;
    }
    public LocalDateTime getF0331() {
        return F0331;
    }

    public void setF0331(LocalDateTime F0331) {
        this.F0331 = F0331;
    }
    public String getF0332() {
        return F0332;
    }

    public void setF0332(String F0332) {
        this.F0332 = F0332;
    }
    public String getF0333() {
        return F0333;
    }

    public void setF0333(String F0333) {
        this.F0333 = F0333;
    }

    @Override
    public String toString() {
        return "T03{" +
            "F0301=" + F0301 +
            ", F0302=" + F0302 +
            ", F0330=" + F0330 +
            ", F0331=" + F0331 +
            ", F0332=" + F0332 +
            ", F0333=" + F0333 +
        "}";
    }
}
