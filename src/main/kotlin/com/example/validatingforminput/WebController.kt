package com.example.validatingforminput

import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.config.annotation.*
import javax.validation.Valid


@Controller
class WebController : WebMvcConfigurer {
    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/results").setViewName("results")
    }

    @GetMapping("/")
    fun showForm(personForm: PersonForm): String {
        return "form"
    }

    @PostMapping("/")
    fun checkPersonInfo(@Valid personForm: PersonForm, bindingResult: BindingResult): String {

        if (bindingResult.hasErrors()) {
            return "form"
        }

        return "redirect:/results"
    }

}