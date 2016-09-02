package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "windowmargin", schema = "safuri_schema", catalog = "")
public class WindowmarginEntity {
    private int windowMarginId;
    private String windowMarginSize;
    private String windowMarginLot;
    private String windowMarginMaterial;
    private Integer windowMarginPrepationFee;
    private BigDecimal windowMarginThroughWage;
    private Timestamp updatedDate;

    @Id
    @Column(name = "windowMarginID")
    public int getWindowMarginId() {
        return windowMarginId;
    }

    public void setWindowMarginId(int windowMarginId) {
        this.windowMarginId = windowMarginId;
    }

    @Basic
    @Column(name = "windowMarginSize")
    public String getWindowMarginSize() {
        return windowMarginSize;
    }

    public void setWindowMarginSize(String windowMarginSize) {
        this.windowMarginSize = windowMarginSize;
    }

    @Basic
    @Column(name = "windowMarginLot")
    public String getWindowMarginLot() {
        return windowMarginLot;
    }

    public void setWindowMarginLot(String windowMarginLot) {
        this.windowMarginLot = windowMarginLot;
    }

    @Basic
    @Column(name = "windowMarginMaterial")
    public String getWindowMarginMaterial() {
        return windowMarginMaterial;
    }

    public void setWindowMarginMaterial(String windowMarginMaterial) {
        this.windowMarginMaterial = windowMarginMaterial;
    }

    @Basic
    @Column(name = "windowMarginPrepationFee")
    public Integer getWindowMarginPrepationFee() {
        return windowMarginPrepationFee;
    }

    public void setWindowMarginPrepationFee(Integer windowMarginPrepationFee) {
        this.windowMarginPrepationFee = windowMarginPrepationFee;
    }

    @Basic
    @Column(name = "windowMarginThroughWage")
    public BigDecimal getWindowMarginThroughWage() {
        return windowMarginThroughWage;
    }

    public void setWindowMarginThroughWage(BigDecimal windowMarginThroughWage) {
        this.windowMarginThroughWage = windowMarginThroughWage;
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

        WindowmarginEntity that = (WindowmarginEntity) o;

        if (windowMarginId != that.windowMarginId) return false;
        if (windowMarginSize != null ? !windowMarginSize.equals(that.windowMarginSize) : that.windowMarginSize != null)
            return false;
        if (windowMarginLot != null ? !windowMarginLot.equals(that.windowMarginLot) : that.windowMarginLot != null)
            return false;
        if (windowMarginMaterial != null ? !windowMarginMaterial.equals(that.windowMarginMaterial) : that.windowMarginMaterial != null)
            return false;
        if (windowMarginPrepationFee != null ? !windowMarginPrepationFee.equals(that.windowMarginPrepationFee) : that.windowMarginPrepationFee != null)
            return false;
        if (windowMarginThroughWage != null ? !windowMarginThroughWage.equals(that.windowMarginThroughWage) : that.windowMarginThroughWage != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = windowMarginId;
        result = 31 * result + (windowMarginSize != null ? windowMarginSize.hashCode() : 0);
        result = 31 * result + (windowMarginLot != null ? windowMarginLot.hashCode() : 0);
        result = 31 * result + (windowMarginMaterial != null ? windowMarginMaterial.hashCode() : 0);
        result = 31 * result + (windowMarginPrepationFee != null ? windowMarginPrepationFee.hashCode() : 0);
        result = 31 * result + (windowMarginThroughWage != null ? windowMarginThroughWage.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
