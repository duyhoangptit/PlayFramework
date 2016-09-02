package vn.vnext.fridaynight.models;

import javax.persistence.*;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "deal", schema = "safuri_schema", catalog = "")
public class DealEntity {
    private int dealId;
    private int userUserId;
    private Integer customerCustomerId;
    private int type;
    private Integer totalCost;

    @Id
    @Column(name = "dealID")
    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    @Basic
    @Column(name = "User_userID")
    public int getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(int userUserId) {
        this.userUserId = userUserId;
    }

    @Basic
    @Column(name = "Customer_customerID")
    public Integer getCustomerCustomerId() {
        return customerCustomerId;
    }

    public void setCustomerCustomerId(Integer customerCustomerId) {
        this.customerCustomerId = customerCustomerId;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "totalCost")
    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealEntity that = (DealEntity) o;

        if (dealId != that.dealId) return false;
        if (userUserId != that.userUserId) return false;
        if (type != that.type) return false;
        if (customerCustomerId != null ? !customerCustomerId.equals(that.customerCustomerId) : that.customerCustomerId != null)
            return false;
        if (totalCost != null ? !totalCost.equals(that.totalCost) : that.totalCost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dealId;
        result = 31 * result + userUserId;
        result = 31 * result + (customerCustomerId != null ? customerCustomerId.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (totalCost != null ? totalCost.hashCode() : 0);
        return result;
    }
}
