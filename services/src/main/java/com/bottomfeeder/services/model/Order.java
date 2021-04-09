package com.bottomfeeder.services.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class Order {
    private Integer order_number;
    private String created_by;
    private Timestamp created_date;
    private String last_modified_by;
    private Timestamp last_modified_date;
    private Integer version;
    private String comments;
    private Integer customer_number;
    private Date order_date;
    private Date required_date;
    private Date shipped_date;
    private String status;

    public Order(Integer order_number, Integer version, String comments, Integer customer_number, Date order_date, Date required_date, Date shipped_date, String status) {
        this.order_number = order_number;
        this.version = version;
        this.comments = comments;
        this.customer_number = customer_number;
        this.order_date = order_date;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
        this.status = status;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    protected void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    public String getCreated_by() {
        return created_by;
    }

    protected void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    protected void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    protected void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }

    public Timestamp getLast_modified_date() {
        return last_modified_date;
    }

    protected void setLast_modified_date(Timestamp last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public Integer getVersion() {
        return version;
    }

    protected void setVersion(Integer version) {
        this.version = version;
    }

    public String getComments() {
        return comments;
    }

    protected void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getCustomer_number() {
        return customer_number;
    }

    protected void setCustomer_number(Integer customer_number) {
        this.customer_number = customer_number;
    }

    public Date getOrder_date() {
        return order_date;
    }

    protected void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getRequired_date() {
        return required_date;
    }

    protected void setRequired_date(Date required_date) {
        this.required_date = required_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    protected void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return order_number.equals(order.order_number) && version.equals(order.version) && comments.equals(order.comments) && customer_number.equals(order.customer_number) && order_date.equals(order.order_date) && required_date.equals(order.required_date) && shipped_date.equals(order.shipped_date) && status.equals(order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_number, version, comments, customer_number, order_date, required_date, shipped_date, status);
    }


    @Override
    public String toString() {
        return "{\"Order\":{"
                + "\"order_number\":\"" + order_number + "\""
                + ", \"created_by\":\"" + created_by + "\""
                + ", \"created_date\":" + created_date
                + ", \"last_modified_by\":\"" + last_modified_by + "\""
                + ", \"last_modified_date\":" + last_modified_date
                + ", \"version\":\"" + version + "\""
                + ", \"comments\":\"" + comments + "\""
                + ", \"customer_number\":\"" + customer_number + "\""
                + ", \"order_date\":" + order_date
                + ", \"required_date\":" + required_date
                + ", \"shipped_date\":" + shipped_date
                + ", \"status\":\"" + status + "\""
                + "}}";
    }

    public static class Builder {

        private Integer order_number;
        private Integer version;
        private String comments;
        private Integer customer_number;
        private Date order_date;
        private Date required_date;
        private Date shipped_date;
        private String status;

        public Builder setOrder_number(Integer order_number) {
            this.order_number = order_number;
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setCustomer_number(Integer customer_number) {
            this.customer_number = customer_number;
            return this;
        }

        public Builder setOrder_date(Date order_date) {
            this.order_date = order_date;
            return this;
        }

        public Builder setRequired_date(Date required_date) {
            this.required_date = required_date;
            return this;
        }

        public Builder setShipped_date(Date shipped_date) {
            this.shipped_date = shipped_date;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Order createOrder() {
            return new Order(order_number, version, comments, customer_number, order_date, required_date, shipped_date, status);
        }
    }
}
