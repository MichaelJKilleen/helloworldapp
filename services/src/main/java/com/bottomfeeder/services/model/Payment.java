package com.bottomfeeder.services.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Payment {
    private String check_number;
    private Integer customer_number;
    private String created_by;
    private Timestamp created_date;
    private String last_modified_by;
    private Timestamp last_modified_date;
    private Integer version;
    private BigDecimal amount;
    private Date payment_date;
}
