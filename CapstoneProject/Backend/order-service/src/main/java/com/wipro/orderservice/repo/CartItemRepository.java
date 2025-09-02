package com.wipro.orderservice.repo;

import com.wipro.orderservice.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
  List<CartItem> findByUserId(Long userId);
  void deleteByUserId(Long userId);
}
