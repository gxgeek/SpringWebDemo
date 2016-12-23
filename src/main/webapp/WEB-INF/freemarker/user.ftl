<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<html lang="en-US">
    <head>
        <meta charset="UTF-8">
        <title>用户信息</title>
    </head>
    <body>
        <#list  userList as User>
        <p>ID：${User.userId}</p>
        <p>姓名：${User.userName}</p>
        </#list>
    </body>
</html>