package com.bogear.controller;

import com.bogear.entity.Product;
import com.bogear.repository.CategoryRepository;
import com.bogear.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired ProductRepository pRepo;
    @Autowired
    CategoryRepository cRepo;

    // Trang danh sách có lọc theo loại
    @RequestMapping("/product/list")
    public String list(Model model, @RequestParam("cid") Optional<String> cid) {
        if (cid.isPresent()) {
            // Nếu có bấm vào Sidebar (VGA, CPU...)
            model.addAttribute("items", pRepo.findByCategoryId(cid.get()));
        } else {
            // Nếu vào trang danh sách chung
            model.addAttribute("items", pRepo.findAll());
        }
        model.addAttribute("cates", cRepo.findAll());
        return "site/products/product-list";
    }

    // Trang xem chi tiết linh kiện
    @RequestMapping("/product/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Product p = pRepo.findById(id).get();
        model.addAttribute("p", p);
        model.addAttribute("cates", cRepo.findAll());
        return "site/products/product-detail";
    }
}