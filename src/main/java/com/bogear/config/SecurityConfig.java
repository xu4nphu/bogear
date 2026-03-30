//package com.bogear.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        // 1. Tắt CSRF để làm việc với Form/API cho dễ
//        http.csrf(csrf -> csrf.disable());
//
//        // 2. PHÂN QUYỀN TRUY CẬP (Cực kỳ quan trọng)
//        http.authorizeHttpRequests(auth -> auth
//                // Cho phép tất cả mọi người truy cập các đường dẫn này
//                .requestMatchers("/bogear/home/**", "/auth/**", "/site/**").permitAll()
//
//                // Cho phép load toàn bộ tài nguyên tĩnh (CSS, JS, Images)
//                .requestMatchers("/css/**", "/js/**", "/images/**", "/favicon.ico").permitAll()
//
//                // Mọi yêu cầu khác mới cần đăng nhập
//                .anyRequest().permitAll() // Tạm thời để permitAll hết để Phú test giao diện cho sướng
//        );
//
//        // 3. CẤU HÌNH FORM LOGIN
//        http.formLogin(login -> login
//                .loginPage("/auth/login/form") // Trang login tự chế của Phú
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/bogear/home", true)
//                .permitAll()
//        );
//
//        // 4. CẤU HÌNH LOGOUT
//        http.logout(logout -> logout
//                .logoutUrl("/auth/logoff")
//                .logoutSuccessUrl("/bogear/home")
//        );
//
//        return http.build();
//    }
//}
