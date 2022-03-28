package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 根据区域，按照隐患类型安排人员
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T08对象", description="根据区域，按照隐患类型安排人员")
public class T08 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域划分ID")
    @TableId(value = "F0801", type = IdType.AUTO)
    private String F0801;

    @ApiModelProperty(value = "隐患类型ID")
    private String F0301;

    @ApiModelProperty(value = "用户ID")
    private String F0101;

    @ApiModelProperty(value = "人员类型")
    private String F0802;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0830;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0831;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0832;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0833;

    public String getF0801() {
        return F0801;
    }

    public void setF0801(String F0801) {
        this.F0801 = F0801;
    }
    public String getF0301() {
        return F0301;
    }

    public void setF0301(String F0301) {
        this.F0301 = F0301;
    }
    public String getF0101() {
        return F0101;
    }

    public void setF0101(String F0101) {
        this.F0101 = F0101;
    }
    public String getF0802() {
        return F0802;
    }

    public void setF0802(String F0802) {
        this.F0802 = F0802;
    }
    public LocalDateTime getF0830() {
        return F0830;
    }

    public void setF0830(LocalDateTime F0830) {
        this.F0830 = F0830;
    }
    public LocalDateTime getF0831() {
        return F0831;
    }

    public void setF0831(LocalDateTime F0831) {
        this.F0831 = F0831;
    }
    public String getF0832() {
        return F0832;
    }

    public void setF0832(String F0832) {
        this.F0832 = F0832;
    }
    public String getF0833() {
        return F0833;
    }

    public void setF0833(String F0833) {
        this.F0833 = F0833;
    }

    @Override
    public String toString() {
        return "T08{" +
            "F0801=" + F0801 +
            ", F0301=" + F0301 +
            ", F0101=" + F0101 +
            ", F0802=" + F0802 +
            ", F0830=" + F0830 +
            ", F0831=" + F0831 +
            ", F0832=" + F0832 +
            ", F0833=" + F0833 +
        "}";
    }
}
