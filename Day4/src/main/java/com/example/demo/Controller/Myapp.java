package com.example.demo.Controller;

import com.example.demo.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Myapp {
	Student Bob = new Student("2021IT01", "Bob Marely", 23, "IT", 3.2);
	Student Alice = new Student("2021IT02", "Alice corner", 24, "IT", 3.6);
	Student John = new Student("2021IT03", "John Parker", 23, "IT", 3.3);
	Student Jeorge = new Student("2020IT04", "Joerge Micheal", 25, "IT", 3.4);
}

