<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
    <meta charset="UTF-8">
    <title>Monalisa example</title>
    <link  href="assets/css/main.css"          rel="stylesheet" />
    <script src="assets/js/jquery-3.1.1.min.js"></script>
    <style>
    	div{
    		display: inline-block;
    		vertical-align: top;
    	}
    </style>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function(){
			$.ajax({
	            url : 'dbs/testdb?method=head',
	            type: 'GET',
	            data: null,
	            dataType: 'json',
	            timeout : 30000,
	            success : function(data) {
	            	if(data.status==200){
	            		var tables=data.data;
	            		
	            		var html="";
	            		for(var i=0;i<tables.length;i++){
	            			if(html.length>0){
	            				html+="\r\n<br>"
	            			}
	            			html+="<a href='javascript:load_table(\""+ tables[i].table_name+ "\")'>"+tables[i].table_name+"</a>";
	            		}
	            		
	            		$('.left').html(html);
	            	}else{
	            		$('.left').text("Load error, "+data.status+": "+data.message);
	            	}
	            },
	            error : function(data) {
	                $('.left').html("Load error("+data.status+"): "+data.responseText);
	            }
	        });
		});
		
		function load_table(tablename){
			$.ajax({
	            url : 'dbs/testdb/'+tablename,
	            type: 'GET',
	            data: null,
	            dataType: 'json',
	            timeout : 30000,
	            success : function(data) {
	            	if(data.status==200){
	            		var rows=data.data;
	            		 
	            		var html="<table>\r\n";
	            		if(rows.length>0){ 
		            		var h=Object.keys(rows[0]);
		            		html+="<thead><tr>";
		            		for(var k=0;k<h.length;k++){
		            			html+="<td>"+h[k]+"</td>"; 
		            		}
		            		html+="</tr></thead>";
		            		
		            		html+="<tbody>\r\n";
		            		for(var i=0;i<rows.length;i++){
		            			html+="\r\n<tr>";
		            			for(var k=0;k<h.length;k++){
			            			html+="<td>"+rows[i][h[k]]+"</td>"; 
			            		}
		            			html+="</tr>"
		            		}
		            		html+="\r\n</tbody>";
	            		}
	            		html+="\r\n</table>";
	            		
	            		$('.right').html(html);
	            	}else{
	            		$('.right').text("Load error, "+data.status+": "+data.message);
	            	}
	            },
	            error : function(data) {
	                $('.right').html("Load error("+data.status+"): "+data.responseText);
	            }
	        });
		}
	</script>
	
	<div class="left"></div>
	<div class="right"></div>
</body>
</html>        