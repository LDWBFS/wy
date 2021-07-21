package com.example.wy.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FS
 * @since 2021-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Other implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 3.6-6.1
     */
    private Double a;

    /**
     * 3.35-6.45
     */
    private Double b;

    /**
     * 0.48-1.88
     */
    private Double c;

    /**
     * 0.83-1.96
     */
    private Double d;

    /**
     * 0-3.36
     */
    private Double e;

    /**
     * 0.25-5
     */
    private Double f;

    /**
     * 0-25
     */
    private Double g;

    /**
     * 3.42-17.1
     */
    private Double h;

    /**
     * 0-6.8
     */
    private Double i;

    /**
     * 3.42-17.1
     */
    private Double j;

    /**
     * 5-40
     */
    private Double k;

    /**
     * 5-40
     */
    private Double l;

    /**
     * 0.7-3.5
     */
    private Double m;

    /**
     * 60-80
     */
    private Double n;

    /**
     * 35-55
     */
    private Double o;

    /**
     * 1.5-2.5
     */
    private Double p;

    /**
     * 42-120
     */
    private Double q;

    /**
     * 8-58
     */
    private Double r;

    /**
     * 25-35
     */
    private Double s;

    /**
     * 0-4
     */
    private Double t;

    /**
     * 60-100
     */
    private Integer u;

    private String v;

    private String w;

    private String x;

    private String y;

    private String phone;

    private String z;


    @Override
    public String toString() {
        return "Other{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", i=" + i +
                ", j=" + j +
                ", k=" + k +
                ", l=" + l +
                ", m=" + m +
                ", n=" + n +
                ", o=" + o +
                ", p=" + p +
                ", q=" + q +
                ", r=" + r +
                ", s=" + s +
                ", t=" + t +
                ", u=" + u +
                ", v='" + v + '\'' +
                ", w='" + w + '\'' +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", phone='" + phone + '\'' +
                ", z='" + z + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Double getF() {
        return f;
    }

    public void setF(Double f) {
        this.f = f;
    }

    public Double getG() {
        return g;
    }

    public void setG(Double g) {
        this.g = g;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public Double getJ() {
        return j;
    }

    public void setJ(Double j) {
        this.j = j;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public Double getM() {
        return m;
    }

    public void setM(Double m) {
        this.m = m;
    }

    public Double getN() {
        return n;
    }

    public void setN(Double n) {
        this.n = n;
    }

    public Double getO() {
        return o;
    }

    public void setO(Double o) {
        this.o = o;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Double getQ() {
        return q;
    }

    public void setQ(Double q) {
        this.q = q;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getS() {
        return s;
    }

    public void setS(Double s) {
        this.s = s;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}
