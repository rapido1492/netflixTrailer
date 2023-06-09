<%-- <%@ page import="com.x62life.util.TextUtil" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/env.jsp"%>  
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->
   <!--  JS   -->
   <!-- ------------------------------------------------------------------------------------------------------------------------ -->
  <script src="<%=_libUrl %>bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="<%=_libUrl %>swiper/swiper-bundle.min.js"></script>
  <script src="<%=_libUrl %>waypoints/jquery.waypoints.min.js"></script>  
  <script src="<%=_libUrl %>waypoints/shortcuts/sticky.min.js"></script>
  <script src="<%=_libUrl %>waypoints/shortcuts/inview.min.js"></script>
  <script src="<%=_libUrl %>circle-progress-master/jquery.circle-progress.js"></script>
  <script src="<%=_libUrl %>aos/aos.js"></script>  
  <script src="<%=_jsUrl %>ui.js"></script>
  <script src="<%=_jsUrl %>main/main.js"></script>     
  <script src="<%=_jsUrl %>main/mainm.js"></script>     
  <script src="<%=_jsUrl %>ui-main.js"></script>    
  <script src="<%=_jsUrl %>ui-cart.js"></script>    
  <script src="<%=_jsUrl%>ui-prd-detail.js"></script>
  
  <script src="<%=_jsUrl %>common/common.js"></script>     
  <script src="<%=_jsUrl %>common/common_ajax.js"></script>     
  <script src="<%=_jsUrl %>common/common_link.js"></script>     
  <script src="<%=_jsUrl %>common/common_pop.js"></script>     
  <script src="<%=_jsUrl %>common/common_keyevent.js"></script>     
  <script src="<%=_jsUrl %>common/footer.js"></script>     
  <script src="<%=_jsUrl %>common/validation.js"></script>     
  <script src="<%=_jsUrl %>common/gnbSub.js"></script>     
  <script src="<%=_jsUrl %>common/dataEvent.js"></script>
  <script src="<%=_jsUrl %>goods/itemDetail.js"></script>
  <script src="<%=_jsUrl %>cart/cart.js"></script>


    <div class="global-bottom">
      <ul class="global-bottom-menu">
        <li class="gbm-item active">
          <a href="javascript:void(0)" onClick="javascript:footer.goUrl(0)">
            <i class="wn-icon wni-home"></i>
            <!-- <span class="tit">홈</span> -->
          </a>
        </li>
        <li class="gbm-item">
          <a href="javascript:void(0)" onClick="javascript:footer.goUrl(1)">
            <i class="wn-icon wni-history" id="footerTimeline"></i>
            <!-- <span class="tit">타임라인</span> -->
          </a>
        </li>
        <li class="gbm-item">
          <a href="javascript:void(0)" onClick="javascript:footer.goUrl(2)">
            <i class="wn-icon wni-menu" id="footerCategory"></i>
            <!-- <span class="tit">카테고리</span> -->
          </a>
        </li>
        <li class="gbm-item">
          <a href="javascript:void(0)" onClick="javascript:footer.goUrl(3)">
            <i class="wn-icon wni-search" id="footerSearch"></i>
            <!-- <span class="tit">검색</span> -->
          </a>
        </li>
        <li class="gbm-item">
          <a href="javascript:void(0)" onClick="javascript:footer.goUrl(4)">
            <i class="wn-icon wni-user" id="footerMypage"></i>
            <span class="tit">마이자연</span>
          </a>
        </li>
      </ul>
    </div>
  </div>
  
</body>
</html>
