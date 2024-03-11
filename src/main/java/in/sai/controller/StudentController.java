package in.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sai.binding.Student;
import in.sai.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {

		fotmInitBinding(model);

		return "index";

	}

	private void fotmInitBinding(Model model) {
		// Student sobj = new Student();
		model.addAttribute("student", new Student());

		// List<String> courceList = service.getCources();
		model.addAttribute("courses", service.getCources());

		// List<String> timingsList = service.getTimings();
		model.addAttribute("prefTimings", service.getTimings());
	}

	@PostMapping("/save")
	public String saveStudent(Student s, Model model) {

		boolean isSaved = service.saveStudent(s);
		if (isSaved) {

			model.addAttribute("msg", "Data Saved...!!!");
		}

		System.out.println(s);

		fotmInitBinding(model);

		return "index";

	}
}