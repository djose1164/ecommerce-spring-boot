package com.djose1164.ecommerce.controllers;

import static org.springframework.http.ResponseEntity.ok;

import com.djose1164.ecommerce.api.CartApi;
import com.djose1164.ecommerce.api.model.Cart;
import com.djose1164.ecommerce.api.model.Item;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class CartsController implements CartApi {
    private static final Logger log = LoggerFactory.getLogger(CartsController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
        log.info("Request for customer ID: {}\nItem: {}", customerId, item);
        return ok(Collections.EMPTY_LIST);
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        throw new RuntimeException("Manual Exception thrown");
    }

    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, Item item) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCart(String customerId) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) throws Exception {
        return null;
    }
}
