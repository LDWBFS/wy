package com.example.wy.common.entity;


import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Casebook  {

    private static final long serialVersionUID = 1L;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 年龄
     */
    private String birthplace;

    /**
     * 入院时间
     */
    private String admission;

    /**
     * 记录时间
     */
    private String writetime;

    /**
     * 病史陈述者
     */
    private String representor;

    /**
     * 电话
     */
    private String phone;

    /**
     * 科室
     */
    private String office;

    /**
     * 主诉
     */
    private String mainsuit;

    /**
     * 现病史
     */
    private String PHI;

    /**
     * 既往史
     */

    private String PH;

    /**
     * 初诊
     */
    private String firsttime;

    /**
     * 医院
     */
    private String hospital;


}
