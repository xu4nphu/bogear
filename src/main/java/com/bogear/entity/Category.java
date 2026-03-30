package com.bogear.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
    @Id
    String id; // Ví dụ: VGA, CPU, MAIN...
    String name; // Ví dụ: Card đồ họa, Vi xử lý...

    @JsonIgnore // Ngăn lỗi vòng lặp vô tận khi trả về JSON
    @OneToMany(mappedBy = "category")
    List<Product> products;
}