# 接口文档
## 一、后台相关
### 1、用户
#### 1)、登录
请求模拟：curl -X POST -d "username=wangtong" -d "password=123456" -d "code=1234" http://127.0.0.1:9001/consumer/adminUser/login

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
#### 2)、注册
请求模拟：curl -X POST -d "loginName=weihaibo&loginPassword=123456&realName=魏海波&nickName=simon&userEmail=554040883@qq.com&userPhone=18946554015" http://127.0.0.1:9001/consumer/adminUser/insert -v

请求方式：POST

请求参数：
loginName 用户名
loginPassword 密码
realName 真实姓名
nickName 昵称
userPhone 手机号码
userEmail 邮箱

返回结果：
```json
{
    "code":200,
    "message":"新用户创建成功",
    "data":null,
    "error":false,
    "success":true
}
```

### 2、菜品单位
#### 1)、添加单位
请求模拟：curl -X POST -d "unitName=单位"  http://127.0.0.1:9001/consumer/appGoodUnit/add

请求方式：POST

请求参数：
unitName 单位名称

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 2)、修改单位
请求模拟：curl -X POST -d "unitName=单位" -d "id=5"  http://127.0.0.1:9001/consumer/appGoodUnit/edit

请求方式：POST

请求参数：
unitName 单位名称
id 单位ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 3)、删除单位
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodUnit/del?id=5 -v

请求方式：GET

请求参数：
id 单位ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 4)、查询单位
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodUnit/selectByStoreId?storeId=1 -v

请求方式：GET

请求参数：
storeId 店铺ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":[
        {
            "id":2,
            "unitName":"盘",
            "createTime":1555659616000,
            "updateTime":null,
            "storeId":1,
            "unitStatus":1
        },
        {
            "id":3,
            "unitName":"箱",
            "createTime":1555659621000,
            "updateTime":null,
            "storeId":1,
            "unitStatus":1
        },
        {
            "id":4,
            "unitName":"瓶",
            "createTime":1555659627000,
            "updateTime":null,
            "storeId":1,
            "unitStatus":1
        }
    ],
    "error":false,
    "success":true
}
```
### 3、菜单
#### 1)、添加菜单
请求模拟：curl -X POST -d "menuName=早餐菜单"  http://127.0.0.1:9001/consumer/appMenu/add -v

请求方式：POST

请求参数：
menuName 菜单名称

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 2)、修改菜单
请求模拟：curl -X POST -d "menuName=早餐菜单&id=1"  http://127.0.0.1:9001/consumer/appMenu/edit -v

请求方式：POST

请求参数：
menuName 菜单名称
id 菜单ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 3)、删除菜单
请求模拟：curl  http://127.0.0.1:9001/consumer/appMenu/del?id=1 -v

请求方式：POST

请求参数：
menuName 菜单名称
id 菜单ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 4)、查询菜单
请求模拟：curl http://127.0.0.1:9001/consumer/appMenu/selectByStoreId?storeId=1 -v

请求方式：GET

请求参数：
storeId 店铺ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":[
        {
            "id":1,
            "menuName":"早餐菜单",
            "menuStatus":1,
            "createTime":1556041603000,
            "updateTime":1556012921000,
            "storeId":1
        }
    ],
    "error":false,
    "success":true
}
```
### 4、分类
#### 1)、添加分类
请求模拟：curl -X POST -d "menuId=1&categoryName=早餐类"  http://127.0.0.1:9001/consumer/appGoodsCategory/add -v

请求方式：POST

请求参数：
menuId 菜单ID
categoryName 分类名称

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 2)、修改分类
请求模拟：curl -X POST -d "id=1&categoryName=早餐"  http://127.0.0.1:9001/consumer/appGoodsCategory/edit -v

请求方式：POST

请求参数：
id 分类ID
categoryName 分类名称

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 3)、删除分类
请求模拟：curl  http://127.0.0.1:9001/consumer/appGoodsCategory/del?id=1 -v

请求方式：POST

请求参数：
id 分类ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":1,
    "error":false,
    "success":true
}
```
#### 4)、查询分类
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodsCategory/selectByStoreId?storeId=1 -v

请求方式：POST

请求参数：
storeId 店铺ID

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":[
        {
            "id":1,
            "categoryName":"早餐",
            "menuId":1,
            "categoryStatus":1,
            "createTime":1556016792000,
            "updateTime":1556016878000,
            "storeId":1
        }
    ],
    "error":false,
    "success":true
}
```