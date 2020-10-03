package com.example.demo.MyContact.controller;

import com.example.demo.MyContact.entity.Contact;
import com.example.demo.MyContact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/*Annotation @Controller xác định lớp hiện tại là một controller.
Về bản chất, chúng ta đang định nghĩa một bean có tên là contactController.*/
@Controller
public class ContactController {
    /*Annotation @Autowired inject bean contactService vào trong bean contactController.*/
    @Autowired
    private ContactService contactService;

    /*Annotation @GetMapping xác định phương thức list() sẽ đón nhận các HTTP request có HTTP method là GET
    và URI pattern là /contact.*/
    @GetMapping("/contact")
    /*Tham số Model có nhiệm vụ vận chuyển dữ liệu từ controller đổ ra view.*/
    public String list(Model model) {
        /*Ở đây, danh sách liên hệ được lấy ra thông qua phương thức contactService.findAll().
         Sau đó được gắn vào Model bằng phương thức addAttribute().
         Giá trị contacts chính là đối tượng đại diện cho danh sách liên hệ để chúng ta dùng ở view sau này.*/
        model.addAttribute("contacts", contactService.findAll());
        /*Trả về một string, từ string này Spring sẽ tìm kiếm view tương ứng: return "list";
        => view là list.html*/
        return "list";
    }

    @GetMapping("/contact/search")
    /*Giá trị trong @RequestParam chính là giá trị của thuộc tính name của input.*/
    public String search(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/contact";
        }
        model.addAttribute("contacts", contactService.search(term));
        return "list";
    }

    @GetMapping("/contact/add")
    public String add(Model model) {
        /*truyền sang form.html một đối tượng Contact có tên là contact.
        Mỗi thuộc tính của contact tương ứng với một input trong form.*/
        model.addAttribute("contact", new Contact());
        return "form";
    }

    @PostMapping("/contact/save")
    public String save(@Valid Contact contact, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        contactService.save(contact);
        redirect.addFlashAttribute("successMessage", "Saved contact successfully!");
        return "redirect:/contact";
    }
}
