package com.bottomfeeder.persist.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product {
    private String product_code;
    private String created_by;
    private Timestamp created_date;
    private String last_modified_by;
    private Timestamp last_modified_date;
    private Integer version;
    private BigDecimal buy_price;
    private BigDecimal msrp;
    private String product_description;
    private String product_name;
    private String product_scale;
    private String product_vendor;
    private Integer quantity_in_stock;
    private String product_line;

}
