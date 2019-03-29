# 接口文档
## 一、后台用户相关
### 1、登录
请求模拟：curl -X POST -d "username=wangtong" -d "password=123456" -d "code=1234" http://211.149.143.58:9001/consumer/adminUser/login

请求方式：POST

请求参数：
username 用户名
password 密码
code 验证码

返回结果：
```json
{
    "code":200,
    "message":"登录成功",
    "data":{
        "id":1,
        "loginName":"wangtong",
        "loginPassword":"$2a$10$MZWGaK.vdTlY5WNFMhsqteUyi8qntlu0KceNWYPY8IiP9ypTpV9fm",
        "realName":"王彤",
        "nickName":"王彤",
        "imgUrl":null,
        "createTime":1553871231000,
        "updateTime":1553871236000,
        "userStatus":0,
        "userPhone":"13888888888",
        "userEmail":"wangtong@123.com"
    },
    "error":false,
    "success":true
}
```

