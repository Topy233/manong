<%--
  Created by IntelliJ IDEA.
  User: 12532
  Date: 2019/5/1
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
    <table class="easyui-datagrid" data-options="url:'/product/list',fitColumns:true,singleSelect:true,pageSize:5,pageList:[5,10,15,20]" pagination="true"rownumber="true" toolbar="#bar">
        <thead>
        <tr>
            <th data-options="field:'id',width:100">id</th>
            <th data-options="field:'name',width:100">商品名称</th>
            <th data-options="field:'image',width:100,formatter:showImage">主图</th>
            <th data-options="field:'maketPrice',width:100,align:'right'">市场价格</th>
            <th data-options="field:'price',width:100,align:'right'">价格</th>
            <th data-options="field:'productNumber',width:100,align:'right'">商品编码</th>
        </tr>
        </thead>
    </table>

<div id="bar">
    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">编辑</a>
</div>
<script>
    function showImage(value,row,index) {
        if(row.image){
            return "<img style='height: 100px ;width: auto'src='http://144.202.119.156:8888/"+row.image+"'/>"
        }
    }
</script>
</body>
</html>
