package com.bottomfeeder.persist.restcontroller;

import com.bottomfeeder.persist.model.BillionareDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("persist")
public class HelloPersistRestController {

    private final JdbcTemplate jdbcTemplate;

    public HelloPersistRestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @GetMapping("hello")
    public String get() {
        return "Hello Persist";
    }

    @GetMapping("billionares")
    public List<BillionareDTO> getBillionares() {

        return jdbcTemplate.query("SELECT * FROM BILLIONAIRES", new RowMapper<BillionareDTO>() {
            @Override
            public BillionareDTO mapRow(ResultSet resultSet, int i) throws SQLException {
                BillionareDTO userDto = new BillionareDTO();
                userDto.setId(resultSet.getInt("id"));
                userDto.setFirstName(resultSet.getString("first_name"));
                userDto.setLastName(resultSet.getString("last_name"));
                userDto.setCareer(resultSet.getString("career"));
                return userDto;
            }
        });
    }
}
