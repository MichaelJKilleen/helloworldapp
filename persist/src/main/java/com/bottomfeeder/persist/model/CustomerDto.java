package com.bottomfeeder.persist.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CustomerDto {
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
}
