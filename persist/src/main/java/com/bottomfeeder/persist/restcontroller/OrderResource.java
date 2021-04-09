package com.bottomfeeder.persist.restcontroller;

import com.bottomfeeder.persist.model.Order;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("classicmodelspersist")
public class OrderResource {
    private final JdbcTemplate jdbcTemplate;

    public OrderResource(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping(value = "order", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> get() {

        List<Order> orders = jdbcTemplate.query("SELECT * FROM Orders", (resultSet, i) -> {

            Order.Builder builder = new Order.Builder();
            return builder.setComments(resultSet.getNString("comments"))
                    .setOrder_date(resultSet.getDate("order_date"))
                    .setOrder_number(resultSet.getInt("order_number"))
                    .setRequired_date(resultSet.getDate("required_date"))
                    .setShipped_date(resultSet.getDate("shipped_date"))
                    .setStatus(resultSet.getNString("status"))
                    .setCustomer_number(resultSet.getInt("customer_number"))
                    .setVersion(resultSet.getInt("version")).createOrder();
        });
        return ResponseEntity.ok(orders);
    }


}
