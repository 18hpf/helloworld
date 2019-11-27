package com.gsjk.user;

import com.gsjk.result.Result;

public interface UserService {

   public Result login(UserInfo userinfo);

   /**
   * @Description: to register the new user
   * @Param: [userInfo]
   * @return: com.Result
   * @Author: Mr.Cheng
   * @Date: 2019/10/9 3:58 下午
   */
   public Result register(UserInfo userInfo);
}
