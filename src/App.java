import Interfaces.ICache;
import CacheImpl.CacheType;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            ICache cache = CacheFactory.createCacheInstance(CacheType.FIFO);
            cache.put("Nurbek", 30);
            System.out.println("Value for key1: " + cache.get("Nurbek"));
            cache.remove("Nurbek");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}