package CacheImpl;

public class FIFOCacheBuilder {
  private FIFOCache fifoCache;

  public FIFOCacheBuilder() {
    fifoCache = new FIFOCache(3);
  }

  public FIFOCacheBuilder setCapacity(int capacity) {
    fifoCache.setCapacity(capacity);
    return this;
  }

  public FIFOCacheBuilder setServerName(String string) {
    fifoCache.setServerName(string);
    return this;
  }

  public FIFOCache build() {
    return fifoCache; 
  }
}
