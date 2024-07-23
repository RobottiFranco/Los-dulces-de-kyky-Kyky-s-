package com.pasteleria.pasteleria_app.service;

import java.util.List;

import com.pasteleria.pasteleria_app.model.ProductType;

public interface ProductTypeService {

    List<ProductType> getProductType();

    ProductType getProductTypeByID(long id);

}
