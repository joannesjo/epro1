package com.example.epro.Repository;

import com.example.epro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        private static final String SQL = "select * from user where id=?";

        public List<User> isData() {

            List<User> customers = new ArrayList<User>();
            List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL,1);

            for (Map<String, Object> row : rows)
            {
                User customer = new User();
                customer.setId((int)row.get("id"));
                customer.setName((String)row.get("name"));
                customer.setAddress((String)row.get("address"));
                customer.setEmail((String)row.get("address"));
                customers.add(customer);
            }

            return customers;
        }

}
