<html lang="en-US">
    <head>
        <meta charset="UTF-8">
        <title>用户信息</title>
    </head>
    <body>
       <p> 欢迎</p>
<#if userList1?exists &&userList1.size != 0>
        <#list  userList1 as User>
        <p>ID：${(User.userId)!}</p>
        <p>姓名：${(User.userName) !}</p>
        </#list>
</#if>
    </body>
</html>