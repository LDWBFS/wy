package com.example.wy.common.entity;

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
public class Prescription {

    private static final long serialVersionUID = 1L;

    /**
     * 经方名
     */
    private String prescription;

    /**
     * 概述
     */
    private String summarize;

    /**
     * 经典配方
     */
    private String recipe;

    /**
     * 常用剂量
     */
    private String dosage;

    /**
     * 煎服法
     */
    private String decoction;

    /**
     * 经典方证
     */
    private String classic;

    /**
     * 体质要求
     */
    private String demands;

    /**
     * 适应疾病
     */
    private String disease;

    /**
     * 加减法
     */
    private String addition;

    /**
     * 药理研究
     */
    private String pharmacology;

    /**
     * 注意事项
     */
    private String announce;

    /**
     * 所属类别
     */
    private String family;
    private int count;

    @Override
    public String toString() {
        return "Prescription{" +
                "prescription='" + prescription + '\'' +
                ", summarize='" + summarize + '\'' +
                ", recipe='" + recipe + '\'' +
                ", dosage='" + dosage + '\'' +
                ", decoction='" + decoction + '\'' +
                ", classic='" + classic + '\'' +
                ", demands='" + demands + '\'' +
                ", disease='" + disease + '\'' +
                ", addition='" + addition + '\'' +
                ", pharmacology='" + pharmacology + '\'' +
                ", announce='" + announce + '\'' +
                ", family='" + family + '\'' +
                ", count=" + count +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDecoction() {
        return decoction;
    }

    public void setDecoction(String decoction) {
        this.decoction = decoction;
    }

    public String getClassic() {
        return classic;
    }

    public void setClassic(String classic) {
        this.classic = classic;
    }

    public String getDemands() {
        return demands;
    }

    public void setDemands(String demands) {
        this.demands = demands;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getPharmacology() {
        return pharmacology;
    }

    public void setPharmacology(String pharmacology) {
        this.pharmacology = pharmacology;
    }

    public String getAnnounce() {
        return announce;
    }

    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
