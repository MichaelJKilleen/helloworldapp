package com.bottomfeeder.persist.restcontroller;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("classicmodelspersist")
public class CustomerResource {

    private final JdbcTemplate jdbcTemplate;

    public CustomerResource(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("customer")
    public String get() {
        try {
            List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM products");
            Map<String,Object> r = result.get(0);
            Iterator iter = r.keySet().iterator();
            while(iter.hasNext()) {
                String s = iter.next().toString();
                String tn = (r.get(s) != null ? r.get(s).getClass().getTypeName() : "Stringx");
                System.out.println("private " + tn  + " " + s.toLowerCase() + ";");
            }


            System.out.println(("OK"));
        }
        catch(DataAccessException exception) {
            System.out.println("Oh Crap!" + exception);
        }
        return "Thing";
    }


}
