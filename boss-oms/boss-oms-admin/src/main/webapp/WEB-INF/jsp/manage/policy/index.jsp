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
	<title>保单管理列表</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>

</head>
<body>
<div id="main">
	<div id="toolbar">
	<div class="title-action">
	<form role="form" id="searchForm">
	<div class="form-group col-md-2">
	<label for="orderNo">订单号</label>
	<input id="orderNo" type="text" class="form-control" name="orderNo" maxlength="20">
	</div>
	<div class="form-group col-md-2">
	<label for="policyCode">保单号</label>
	<input type="text" class="form-control" name="policyCode" id="policyCode"/>
	</div>
	<div class="form-group col-md-2">
	<label for="licenseNo">车牌号</label>
	<input type="text" class="form-control" name="licenseNo" id="licenseNo"/>
	</div>
	<div class="form-group col-md-2">
	<label for="carOwner">车主</label>
	<input type="text" class="form-control" name="carOwner" id="carOwner"/>
	</div>
	<div class="form-group col-md-2" style="margin: 0 auto;">
	<label class="sr-only">订单状态：</label>
	<select class="form-control" name="policyStatus" id="policyStatus" placeholder="订单状态">
	<option value="">请选择保单状态</option>
	<option value="10">保单初创建</option>
	<option value="11">二次报价成功</option>
	<option value="12">核保确认成功</option>
	<option value="15">核保中</option>
	<option value="16">核保成功</option>
	<option value="17">核保失败</option>
	<option value="18">二次核保成功</option>
	<option value="19">二次核保失败</option>
	<option value="20">拒保</option>
	<option value="25">承保成功</option>
	<option value="30">承保失败</option>
	<option value="35">已退保</option>
	<option value="40">终止</option>
	<option value="45">作废</option>
	</select>
	</div>
	<div class="form-group col-md-2">
	<input id="startDate" placeholder="请输入支付开始日期" name="startDate" type="text" readonly
	class="form_datetime form-control">
	</div>

	<div class="form-group col-md-2">
	<input id="endDate" placeholder="请输入支付结束日期" name="endDate" type="text" readonly
	class="form_datetime form-control">
	</div>
	</form>
	</div>
	<a class="waves-effect waves-button" href="javascript:;" onclick="selectAction()"><i class="zmdi zmdi-search" ></i>查询</a>
	<a class="waves-effect waves-button" href="javascript:;" onclick="exportAction()"><i class="zmdi zmdi-import-export" ></i>导出</a>
	<a class="waves-effect waves-button" href="javascript:;" onclick="updateAction()"><i class="zmdi zmdi-edit" ></i> 编辑</a>
	<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close" ></i> 删除</a>
	</div>
	<table id="table"></table>
</div>
	<jsp:include page="/resources/inc/footer.jsp" flush="true"/>

	<script>
	var $table = $('#table');
	$(function() {
	// bootstrap table初始化
	$table.bootstrapTable({
	url: '${basePath}/manage/policy/list',
	height: getHeight(),
	striped: true,
	search: false,
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
	{field: 'orderNo', title: '订单号'},
	{field: 'policyCode', title: '保单号'},
	{field: 'agentName', title: '业务员姓名'},
	{field: 'licenseNo', title: '车牌号'},
	{field: 'holderName', title: '投保人'},
	{field: 'insuredName', title: '被保人'},
	{field: 'payAmount', title: '支付金额'},
	{field: 'padAmount', title: '实际支付金额'},
	{field: 'carOwner', title: '车主'},
	{field: 'payTime', title: '支付时间'},
	{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}
	]
	});
	});
	// 格式化操作按钮
	function actionFormatter(value, row, index) {
	return [
	'<a class="update" href="javascript:;" onclick="updateAction()" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
	'<a class="delete" href="javascript:;" onclick="deleteAction()" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
	].join('');
	}
	// 编辑
	var updateDialog;
	function updateAction() {
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
	updateDialog = $.dialog({
	animationSpeed: 300,
	title: '编辑用户',
	content: 'url:${basePath}/manage/policy/update/' + rows[0].id,
	onContentReady: function () {
	initMaterialInput();
	}
	});
	}
	}
	/**
	*条件搜索
	*/
	function selectAction(){
	console.log(1);
	$.ajax({
	type: 'post',
	data:$('#searchForm').serialize(),
	url: '${basePath}/manage/policy/list',
	success: function(result) {
	$table.bootstrapTable('refresh');
	}
	});
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
	url: '${basePath}/manage/policy/delete/' + ids.join("-"),
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
	$('#startDate').datetimepicker({
	dateFormat: "yyyy-mm-dd",
	minView: "month",
	language: 'zh-CN',
	autoclose: true
	});
	$('#endDate').datetimepicker({
	dateFormat: "yyyy-mm-dd",
	minView: "month",
	language: 'zh-CN',
	autoclose: true
	});
	</script>
</body>
</html>