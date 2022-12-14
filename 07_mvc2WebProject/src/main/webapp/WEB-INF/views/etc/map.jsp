<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지도</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=mr9pd4jpg4&submodules=geocoder"></script>
</head>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp" %>
	<div class="page-content">
		<div class="page-title">지도 API</div>
		<h2>1. 다음 주소찾기 API</h2>
		<div class="address-wrap">
			<input type="text" name="postcode" id="postcode" class="input-form" readonly>
			<button class="btn bc1" onclick="searchAddr();">주소찾기</button>
			<input type="text" name="address" id="address" class="input-form" readonly>
			<input type="text" name="detailAddress" id="detailAddress" class="input-form">
		</div>
		<h2>2. 네이버 지도 API</h2>
		<div id="map" style="width:100%;height:500px;"></div>
		<button onclick="showMap();" class="btn bc1">지도옮기기</button>
	</div>
	<script>
		const map = new naver.maps.Map("map",{
			center : new naver.maps.LatLng(37.533837,126.896836),
			zoom : 17,
			zoomControl : true,
			zoomControlOptions : {
				position : naver.maps.Position.TOP_RIGHT,
				style : naver.maps.ZoomControlStyle.SMALL
			}
		});
		const marker = new naver.maps.Marker({
			position : new naver.maps.LatLng(37.533837,126.896836),
			map : map//위에서 만든 지도(const map)
		});
		let contentString = [
			"<div class='iw_inner'>",
			"	<h3>KH정보교육원</h3>",
			"	<p>서울시 영등포구 선유동2로 57 이레빌딩 19F A강의장</p>",
			"</div>"
		].join("");
		let infoWindow = new naver.maps.InfoWindow();
		//마커에 클릭이벤트 추가
		naver.maps.Event.addListener(marker,"click",function(e){
			infoWindow = new naver.maps.InfoWindow({
				content : contentString
			});
			//생성된 infoWindow를 map의 marker위치에 생성
			infoWindow.open(map,marker);
		});
		//지도에 클릭이벤트 추가
		naver.maps.Event.addListener(map,"click",function(e){
			marker.setPosition(e.coord);//클릭한 해당위치로 마커 이동
			if(infoWindow.getMap()){//정보창이 지도 위에 올라가있으면(=infoWindow.open)
				infoWindow.close();
			}
			//위경도를 통해서 해당 위치의 주소를 알아내기
			naver.maps.Service.reverseGeocode({
				location: new naver.maps.LatLng(e.coord.lat(),e.coord.lng())
			},function(status,response){
				if(status != naver.maps.Service.Status.OK){
					return alert("주소를 찾을 수 없습니다.");
				}
				console.log(response);
				const address = response.result.items[1].address;
				console.log(address);
				contentString=[
					"<div class='iw_inner'>",
					"	<p>"+address+"</p>",
					"</div>"
				].join("");
			});
		});
		function showMap(){
			const addr = $("#address").val();
			naver.maps.Service.geocode({address:addr}, function(status,response){
				if(status === naver.maps.Service.Status.ERROR){
					return alert("조회에러");
				}
				console.log(response);
				const lng = response.result.items[1].point.x;//경도 값
				const lat = response.result.items[1].point.y;//위도 값
				//지도에서 사용할 위도&경도 위치 객체
				const latlng = new naver.maps.LatLng(lat,lng);
				map.setCenter(latlng);//지도 중심 이동
				marker.setPosition(latlng);//마커 위치 이동
			});
		}
		function searchAddr() {
			new daum.Postcode({
				oncomplete : function(data) {
					// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
					// 예제를 참고하여 다양한 활용법을 확인해 보세요.
					console.log(data);
					$("#postcode").val(data.zonecode);
					$("#address").val(data.roadAddress);
					$("#detailAddress").focus();
				}
			}).open();
		}
	</script>
	<%@include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>