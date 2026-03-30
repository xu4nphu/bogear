package com.bogear.controller;

import com.bogear.entity.Product;
import com.bogear.repository.CategoryRepository;
import com.bogear.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProductRepository pRepo; // Để lấy danh sách linh kiện

    @Autowired
    CategoryRepository cRepo; // Để lấy danh sách loại (VGA, CPU...)

    @RequestMapping("/bogear/home")
    public String index(Model model) {
        List<Product> list = pRepo.findAll();

        // Dòng này cực quan trọng để debug nè Phú
        System.out.println(">>> CHECK DB: Phú có " + list.size() + " sản phẩm.");

        model.addAttribute("items", list); // Kiểm tra xem chữ "items" có viết hoa chữ cái đầu không? (Phải viết thường hết)
        model.addAttribute("cates", cRepo.findAll());
        return "site/home";
    }
}