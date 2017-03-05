<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
	<div id="updateDialog" class="crudDialog">
	<form id="updateForm" method="post">
	<div class="form-group">
	<label for="userName">业务员姓名</label>
	<input id="userName" type="text" class="form-control" name="userName" maxlength="20" value="${bizUserInfo.userName}">
	</div>
	<div class="form-group">
	<label for="idCard">身份证</label>
	<input id="idCard" type="text" class="form-control" name="idCard" maxlength="30" value="${bizUserInfo.idCard}">
	</div>
	<div class="form-group">
	<label for="mobile">手机号</label>
	<input id="mobile" type="text" class="form-control" name="mobile" maxlength="22" value="${bizUserInfo.mobile}">
	</div>
	<div class="form-group">
	<label for="bankName">银行名称</label>
	<input id="bankName" type="text" class="form-control" name="bankName" maxlength="50" value="${bizUserInfo.bankName}">
	</div>
	<div class="form-group">
	<label for="bankCardNo">银行卡号</label>
	<input id="bankCardNo" type="text" class="form-control" name="bankCardNo" maxlength="50" value="${bizUserInfo.bankCardNo}">
	</div>
	<div class="form-group text-right dialog-buttons">
	<a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
	<a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>
	</div>
	</form>
	</div>
<script>
function createSubmit() {
    $.ajax({
        type: 'post',
        url: '${basePath}/manage/agent/update/${bizUserInfo.id}',
        data: $('#updateForm').serialize(),
        beforeSend: function() {
			if ($('#userName').val() == '') {
				$('#userName').focus();
				return false;
			}
			if ($('#idCard').val() == '') {
				$('#idCard').focus();
				return false;
			}
			if ($('#mobile').val() == '') {
			$('#mobile').focus();
			return false;
			}
			if ($('#bankName').val() == '') {
			$('#bankName').focus();
			return false;
			}
			if ($('#bankCardNo').val() == '') {
			$('#bankCardNo').focus();
			return false;
			}
        },
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
				updateDialog.close();
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
</script>