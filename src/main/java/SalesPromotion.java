import java.util.List;

public class SalesPromotion {     //�����Żݷ�ʽ��
    private String type;
    private String displayName;
    private List<String> relatedItems;

    public SalesPromotion(String type, String displayName, List<String> relatedItems) {
        this.type = type;
        this.displayName = displayName;
        this.relatedItems = relatedItems;
    }

    public String getType() {
        return type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<String> getRelatedItems() {
        return relatedItems;
    }
}
