package com.bottomfeeder.persist.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Customer {
    private Integer customer_number;
    private String created_by;
    private Timestamp created_date;
    private String last_modified_by;
    private java.sql.Timestamp last_modified_date;
    private Integer version;
    private String address_line1;
    private String address_line2;
    private String city;
    private String country;
    private String postal_code;
    private String state;
    private String contact_first_name;
    private String contact_last_name;
    private BigDecimal credit_limit;
    private String customer_name;
    private String phone;
    private Integer sales_rep_employee_number;


    private Customer(Integer customer_number, String created_by, Timestamp created_date, String last_modified_by, Timestamp last_modified_date, Integer version, String address_line1, String address_line2, String city, String country, String postal_code, String state, String contact_first_name, String contact_last_name, BigDecimal credit_limit, String customer_name, String phone, Integer sales_rep_employee_number) {
        this.customer_number = customer_number;
        this.created_by = created_by;
        this.created_date = created_date;
        this.last_modified_by = last_modified_by;
        this.last_modified_date = last_modified_date;
        this.version = version;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.country = country;
        this.postal_code = postal_code;
        this.state = state;
        this.contact_first_name = contact_first_name;
        this.contact_last_name = contact_last_name;
        this.credit_limit = credit_limit;
        this.customer_name = customer_name;
        this.phone = phone;
        this.sales_rep_employee_number = sales_rep_employee_number;
    }

    public Integer getCustomer_number() {
        return customer_number;
    }

    protected void setCustomer_number(Integer customer_number) {
        this.customer_number = customer_number;
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

    public String getAddress_line1() {
        return address_line1;
    }

    protected void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    protected void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    protected void setCountry(String country) {
        this.country = country;
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

    public BigDecimal getCredit_limit() {
        return credit_limit;
    }

    protected void setCredit_limit(BigDecimal credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    protected void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSales_rep_employee_number() {
        return sales_rep_employee_number;
    }

    protected void setSales_rep_employee_number(Integer sales_rep_employee_number) {
        this.sales_rep_employee_number = sales_rep_employee_number;
    }

    public static class Builder {

        private Integer customer_number;
        private String created_by;
        private Timestamp created_date;
        private String last_modified_by;
        private Timestamp last_modified_date;
        private Integer version;
        private String address_line1;
        private String address_line2;
        private String city;
        private String country;
        private String postal_code;
        private String state;
        private String contact_first_name;
        private String contact_last_name;
        private BigDecimal credit_limit;
        private String customer_name;
        private String phone;
        private Integer sales_rep_employee_number;

        public Builder setCustomer_number(Integer customer_number) {
            this.customer_number = customer_number;
            return this;
        }

        public Builder setCreated_by(String created_by) {
            this.created_by = created_by;
            return this;
        }

        public Builder setCreated_date(Timestamp created_date) {
            this.created_date = created_date;
            return this;
        }

        public Builder setLast_modified_by(String last_modified_by) {
            this.last_modified_by = last_modified_by;
            return this;
        }

        public Builder setLast_modified_date(Timestamp last_modified_date) {
            this.last_modified_date = last_modified_date;
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = version;
            return this;
        }

        public Builder setAddress_line1(String address_line1) {
            this.address_line1 = address_line1;
            return this;
        }

        public Builder setAddress_line2(String address_line2) {
            this.address_line2 = address_line2;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
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

        public Builder setCredit_limit(BigDecimal credit_limit) {
            this.credit_limit = credit_limit;
            return this;
        }

        public Builder setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setSales_rep_employee_number(Integer sales_rep_employee_number) {
            this.sales_rep_employee_number = sales_rep_employee_number;
            return this;
        }

        public Customer createCustomer() {
            return new Customer(customer_number, created_by, created_date, last_modified_by, last_modified_date, version, address_line1, address_line2, city, country, postal_code, state, contact_first_name, contact_last_name, credit_limit, customer_name, phone, sales_rep_employee_number);
        }
    }

}
