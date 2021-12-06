package com.x62life.mo.dao.category;

import com.x62life.mo.model.category.CartRecipe;
import com.x62life.mo.model.category.CartRecipeEx;
import com.x62life.mo.model.category.Category;
import com.x62life.mo.model.category.SubCategory;
import com.x62life.mo.model.order.OdReserveGoodsEx;
import com.x62life.mo.model.product.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("categoryDao")
public interface CategoryDao {
	List<Category> getCategoryList(Map<String, Object> paramMap);

	int specialExhibitionProdCnt(Map<String, Object> paramMap);

	List<GdMasterEx> specialExhibitionProdList(Map<String, Object> paramMap);

	List<SubCategory> getItemList(Map<String, Object> paramMap);

	Map<String, Object> getReserveItemListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> getReserveItemList(Map<String, Object> paramMap);

	Map<String, Object> getItemListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> getItemListSearch(Map<String, Object> paramMap);

	List<CartRecipe> custSetTitle(Map<String, Object> paramMap);

	void visitorCnt(Map<String, Object> paramMap);

//	List<BasicTagMap> getTagList(Map<String, Object> paramMap);

	List<CartRecipeEx> getCartRecipeProdList(Map<String, Object> paramMap);

	Map<String, Object> custSetListPaging(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetProdList(Map<String, Object> paramMap);

	List<CartRecipeEx> custSetGoodsList(Map<String, Object> paramMap);

	List<GdMasterEx> defSetOneProd(Map<String, Object> paramMap);

	Map<String,Object> discountListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> discountSetProdList(Map<String, Object> paramMap);

	Map<String, Object> getDirectListPaging(Map<String, Object> paramMap);

	List<OdReserveGoodsEx> getDirectListHeader(Map<String, Object> paramMap);

	int targetDate(String date);

	List<String> isenseFilteringProdGdcd(Map<String, Object> paramMap);

	List<GdMasterEx> isenseBestProd(Map<String, Object> paramMap);

	int itemListPaging(Map<String, Object> paramMap);

	List<String> getItemListSubmenu(Map<String, Object> paramMap);

	List<GdMasterEx> searchProdAll(Map<String, Object> paramMap);

	Map<String,Object> getNewItemListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> getNewItemListStatistics(Map<String, Object> paramMap);

	Map<String, Object> setListPaging(Map<String, Object> paramMap);

	List<GdMasterEx> setProdList(Map<String, Object> paramMap);

	Map<String,Object> getSpecialSellingBrandListPaging(Map<String, Object> paramMap);

	List<SpecialSellingh> getSpecialSellingBrandHeader(Map<String, Object> paramMap);

	List<GdMasterEx> searchReserveProdDetail(Map<String, Object> paramMap);

	List<Map<String, Object>> setItemInfoOnlySetProd(Map<String, Object> paramMap);

	List<GdMasterEx> optionProductViewYn(Map<String, Object> paramMap);

	String testPathInfo(String strTestidx);

	List<GdSugar> fruitsSugarInfo(String strGdcd);

	List<String> defProdInfoList(String strGdcd);

	List<GdPipnRef> defProdInfoListNew(String strGdcd);

	List<GdMasterEx> itemDetailBar(Map<String, Object> paramMap);

	List<GdMasterEx> itemDetailBarSetItem(Map<String, Object> paramMap);

	List<GdMasterEx> itemDetailBarOptionYN(Map<String, Object> paramMap);

	String itemDetailBarTestPathInfo(Map<String, Object> paramMap);

	List<GdSugar> itemBarDetailFruitsSugarInfo(Map<String, Object> paramMap);

	String itemBarDetailBasicInfo(Map<String, Object> paramMap);

	List<GdPipn> itemBarDetailBasicInfoNew(Map<String, Object> paramMap);
}
