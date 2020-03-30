<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> 
 <meta charset="utf-8"> 
 <title>구글지도 회사 위치</title> 
 <script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script> 
 <script> 
  function initialize() { 
  var myLatlng = new google.maps.LatLng(35.87110100714382, 128.60169690333006); 
  var mapOptions = { 
        zoom: 17, 
        center: myLatlng, 
        mapTypeId: google.maps.MapTypeId.ROADMAP 
  } 
  var map = new google.maps.Map(document.getElementById('map_canvas'), mapOptions); 
  } 
 </script> 
</head> 
<body onload="initialize()"> 
 <div id="map_canvas"style="width:500px; height:300px;"></div> 
</body> 
</html> 
AIzaSyAU2CEJXyIxHvEgjQ68lD_cLzXVsnbHz7U