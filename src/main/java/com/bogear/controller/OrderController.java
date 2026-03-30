package com.bogear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    // 1. Trang Thanh toán (Checkout)
    @RequestMapping("/order/checkout")
    public String checkout() {
        return "site/order/checkout"; // Trỏ đến file HTML vừa làm
    }

    // 2. Trang Danh sách đơn hàng đã mua
    @RequestMapping("/order/list")
    public String list(Model model) {
        // Sau này Phú sẽ dùng OrderService.findByUsername() để lấy dữ liệu từ DB
        return "site/order/list";
    }

    // 3. Xem chi tiết 1 đơn hàng cụ thể
    @RequestMapping("/order/detail/{id}")
    public String detail() {
        return "site/order/detail";
    }
}