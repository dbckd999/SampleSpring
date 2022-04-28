function hasSession(){
	if('${sessionScope.m_id}'.trim() !== ''){
		return true;
	}else{
		return false;
	}
}
	
$("#addComment").on('click', function(){
	if(!hasSession()) return;
	//최소한의 유효성 검사.
	if($('input[id="c_comment"]').val().trim() === ""){
		alert("댓글을 입력해 주세요");
		return;
	}
	$.ajax({
		type: "POST",
		dataType: 'json',
		url: '/addCommentEvent',
		data: {	'c_content_no': $('input[name="b_no"]').val()
				, 'm_id': $("#m_id").val()
				, 'c_comment': $("#c_comment").val() },
		success: function(data) { 
			if(data){
				console.log("댓글작성 완료[" + data + "]");
				$("#c_comment").val('');
				loadComment();
			}
		},
		error: function(request, status, erorr){
			console.log('request: ' + request + '\n status: ' + status + '\n erorr: ' + erorr);
			console.log(request);
		}
	});
});
	
function loadComment(){
	$.ajax({
		type: "GET",
		dataType: 'json',
		url: '/commentEvent?b_no='+$('input[name="b_no"]').val(),
		success: function(data) {
			var tag = "<tr><td>이름</td><td>내용</td></tr>";
			
			$(data).each(function(){
            	tag += "<tr>"
        				+ "<td>" + this.c_id + "</td>" 
   	                   	+ "<td>" + this.c_comment + "</td>"
						+ "<td>" + this.c_reg_date + "</td>"
   	                   	if(this.c_id === $('input[id="m_id"]').val()){
	   	                   	tag += "<td><button onclick='deleteComment(" + this.c_no + ")'>삭제</button></td>"
   	                   	}
                   	 	+ "</tr>";
			});
            $("#commentList").html(tag);
		}
	});
}
loadComment();

function deleteComment(delete_c_no){
	if(!hasSession()) return;
	$.ajax({
		type: "POST",
		dataType: 'json',
		url: '/deleteCommentEvent',
		data: {	'c_no' : delete_c_no },
		success: function(data) {
			loadComment();
		}
	});
}

$("#test").on('click', loadComment);