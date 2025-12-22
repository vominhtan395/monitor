# DEMO-monitoring-grafana-prometheus


•  Mở Docker Desktop: Đảm bảo biểu tượng cá voi ở thanh taskbar đã báo hiệu "Running".

•  Chạy Container: Mở Terminal trong IntelliJ và gõ lệnh: docker-compose up -d 

•  Mở IntelliJ, tìm file MonitoringDemoApplication.java.

•  Nhấn nút Run (tam giác xanh) để chạy lại ứng dụng trên cổng 8080.

Vì đang cấu hình địa chỉ IP tĩnh (ví dụ 192.168.1.2) trong file prometheus.yml để Prometheus kết nối với Java:

Cách kiểm tra: Gõ ipconfig trong Terminal. Nếu IP mới khác với số cũ, bạn phải cập nhật lại file prometheus.yml và chạy lệnh docker-compose restart prometheus thì trạng thái mới báo UP được.

Sau khi khởi động lại, các con số đếm (Counter) sẽ quay về mức 0:

Mở Grafana http://localhost:3000 để xem kết quả hiện lên trên Dashboard.

http://localhost:8080/buy
