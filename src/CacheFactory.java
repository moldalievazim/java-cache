import Interfaces.ICache;
import CacheImpl.CacheType;
import CacheImpl.FIFOCacheBuilder;

public class CacheFactory {
  public static ICache createCacheInstance(CacheType type){
    switch (type) {
      case CacheType.FIFO:
        FIFOCacheBuilder gBuilder = new FIFOCacheBuilder();
        gBuilder = gBuilder.setCapacity(10).setServerName("localhost");
        return gBuilder.build();
      case CacheType.LRU:
        return new LRUCache();
      default:
        throw new IllegalArgumentException("Unknown cache type: " + type);
    }
  }
}
