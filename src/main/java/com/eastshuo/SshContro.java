package com.eastshuo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eastshuo.model.Result;

@RestController
public class SshContro {
	@RequestMapping(value = "/kk")
	public Result kk(){
		Result re = new Result("eastshuo",4444444,"dfafdb");
		return re;
	}
}
