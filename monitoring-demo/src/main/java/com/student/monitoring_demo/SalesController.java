package com.student.monitoring_demo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

    // Đây là thuộc tính của đối tượng dùng để đếm
    private final Counter productSoldCounter;

    // Sử dụng Dependency Injection (Tiêm phụ thuộc) để lấy MeterRegistry
    public SalesController(MeterRegistry registry) {
        this.productSoldCounter = Counter.builder("product_sold_count")
                .description("Tổng số sản phẩm đã bán ra")
                .tag("environment", "demo")
                .register(registry);
    }

    @GetMapping("/buy")
    public String buyProduct() {
        // Mỗi lần hành vi này thực hiện, trạng thái của counter sẽ thay đổi
        productSoldCounter.increment();
        return "Giao dịch thành công! Prometheus đã ghi nhận 1 sản phẩm mới.";
    }
}