package com.cloud.young.server1.controller.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.young.server1.constant.ResponseCodeEnum;
import com.cloud.young.server1.model.ResponseVO;
import com.cloud.young.server1.model.User;

import lombok.extern.slf4j.Slf4j;

/**
 * controller的url命名统一用模块名加操作方法命名
 * @author Lance
 *
 */
@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {

	/**
	 * 所有方法上需要加注释要来说明该方法的功能，入参说明，出参说明
	 * @param user
	 * @return
	 */
	@RequestMapping("/get")
	@ResponseBody
	public ResponseVO<User> getUser(@RequestBody User user) {
		ResponseVO<User> resp = new ResponseVO<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
		resp.setObj(new User());
		System.out.println();
		return resp;
	}
}
