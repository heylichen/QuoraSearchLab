package heylichen;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisClient {
  
  private Jedis jedis;
  
  @Before
  
  public void setup() { 
  
    //连接redis服务器，虚拟机的ip地址192.168.20.128:6379 
  
    jedis = new Jedis("192.168.192.128",6479);
  
    //权限认证
  } 
  
  /** 
  
   * redis存储字符串 
  
   */
  
  @Test
  public void testString() { 
  
    //-----添加数据----------  
   // jedis.set("k1","hello");
    String msg = jedis.get("k1");
    System.out.println(msg);//执行结果：xinxin
  

  } 
}