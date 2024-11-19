package shop.all.com.example.shopall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.all.com.example.shopall.Service.OrderService;
import shop.all.com.example.shopall.dto.OrderRequestDTO;
import shop.all.com.example.shopall.entities.OrderEntity;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Get all orders
    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAllOrders() {
        List<OrderEntity> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderRequestDTO orderRequest) {
        OrderEntity createdOrder = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(createdOrder);
    }

    // Get an order by ID
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderEntity> getOrderById(@PathVariable Long orderId) {
        OrderEntity order = orderService.getOrderById(orderId);
        return ResponseEntity.ok(order);
    }

    // Update an order by ID
    @PutMapping("/{orderId}")
    public ResponseEntity<OrderEntity> updateOrder(@PathVariable Long orderId, @RequestBody OrderEntity updatedOrder) {
        OrderEntity order = orderService.updateOrder(orderId, updatedOrder);
        return ResponseEntity.ok(order);
    }

    // Delete an order by ID
    @DeleteMapping("/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
        return ResponseEntity.ok("Order deleted successfully.");
    }

    @GetMapping("/user/{userId}")
    public List<OrderEntity> getOrdersByUserId(@PathVariable Long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
