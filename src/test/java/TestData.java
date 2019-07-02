import java.util.Arrays;
import java.util.List;

public class TestData {
    public static final List<Item> ALL_ITEMS = Arrays.asList(
            new Item("ITEM0001", "黄焖鸡", 18.00),
            new Item("ITEM0013", "肉夹馍", 6.00),
            new Item("ITEM0022", "梅干菜", 8.00),
            new Item("ITEM0030", "凉皮", 2.00)
    );


    public static final List<SalesPromotion> ALL_SALES_PROMOTIONS = Arrays.asList(
            new SalesPromotion("BUY_30_SAVE_6_YUAN", "满30减6", Arrays.asList()),
            new SalesPromotion("50%_DISCOUNT_ON_SPECIFIED_ITEMS", "指定菜品半价", Arrays.asList(
                    "ITEM0001", "ITEM0022"
            ))
    );
   
    /*public static void main(String args[])
    {
    	ItemRepositoryTestImpl item=new ItemRepositoryTestImpl();
    	item.findAll();
    	SalesPromotionRepositoryTestImpl sale=new SalesPromotionRepositoryTestImpl();
    	sale.findAll();
    	
    	
    	//System.out.print("hello World!");
    }*/
}
