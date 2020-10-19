package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.exceptions.*;
import com.cg.eis.service.*;
import com.cg.eis.util.JpaUtil;

public class ProjectMain {

    public static void main(String args[]) {
        try {
            EmployeeUi ui = new EmployeeUi();
            ui.runUi();
            JpaUtil jpaUtil = JpaUtil.getInstance();
            jpaUtil.close();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidEmployeeNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidDesignationException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("something went wrong");
        }

    }

}
