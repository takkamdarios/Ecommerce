package com.ecommerce.ecommerce.dto;

import com.ecommerce.ecommerce.entity.Payment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {


    private BigDecimal totalPrice;
    private List<OrderItemRequest> items;

    private Payment paymentInfo;

}
