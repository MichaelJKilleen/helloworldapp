package com.bottomfeeder.services.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class OrderDetail {
    private Integer order_number;
    private String product_code;
    private String created_by;
    private Timestamp created_date;
    private String last_modified_by;
    private Timestamp last_modified_date;
    private Integer version;
    private Integer order_line_number;
    private BigDecimal price_each;
    private Integer quantity_ordered;
}
