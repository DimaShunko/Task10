package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FullNameController {
    List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String getFullName(Model model) {
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/")
    public String postFullName(@ModelAttribute User user) {
        users.add(user);
        return "redirect:/";
    }
}
