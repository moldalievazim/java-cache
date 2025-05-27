package Interfaces;

public interface ICache {
  void put(String key, Object value);
  int get(String key);
  void remove(String key);
}
