package com.jeffgomez.saveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jeffgomez.saveTravels.models.Expense;
import com.jeffgomez.saveTravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
	}
	}	
		@GetMapping("expenses/edit/{id}")
		public String editExpense(@PathVariable("id") Long id , Model model) {
			Expense expense = expenseService.findExpense(id);
			model.addAttribute("expense",expense);
			return "/edit.jsp";
		}
		
		@PutMapping("/expenses/edit/{id}")
		public String processEditExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
			if(result.hasErrors()) {
				return "/edit.jsp";
			}
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
		
		@DeleteMapping("expenses/delete/{id}")
		public String deleteExpense(@PathVariable("id") Long id) {
			expenseService.deleteExpense(id);
			return "redirect:/expenses";
		}
		
	}
