package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "stamping", schema = "safuri_schema", catalog = "")
public class StampingEntity {
    private int stampingId;
    private String processingType;
    private String blank;
    private int basicCost;
    private BigDecimal throughWage;
    private Timestamp updatedDate;

    @Id
    @Column(name = "stampingID")
    public int getStampingId() {
        return stampingId;
    }

    public void setStampingId(int stampingId) {
        this.stampingId = stampingId;
    }

    @Basic
    @Column(name = "processingType")
    public String getProcessingType() {
        return processingType;
    }

    public void setProcessingType(String processingType) {
        this.processingType = processingType;
    }

    @Basic
    @Column(name = "blank")
    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    @Basic
    @Column(name = "basicCost")
    public int getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(int basicCost) {
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

        StampingEntity that = (StampingEntity) o;

        if (stampingId != that.stampingId) return false;
        if (basicCost != that.basicCost) return false;
        if (processingType != null ? !processingType.equals(that.processingType) : that.processingType != null)
            return false;
        if (blank != null ? !blank.equals(that.blank) : that.blank != null) return false;
        if (throughWage != null ? !throughWage.equals(that.throughWage) : that.throughWage != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stampingId;
        result = 31 * result + (processingType != null ? processingType.hashCode() : 0);
        result = 31 * result + (blank != null ? blank.hashCode() : 0);
        result = 31 * result + basicCost;
        result = 31 * result + (throughWage != null ? throughWage.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
