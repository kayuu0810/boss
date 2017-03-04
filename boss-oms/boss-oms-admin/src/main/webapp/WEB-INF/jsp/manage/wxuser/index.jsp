<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>标签列表</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>

</head>
<body>
<div id="main">
	<div id="toolbar">
	<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-plus" onclick="createAction()"></i> 新增标签</a>
		<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-edit"></i> 编辑标签</a>
		<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-close"></i> 删除标签</a>
	</div>
	<table id="table"></table>
</div>
	<jsp:include page="/resources/inc/footer.jsp" flush="true"/>

	<script>
	var $table = $('#table');
	$(function() {
	// bootstrap table初始化
	$table.bootstrapTable({
	url: '${basePath}/manage/wxuser/list',
	height: getHeight(),
	striped: true,
	search: true,
	showRefresh: true,
	showColumns: true,
	minimumCountColumns: 2,
	clickToSelect: true,
	detailView: true,
	detailFormatter: 'detailFormatter',
	pagination: true,
	paginationLoop: false,
	sidePagination: 'server',
	silentSort: false,
	smartDisplay: false,
	escape: true,
	searchOnEnterKey: true,
	idField: 'id',
	maintainSelected: true,
	toolbar: '#toolbar',
	columns: [
	{field: 'ck', checkbox: true},
	{field: 'id', title: '编号', sortable: true, align: 'center'},
	{field: 'subscribe', title: '是否订阅', formatter: 'subscribeFormatter'},
	{field: 'openId', title: 'openId'},
	{field: 'nickName', title: '昵称'},
	{field: 'sex', title: '性别', formatter: 'sexFormatter'},
	{field: 'province', title: '省份'},
	{field: 'city', title: '城市'},
	{field: 'headImgUrl', title: '用户头像', align: 'center', formatter: 'iconFormatter'},
	{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}
	]
	});
	});

	// 格式化操作按钮
	function actionFormatter(value, row, index) {
	return [
	'<a class="delete" href="javascript:;" onclick="deleteAction()" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
	].join('');
	}
    //是否订阅
	function subscribeFormatter(value){
	return value==1?'是':'否';
	}
	//性别格式化
	function sexFormatter(value){
	switch(value)
	{
	case 1:
	return  '男';
	break;
	case 2:
	return  '女';
	break;
	default:
	return  '未知';
	}

	}
	// 格式化图标
	function iconFormatter(value, row, index) {
	if(value == null){
	return '--';
	}
	return value == null ? '--':'<img src="' + value + '" width="30px" height="30px">';
	}
	// deleteAction
	var deleteDialog;
	function deleteAction() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length != 1) {
	$.confirm({
	title: false,
	content: '请选择一条记录！',
	autoClose: 'cancel|3000',
	backgroundDismiss: true,
	buttons: {
	cancel: {
	text: '取消',
	btnClass: 'waves-effect waves-button'
	}
	}
	});
	} else {
	deleteDialog = $.confirm({
	type: 'red',
	animationSpeed: 300,
	title: false,
	content: '确认删除该角色吗？',
	buttons: {
	confirm: {
	text: '确认',
	btnClass: 'waves-effect waves-button',
	action: function () {
	var ids = new Array();
	for (var i in rows) {
	ids.push(rows[i].id);
	}
	$.ajax({
	type: 'get',
	url: '${basePath}/manage/wxuser/delete/' + ids.join("-"),
	success: function(result) {
	if (result.code != 1) {
	if (result.data instanceof Array) {
	$.each(result.data, function(index, value) {
	$.confirm({
	theme: 'dark',
	animation: 'rotateX',
	closeAnimation: 'rotateX',
	title: false,
	content: value.errorMsg,
	buttons: {
	confirm: {
	text: '确认',
	btnClass: 'waves-effect waves-button waves-light'
	}
	}
	});
	});
	} else {
	$.confirm({
	theme: 'dark',
	animation: 'rotateX',
	closeAnimation: 'rotateX',
	title: false,
	content: result.data.errorMsg,
	buttons: {
	confirm: {
	text: '确认',
	btnClass: 'waves-effect waves-button waves-light'
	}
	}
	});
	}
	} else {
	deleteDialog.close();
	$table.bootstrapTable('refresh');
	}
	},
	error: function(XMLHttpRequest, textStatus, errorThrown) {
	$.confirm({
	theme: 'dark',
	animation: 'rotateX',
	closeAnimation: 'rotateX',
	title: false,
	content: textStatus,
	buttons: {
	confirm: {
	text: '确认',
	btnClass: 'waves-effect waves-button waves-light'
	}
	}
	});
	}
	});
	}
	},
	cancel: {
	text: '取消',
	btnClass: 'waves-effect waves-button'
	}
	}
	});
	}
	}
	</script>
</body>
</html>