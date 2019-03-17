package com.example.epro.test;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.sound.midi.SysexMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryService;

    private CategoryBean category1 = new CategoryBean();

    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute CategoryBean category,
                                     BindingResult result) {
        System.out.println("inside saveemploye");
        System.out.println(new JSONObject(category).toString());
        category1.setCategoryName(category.getCategoryName());
        System.out.println("crossed saveemploye 1");
        //categoryService.save(category1);
        System.out.println("crossed saveemploye 2");
        return new ModelAndView("redirect:/addCategory");
    }

    @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
    public ModelAndView addCategory(@ModelAttribute  CategoryBean category,
                                    BindingResult result) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("categories",  categoryService.findAll());
        return new ModelAndView("addCategory", model);
    }

    @RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
    public ModelAndView deleteCategory(@ModelAttribute  CategoryBean category,
                                       BindingResult result) {
        categoryService.deleteById(category.getCategoryId());
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("categories",  categoryService.findAll());
        return new ModelAndView("addCategory", model);
    }

    @RequestMapping(value = "/editCategory", method = RequestMethod.GET)
    public ModelAndView editCategory(@ModelAttribute  CategoryBean category,
                                     BindingResult result) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("category",  categoryService.getOne(category.getCategoryId()));
        model.put("categories",  categoryService.findAll());
        return new ModelAndView("addCategory", model);
    }

    @RequestMapping(value="/categories", method = RequestMethod.GET)
    public List<CategoryBean> getCategories() {
        //return categoryService.findAll();
        return null;
    }
}
