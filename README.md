# 💻 Bo Gear - Website Kinh Doanh Linh Kiện PC

> **Assignment môn Lập trình Java 6 (Spring Boot REST API) - FPT Polytechnic**

![Java](https://img.shields.io/badge/JAVA-17+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/SPRING_BOOT-3.X-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/POSTGRESQL-NEON_CLOUD-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![VueJS](https://img.shields.io/badge/VUE.JS-3.X-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white)
![Bootstrap](https://img.shields.io/badge/BOOTSTRAP-5-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)

## 📖 Giới thiệu (Overview)

**Bo Gear** là dự án xây dựng website thương mại điện tử chuyên kinh doanh các dòng linh kiện máy tính, PC Gaming và Gaming Gear.
Khác với kiến trúc MVC truyền thống, dự án áp dụng mô hình **Hybrid (Lai)** sát thực tế doanh nghiệp:
* Tối ưu SEO cho trang chủ và trang chi tiết sản phẩm bằng **Spring MVC + Thymeleaf**.
* Tối ưu trải nghiệm tương tác tốc độ cao (Giỏ hàng, Quản trị Admin) bằng **RESTful Web API + VueJS + Axios**.

## 👤 Tác giả (Author)

* **Võ Xuân Phú (PS45558)** - *Sinh viên chuyên ngành Software Development*
    * Đảm nhiệm 100% vai trò Fullstack Developer:
        * Thiết kế & Triển khai Database (Neon PostgreSQL).
        * Phát triển Backend RESTful API & cấu hình Spring Security.
        * Xây dựng giao diện Frontend (Thymeleaf & VueJS 3).
    * **Email:** phuvo416@gmail.com
    * **GitHub:** [@xu4nphu](https://github.com/xu4nphu)

## 🛠️ Công nghệ sử dụng (Tech Stack)

* **Backend:** Java 17, Spring Boot (Spring Web REST API, Spring Data JPA, Spring Security).
* **Frontend (SEO - Client):** HTML5, CSS3, Bootstrap 5, Thymeleaf Engine.
* **Frontend (SPA - Admin/Cart):** VueJS 3, Axios (Gọi API).
* **Database:** PostgreSQL (Triển khai Cloud 24/7 trên Neon DB).
* **Tools:** IntelliJ IDEA, Maven, Git/GitHub, Postman (Test API).

## ✨ Chức năng chính (Features)

### 🛒 Dành cho Khách hàng (User Site)
* **Trang chủ & Sản phẩm:** Liệt kê linh kiện (CPU, VGA, RAM...), xem chi tiết thông số (Render bằng Thymeleaf tối ưu SEO).
* **Giỏ hàng (VueJS):** Thêm, sửa, xóa linh kiện trong giỏ mượt mà không cần load lại trang.
* **Tài khoản:** Đăng ký, Đăng nhập, Cập nhật thông tin cá nhân.
* **Đơn hàng:** Đặt hàng, theo dõi trạng thái đơn hàng cá nhân.

### 🛡️ Dành cho Quản trị viên (Admin Dashboard)
*(Khu vực này được bảo mật bởi Spring Security và render hoàn toàn bằng VueJS + REST API)*
* **Quản lý Linh kiện:** Thêm, sửa, xóa (Soft Delete), upload ảnh linh kiện.
* **Quản lý Đơn hàng:** Xét duyệt đơn đặt hàng, cập nhật trạng thái giao hàng.
* **Quản lý Tài khoản:** Xem danh sách khách hàng, phân quyền hệ thống.