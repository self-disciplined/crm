package com.shsxt.crm.dao;

import com.shsxt.base.BaseMapper;
import com.shsxt.crm.query.CustomerQuery;
import com.shsxt.crm.vo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper extends BaseMapper<Customer,Integer>{
    Customer queryCustomerByName(String name);

    public List<Customer> queryLossCustomers();


    Integer updateCustomerStateByIds(List<Integer> lossCusIds);

    public List<Map<String,Object>> queryCustomerContributionByParams(CustomerQuery customerQuery);


    public List<Map<String,Object>> countCustomerMake();

}