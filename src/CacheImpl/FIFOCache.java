package CacheImpl;

import Interfaces.ICache;

public class FIFOCache implements ICache{
  int capacity;
  String server;

  public FIFOCache(int capacity) {
    this.capacity = capacity; 
    this.server = "Global Cache Server"; 
  }

  @Override
  public void put(String key, Object value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'put'");
  }

  @Override
  public int get(String key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public void remove(String key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setServerName(String server) {
    this.server = server;
  }
  
}
