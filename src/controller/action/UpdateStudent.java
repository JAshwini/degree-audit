/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action;

import controller.Action;
import crud.StudentCRUD;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dipak
 */
public class UpdateStudent implements Action {

    @Override
    public String perform(HttpServletRequest request, HttpServletResponse response) {
        Integer id = new StudentCRUD().update(request);
        return String.valueOf(id);
    }
}
