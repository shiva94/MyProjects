package com.suspendRestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SuspendRestoreController {
	//@RequestMapping("Suspend.htm")
	public String suspend(){
		return "Suspend";
	}
}
