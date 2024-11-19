package shop.all.com.example.shopall.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.all.com.example.shopall.Repository.OrderRepository;
import shop.all.com.example.shopall.Repository.UserRepository;
import shop.all.com.example.shopall.dto.OrderRequestDTO;
import shop.all.com.example.shopall.entities.OrderEntity;
import shop.all.com.example.shopall.entities.UserEntity;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository,UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + orderId));
    }

    public OrderEntity updateOrder(Long orderId, OrderEntity updatedOrder) {
        OrderEntity order = getOrderById(orderId);
        order.setItemId(updatedOrder.getItemId());
        order.setItemName(updatedOrder.getItemName());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    public OrderEntity createOrder(OrderRequestDTO orderRequest) {
        OrderEntity order = new OrderEntity();
        order.setItemId(orderRequest.getItemId());
        order.setItemName(orderRequest.getItemName());

        // Retrieve the UserEntity by ID and associate it with the order
        UserEntity userEntity = userRepository.findById(orderRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        order.setUserEntity(userEntity);

        return orderRepository.save(order);
    }


    public List<OrderEntity> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserEntityUserId(userId);
    }








}



















