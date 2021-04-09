package com.bottomfeeder.persist.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class CustomerOrder {
    private Integer customer_number;
    private java.sql.Timestamp last_modified_date;
    private String city;
    private String postal_code;
    private String state;
    private String contact_first_name;
    private String contact_last_name;
    private String customer_name;
    private Integer sales_rep_employee_number;
    private Integer order_number;
    private String comments;
    private Date order_date;
    private Date required_date;
    private Date shipped_date;
    private String status;

    private CustomerOrder(Integer customer_number, Timestamp last_modified_date, String city, String postal_code, String state, String contact_first_name, String contact_last_name, String customer_name, Integer sales_rep_employee_number, Integer order_number, String comments, Date order_date, Date required_date, Date shipped_date, String status) {
        this.customer_number = customer_number;
        this.last_modified_date = last_modified_date;
        this.city = city;
        this.postal_code = postal_code;
        this.state = state;
        this.contact_first_name = contact_first_name;
        this.contact_last_name = contact_last_name;
        this.customer_name = customer_name;
        this.sales_rep_employee_number = sales_rep_employee_number;
        this.order_number = order_number;
        this.comments = comments;
        this.order_date = order_date;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
        this.status = status;
    }

    public Integer getCustomer_number() {
        return customer_number;
    }

    protected void setCustomer_number(Integer customer_number) {
        this.customer_number = customer_number;
    }

    public Timestamp getLast_modified_date() {
        return last_modified_date;
    }

    protected void setLast_modified_date(Timestamp last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    protected void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getState() {
        return state;
    }

    protected void setState(String state) {
        this.state = state;
    }

    public String getContact_first_name() {
        return contact_first_name;
    }

    protected void setContact_first_name(String contact_first_name) {
        this.contact_first_name = contact_first_name;
    }

    public String getContact_last_name() {
        return contact_last_name;
    }

    protected void setContact_last_name(String contact_last_name) {
        this.contact_last_name = contact_last_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    protected void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getSales_rep_employee_number() {
        return sales_rep_employee_number;
    }

    protected void setSales_rep_employee_number(Integer sales_rep_employee_number) {
        this.sales_rep_employee_number = sales_rep_employee_number;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    protected void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    public String getComments() {
        return comments;
    }

    protected void setComments(String comments) {
        this.comments = comments;
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
        if (!(o instanceof CustomerOrder)) return false;
        CustomerOrder that = (CustomerOrder) o;
        return Objects.equals(customer_number, that.customer_number) && Objects.equals(last_modified_date, that.last_modified_date) && Objects.equals(city, that.city) && Objects.equals(postal_code, that.postal_code) && Objects.equals(state, that.state) && Objects.equals(contact_first_name, that.contact_first_name) && Objects.equals(contact_last_name, that.contact_last_name) && Objects.equals(customer_name, that.customer_name) && Objects.equals(sales_rep_employee_number, that.sales_rep_employee_number) && Objects.equals(order_number, that.order_number) && Objects.equals(comments, that.comments) && Objects.equals(order_date, that.order_date) && Objects.equals(required_date, that.required_date) && Objects.equals(shipped_date, that.shipped_date) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_number, last_modified_date, city, postal_code, state, contact_first_name, contact_last_name, customer_name, sales_rep_employee_number, order_number, comments, order_date, required_date, shipped_date, status);
    }


    @Override
    public String toString() {
        return "{\"CustomerOrder\":{"
                + "\"customer_number\":\"" + customer_number + "\""
                + ", \"last_modified_date\":" + last_modified_date
                + ", \"city\":\"" + city + "\""
                + ", \"postal_code\":\"" + postal_code + "\""
                + ", \"state\":\"" + state + "\""
                + ", \"contact_first_name\":\"" + contact_first_name + "\""
                + ", \"contact_last_name\":\"" + contact_last_name + "\""
                + ", \"customer_name\":\"" + customer_name + "\""
                + ", \"sales_rep_employee_number\":\"" + sales_rep_employee_number + "\""
                + ", \"order_number\":\"" + order_number + "\""
                + ", \"comments\":\"" + comments + "\""
                + ", \"order_date\":" + order_date
                + ", \"required_date\":" + required_date
                + ", \"shipped_date\":" + shipped_date
                + ", \"status\":\"" + status + "\""
                + "}}";
    }

    public static class Builder {

        private Integer customer_number;
        private Timestamp last_modified_date;
        private String city;
        private String postal_code;
        private String state;
        private String contact_first_name;
        private String contact_last_name;
        private String customer_name;
        private Integer sales_rep_employee_number;
        private Integer order_number;
        private String comments;
        private Date order_date;
        private Date required_date;
        private Date shipped_date;
        private String status;

        public Builder setCustomer_number(Integer customer_number) {
            this.customer_number = customer_number;
            return this;
        }

        public Builder setLast_modified_date(Timestamp last_modified_date) {
            this.last_modified_date = last_modified_date;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setContact_first_name(String contact_first_name) {
            this.contact_first_name = contact_first_name;
            return this;
        }

        public Builder setContact_last_name(String contact_last_name) {
            this.contact_last_name = contact_last_name;
            return this;
        }

        public Builder setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
            return this;
        }

        public Builder setSales_rep_employee_number(Integer sales_rep_employee_number) {
            this.sales_rep_employee_number = sales_rep_employee_number;
            return this;
        }

        public Builder setOrder_number(Integer order_number) {
            this.order_number = order_number;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
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

        public CustomerOrder createCustomerOrder() {
            return new CustomerOrder(customer_number, last_modified_date, city, postal_code, state, contact_first_name, contact_last_name, customer_name, sales_rep_employee_number, order_number, comments, order_date, required_date, shipped_date, status);
        }
    }
}
