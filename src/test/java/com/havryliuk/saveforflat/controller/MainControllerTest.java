package com.havryliuk.saveforflat.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;

public class MainControllerTest {
    @Test
    public void testGetMainPage() {
        ModelAndView mav = new MainController().getMainPage();
        assertEquals("index", mav.getViewName());
    }
}
