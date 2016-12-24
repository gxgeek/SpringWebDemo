<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <title>编辑界面</title>
</head>
<body>
<p> 欢迎光临本网站</p>
<form method="post" action="${base}/blog/edit" enctype="multipart/form-data">
    博客标题：<input type="text" name="blogTitle"><br>
    内容：<input type="text" name="blogContent"><br>
     <input type="submit" value="提交">
</form>
</body>
</html>