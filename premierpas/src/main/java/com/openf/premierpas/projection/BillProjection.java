package com.openf.premierpas.projection;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.openf.premierpas.model.ProductItem;
import com.openf.premierpas.model.Bill;

@Projection(name="fullBill",types=Bill.class)

public interface BillProjection {
 public Long getId();
 public Date getBillingDate();
 public Long customerId();
 public Collection<ProductItem> getProductItems();
}
