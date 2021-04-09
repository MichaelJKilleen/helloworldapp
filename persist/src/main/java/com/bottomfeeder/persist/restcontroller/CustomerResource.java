package com.bottomfeeder.persist.restcontroller;

import com.bottomfeeder.persist.model.Customer;
import com.bottomfeeder.persist.model.CustomerOrder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("classicmodelspersist")
public class CustomerResource {

    private final JdbcTemplate jdbcTemplate;

    public CustomerResource(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping(value = "customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> get() {

        List<Customer> customers = jdbcTemplate.query("SELECT * FROM Customers", (resultSet, i) -> {

            Customer.Builder builder = new Customer.Builder();
            return builder.setAddress_line1(resultSet.getString("address_line1"))
                    .setAddress_line2(resultSet.getString("address_line2"))
                    .setCity(resultSet.getString("city"))
                    .setCountry(resultSet.getString("country"))
                    .setContact_first_name(resultSet.getString("contact_first_name"))
                    .setContact_last_name(resultSet.getString("contact_last_name"))
                    .setCustomer_name(resultSet.getString("customer_name"))
                    .setCustomer_number(resultSet.getInt("customer_number"))
                    .setCredit_limit(resultSet.getBigDecimal("credit_limit"))
                    .setPhone(resultSet.getString("phone"))
                    .setPostal_code(resultSet.getString("postal_code"))
                    .setState(resultSet.getString("state"))
                    .setSales_rep_employee_number(resultSet.getInt("sales_rep_employee_number"))
                    .setVersion(resultSet.getInt("version"))
                    .setLast_modified_date(resultSet.getTimestamp("last_modified_date")).createCustomer();
        });
        return ResponseEntity.ok(customers);
    }

    @GetMapping(value = "customer/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerOrder>> getCustomerOrders() {

        List<CustomerOrder> customerOrders = jdbcTemplate.query("select * from customers c left join orders o on o.customer_number = c.customer_number",
                (resultSet, i) -> {

                    CustomerOrder.Builder builder = new CustomerOrder.Builder();
                    return builder.setContact_first_name(resultSet.getString("contact_first_name"))
                            .setContact_last_name(resultSet.getString("contact_last_name"))
                            .setCustomer_name(resultSet.getString("customer_name"))
                            .setComments(resultSet.getNString("comments"))
                            .setOrder_date(resultSet.getDate("order_date"))
                            .setOrder_number(resultSet.getInt("order_number"))
                            .setRequired_date(resultSet.getDate("required_date"))
                            .setShipped_date(resultSet.getDate("shipped_date"))
                            .setStatus(resultSet.getNString("status"))
                            .setCustomer_number(resultSet.getInt("customer_number")).createCustomerOrder();

                });
        return ResponseEntity.ok(customerOrders);
    }

//    @GetMapping("customer")
//    public String getx() {
//        try {
//            List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM products");
//            Map<String,Object> r = result.get(0);
//            Iterator iter = r.keySet().iterator();
//            while(iter.hasNext()) {
//                String s = iter.next().toString();
//                String tn = (r.get(s) != null ? r.get(s).getClass().getTypeName() : "Stringx");
//                System.out.println("private " + tn  + " " + s.toLowerCase() + ";");
//            }
//
//
//            System.out.println(("OK"));
//        }
//        catch(DataAccessException exception) {
//            System.out.println("Oh Crap!" + exception);
//        }
//        return "Thing";
//    }


}
