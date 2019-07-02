import java.util.List;

public interface ItemRepository {       //对所有点单菜进行操作
    List<Item> findAll();
}
