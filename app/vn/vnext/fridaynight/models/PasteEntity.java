package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "paste", schema = "safuri_schema", catalog = "")
public class PasteEntity {
    private int pasteId;
    private String paperType;
    private String form;
    private int blankSize;
    private int basicCost;
    private BigDecimal throughWage;
    private Timestamp updatedDate;

    @Id
    @Column(name = "pasteID")
    public int getPasteId() {
        return pasteId;
    }

    public void setPasteId(int pasteId) {
        this.pasteId = pasteId;
    }

    @Basic
    @Column(name = "paperType")
    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    @Basic
    @Column(name = "form")
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Basic
    @Column(name = "blankSize")
    public int getBlankSize() {
        return blankSize;
    }

    public void setBlankSize(int blankSize) {
        this.blankSize = blankSize;
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

        PasteEntity that = (PasteEntity) o;

        if (pasteId != that.pasteId) return false;
        if (blankSize != that.blankSize) return false;
        if (basicCost != that.basicCost) return false;
        if (paperType != null ? !paperType.equals(that.paperType) : that.paperType != null) return false;
        if (form != null ? !form.equals(that.form) : that.form != null) return false;
        if (throughWage != null ? !throughWage.equals(that.throughWage) : that.throughWage != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pasteId;
        result = 31 * result + (paperType != null ? paperType.hashCode() : 0);
        result = 31 * result + (form != null ? form.hashCode() : 0);
        result = 31 * result + blankSize;
        result = 31 * result + basicCost;
        result = 31 * result + (throughWage != null ? throughWage.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
