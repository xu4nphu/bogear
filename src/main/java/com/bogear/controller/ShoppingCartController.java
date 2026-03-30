package com.bogear.controller;

import org.springframework.stereotype.Controller; // THÊM DÒNG NÀY
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // BẮT BUỘC PHẢI CÓ DÒNG NÀY
public class ShoppingCartController {

    @RequestMapping("/cart/view")
    public String view(Model model) {
        return "site/cart";
    }
}