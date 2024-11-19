package shop.all.com.example.shopall.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.all.com.example.shopall.entities.OrderEntity;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    OrderEntity findByItemId(Long itemId); // Finds an Order by itemId
    List<OrderEntity> findByUserEntityUserId(Long userId);
}


