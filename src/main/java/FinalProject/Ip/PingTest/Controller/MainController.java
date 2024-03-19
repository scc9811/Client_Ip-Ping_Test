package FinalProject.Ip.PingTest.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/showIP")
    public String showIP(HttpServletRequest request, Model model) {
        String userIP = request.getRemoteAddr(); // 사용자의 IP를 가져옴
        model.addAttribute("userIP", userIP); // 모델에 사용자의 IP를 추가하여 Thymeleaf에서 사용할 수 있도록 함
        return "showIP"; // Thymeleaf 템플릿의 경로를 반환
    }
}
