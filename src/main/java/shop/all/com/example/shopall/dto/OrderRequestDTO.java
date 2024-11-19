package shop.all.com.example.shopall.dto;

public class OrderRequestDTO {
    private Long itemId;
    private Long userId;
    private String itemName;

    // Constructors, getters, and setters
    public OrderRequestDTO() {}

    public OrderRequestDTO(Long itemId, Long userId, String itemName) {
        this.itemId = itemId;
        this.userId = userId;
        this.itemName = itemName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
