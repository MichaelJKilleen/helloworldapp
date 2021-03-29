package com.bottomfeeder.persist.model;

import java.sql.Timestamp;
import java.util.Date;

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

}
