package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "surfacetreatment", schema = "safuri_schema", catalog = "")
public class SurfacetreatmentEntity {
    private int surfaceTreatmentId;
    private String varnishType;
    private String size;
    private String throughNumber;
    private Integer basicCost;
    private BigDecimal throughWage;
    private Timestamp updatedDate;

    @Id
    @Column(name = "surfaceTreatmentID")
    public int getSurfaceTreatmentId() {
        return surfaceTreatmentId;
    }

    public void setSurfaceTreatmentId(int surfaceTreatmentId) {
        this.surfaceTreatmentId = surfaceTreatmentId;
    }

    @Basic
    @Column(name = "varnishType")
    public String getVarnishType() {
        return varnishType;
    }

    public void setVarnishType(String varnishType) {
        this.varnishType = varnishType;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "throughNumber")
    public String getThroughNumber() {
        return throughNumber;
    }

    public void setThroughNumber(String throughNumber) {
        this.throughNumber = throughNumber;
    }

    @Basic
    @Column(name = "basicCost")
    public Integer getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(Integer basicCost) {
        this.basicCost = basicCost;
    }

    @Basic
    @Column(name = "throughWage")
    public BigDecimal getThroughWage() {
        return throughWage;
    }

    public void setThroughWage(BigDecimal throughWage) {
        this.throughWage = throughWage;
    }

    @Basic
    @Column(name = "updatedDate")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurfacetreatmentEntity that = (SurfacetreatmentEntity) o;

        if (surfaceTreatmentId != that.surfaceTreatmentId) return false;
        if (varnishType != null ? !varnishType.equals(that.varnishType) : that.varnishType != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (throughNumber != null ? !throughNumber.equals(that.throughNumber) : that.throughNumber != null)
            return false;
        if (basicCost != null ? !basicCost.equals(that.basicCost) : that.basicCost != null) return false;
        if (throughWage != null ? !throughWage.equals(that.throughWage) : that.throughWage != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = surfaceTreatmentId;
        result = 31 * result + (varnishType != null ? varnishType.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (throughNumber != null ? throughNumber.hashCode() : 0);
        result = 31 * result + (basicCost != null ? basicCost.hashCode() : 0);
        result = 31 * result + (throughWage != null ? throughWage.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
