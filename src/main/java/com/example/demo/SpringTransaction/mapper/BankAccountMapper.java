package com.example.demo.SpringTransaction.mapper;

import com.example.demo.SpringTransaction.model.BankAccountInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/*Một lớp được sử dụng để ánh xạ (mapping) tương ứng 1-1
giữa 1 cột trong câu truy vấn và 1 trường (field) trong lớp model được gọi là lớp mapper.
 BankAccountMapper là một lớp như vậy.*/
public class BankAccountMapper implements RowMapper<BankAccountInfo> {
    public static final String BASE_SQL  = "Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba ";
    @Override
    public BankAccountInfo mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       Long id = resultSet.getLong("Id");
       String fullName = resultSet.getString("Full_Name");
       double balance = resultSet.getDouble("Balance");

       return new BankAccountInfo(id,fullName,balance);
    }
}
