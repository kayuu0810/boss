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
	<title>业务员列表</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>

</head>
<body>
<div id="main">
	<div id="toolbar">
	<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-plus" onclick="createAction()"></i> 新增</a>
		<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-edit"></i> 编辑</a>
		<a class="waves-effect waves-button" href="javascript:;"><i class="zmdi zmdi-close" onclick="deleteAction()"></i> 删除</a>
	</div>
	<table id="table"></table>
</div>
	<jsp:include page="/resources/inc/footer.jsp" flush="true"/>

	<script>
	var $table = $('#table');
	$(function() {
	// bootstrap table初始化
	$table.bootstrapTable({
	url: '${basePath}/manage/agent/list',
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
	{field: 'terminalType', title: '终端类型', formatter: 'terminalTypeFormatter'},
	{field: 'isCaptain', title: '是否为团队长'},
	{field: 'captainAvailable', title: '团队长是否有效'},
	{field: 'userName', title: '姓名'},
	{field: 'idCard', title: '身份证'},
	{field: 'mobile', title: '手机号'},
	{field: 'province', title: '省份'},
	{field: 'city', title: '城市'},
	{field: 'area', title: '区域'},
	{field: 'address', title: '详细地址'},
	{field: 'bankName', title: '银行名称'},
	{field: 'bankCardNo', title: '银行卡号'},
	{field: 'registType', title: '注册方式'},
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
    // 终端类型
	function terminalTypeFormatter(value){
	return value==1?'微信':'APP';
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
	content: '确认删除该用户吗？',
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