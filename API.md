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
请求模拟：curl -X POST -d "unitName=单位"  http://127.0.0.1:9001/consumer/appGoodsUnit/add

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
请求模拟：curl -X POST -d "unitName=单位" -d "id=5"  http://127.0.0.1:9001/consumer/appGoodsUnit/edit

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
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodsUnit/del?id=5 -v

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
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodsUnit/selectByStoreId?storeId=1 -v

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
#### 5)、分页查询单位
请求模拟：curl -X POST -d "storeId=1&pageNum=1&pageSize=2" http://127.0.0.1:9001/consumer/appGoodsUnit/findByPage -v

请求方式：GET

请求参数：
storeId 店铺ID
pageNum 第几页
pageSize 每页数据条数

返回结果：
```json
{
    "code": 200,
    "message": "成功",
    "data": {
        "total": 3,
        "list": [
            {
                "id": 2,
                "unitName": "盘",
                "createTime": 1555659616000,
                "updateTime": null,
                "storeId": 1,
                "unitStatus": 1
            },
            {
                "id": 3,
                "unitName": "箱",
                "createTime": 1555659621000,
                "updateTime": null,
                "storeId": 1,
                "unitStatus": 1
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 2,
        "prePage": 0,
        "nextPage": 2,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
            1,
            2
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 2
    },
    "error": false,
    "success": true
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

请求方式：GET

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

请求方式：GET

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
### 5、标签
#### 1)、添加标签
请求模拟：curl -X POST -d "tagName=火&tagColor=red"  http://127.0.0.1:9001/consumer/appGoodsTag/add -v

请求方式：POST

请求参数：
tagName 标签名称
tagColor 标签颜色

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
#### 2)、修改标签
请求模拟：curl -X POST -d "id=1&tagName=热&tagColor=red"  http://127.0.0.1:9001/consumer/appGoodsTag/edit -v

请求方式：POST

请求参数：
id 标签ID
tagName 标签名称
tagColor 标签颜色

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
#### 3)、删除标签
请求模拟：curl  http://127.0.0.1:9001/consumer/appGoodsTag/del?id=1 -v

请求方式：GET

请求参数：
id 标签ID

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
#### 4)、查询标签
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodsTag/selectByStoreId?storeId=1 -v

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
            "tagName":"热",
            "tagColor":"red",
            "createTime":1556018299000,
            "updateTime":1556018354000,
            "tagStatus":1,
            "storeId":1
        }
    ],
    "error":false,
    "success":true
}
```
### 6、口味
#### 1)、添加口味
请求模拟：curl -X POST -d "tasteName=AAA"  http://127.0.0.1:9001/consumer/appGoodsTaste/add -v

请求方式：POST

请求参数：
tasteName 口味名称

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
#### 2)、修改口味
请求模拟：curl -X POST -d "id=1&tasteName=不放蒜"  http://127.0.0.1:9001/consumer/appGoodsTaste/edit -v

请求方式：POST

请求参数：
id 口味ID
tasteName 口味名称

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
#### 3)、删除口味
请求模拟：curl  http://127.0.0.1:9001/consumer/appGoodsTaste/del?id=1 -v

请求方式：GET

请求参数：
id 口味ID

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
#### 4)、查询口味
请求模拟：curl http://127.0.0.1:9001/consumer/appGoodsTaste/selectByStoreId?storeId=1 -v

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
            "tasteName":"不放蒜",
            "storeId":1,
            "createTime":1556078085000,
            "updateTime":1556087088000,
            "tasteStatus":1
        }
    ],
    "error":false,
    "success":true
}
```
### 7、售卖时间
#### 1)、添加售卖时间
请求模拟：curl -X POST -d "saleTimeName=早餐时间&startTime=08:00&endTime=12:00"  http://127.0.0.1:9001/consumer/appSaleTime/add -v

请求方式：POST

请求参数：
saleTimeName 名称
startTime 开始时间
endTime 结束时间

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
#### 2)、修改售卖时间
请求模拟：curl -X POST -d "id=1&saleTimeName=早餐时间&startTime=08:00&endTime=13:00"  http://127.0.0.1:9001/consumer/appSaleTime/edit -v

请求方式：POST

请求参数：
id 售卖时间ID
saleTimeName 名称
startTime 开始时间
endTime 结束时间

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
#### 3)、删除售卖时间
请求模拟：curl  http://127.0.0.1:9001/consumer/appSaleTime/del?id=1 -v

请求方式：GET

请求参数：
id 售卖时间ID

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
#### 4)、查询售卖时间
请求模拟：curl http://127.0.0.1:9001/consumer/appSaleTime/selectByStoreId?storeId=1 -v

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
            "storeId":1,
            "saleTimeName":"早餐时间",
            "startTime":"08:00",
            "endTime":"13:00",
            "createTime":1556020218000,
            "updateTime":1556087256000,
            "saleTimeStatus":1
        },
        {
            "id":2,
            "storeId":1,
            "saleTimeName":"午餐时间",
            "startTime":"13:00",
            "endTime":"20:00",
            "createTime":1556020381000,
            "updateTime":1556087301000,
            "saleTimeStatus":1
        }
    ],
    "error":false,
    "success":true
}
```
### 8、商品
#### 1)、添加商品
请求模拟：curl -X POST -d "goodsName=商品&goodsPrice=1000&categoryId=1&goodsPic=&goodsIndex=1&unitId=2&isVip=1&vipPrice=900&spelling=SP&canDiscount=1&goodsTaste=[{\"name\":\"加麻\"},{\"name\":\"加辣\"},{\"name\":\"不放葱\"}]&goodsSaleTime=[{\"start\":\"08:00\",\"end\":\"11:00\"},{\"start\":\"13:00\",\"end\":\"20:00\"}]"  http://127.0.0.1:9001/consumer/appGoods/add -v

请求方式：POST

请求参数：
goodsName 商品名称
goodsPrice 商品价格
categoryId 分类ID
goodsPic 商品图片
goodsIndex 商品排序
unitId 商品单位ID
isVip 是否VIP
vipPrice VIP价格
spelling 商品名称首字母缩写
canDiscount 是否可折扣
goodsTaste 商品口味JSON
goodsSaleTime 商品销售时间JSON

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
#### 2)、修改商品
请求模拟：curl -X POST -d "id=1&goodsName=干锅鱿鱼虾&goodsPrice=1500&categoryId=1&goodsPic=&goodsIndex=1&unitId=2&isVip=1&vipPrice=1000&spelling=GGYYX&canDiscount=1&goodsTaste=[{\"name\":\"加麻\"},{\"name\":\"加辣\"},{\"name\":\"不放葱\"}]&goodsSaleTime=[{\"start\":\"08:00\",\"end\":\"11:00\"},{\"start\":\"13:00\",\"end\":\"20:00\"}]"  http://127.0.0.1:9001/consumer/appGoods/edit -v

请求方式：POST

请求参数：
id 商品ID
goodsName 商品名称
goodsPrice 商品价格
categoryId 分类ID
goodsPic 商品图片
goodsIndex 商品排序
unitId 商品单位ID
isVip 是否VIP
vipPrice VIP价格
spelling 商品名称首字母缩写
canDiscount 是否可折扣
goodsTaste 商品口味JSON
goodsSaleTime 商品销售时间JSON

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
#### 3)、删除商品
请求模拟：curl  http://127.0.0.1:9001/consumer/appGoods/del?id=1 -v

请求方式：GET

请求参数：
id 商品ID

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
#### 4)、查询商品
请求模拟：curl http://127.0.0.1:9001/consumer/appGoods/selectByStoreId?storeId=1 -v

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
            "goodsName":"干锅鱿鱼虾",
            "goodsPrice":1500,
            "goodsStatus":1,
            "createTime":1556090172000,
            "updateTime":1556090410000,
            "categoryId":1,
            "goodsIndex":1,
            "unitId":2,
            "isVip":1,
            "vipPrice":1000,
            "spelling":"GGYYX",
            "storeId":1,
            "canDiscount":1,
            "goodsPic":"",
            "goodsTaste":"[{\"name\":\"加麻\"},{\"name\":\"加辣\"},{\"name\":\"不放葱\"}]",
            "goodsSaleTime":"[{\"start\":\"08:00\",\"end\":\"11:00\"},{\"start\":\"13:00\",\"end\":\"20:00\"}]"
        }
    ],
    "error":false,
    "success":true
}
```