/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.spring.web;

import java.util.List;
import net.seniorsteps.senior.common.bean.CityBean;
import net.seniorsteps.senior.spring.bll.SeniorBLGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mostafa.Gazzar
 */
@Controller
@RequestMapping(value = "/cities/")
public class CityContoller {

    @Autowired
    private SeniorBLGateway seniorBLGateway;

    @RequestMapping(value = "all")
    public ModelAndView all(@RequestParam(name = "s", required = false) String status) {
//        String status = request.getParameter("s");

        List<CityBean> findCities = seniorBLGateway.findCities();
        String message = "";
        if (status != null) {
            if ("true".equals(status)) {
                message = "Added Successfully";
            } else {
                message = "Error in Adding";
            }
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cities/all");
        modelAndView.addObject("msg", message);
        modelAndView.addObject("findCities", findCities);
        return modelAndView;
    }

    public ModelAndView add() {
        throw new UnsupportedOperationException();
    }

    // <editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public SeniorBLGateway getSeniorBLGateway() {
        return seniorBLGateway;
    }

    public void setSeniorBLGateway(SeniorBLGateway seniorBLGateway) {
        this.seniorBLGateway = seniorBLGateway;
    }
    // </editor-fold>

}
