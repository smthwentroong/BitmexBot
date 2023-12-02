package kirill.kopienko.bitmexbot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Symbol symbol;
    private boolean isBuy;
    private double orderQty;
    private String orderId;
    private Double price;
    private Double stopPx;
    private boolean isWorking;
    private OrderType orderType;
    private OrderStatus orderStatus;
}
