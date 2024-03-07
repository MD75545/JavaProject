package dao;
import java.util.*;
import model.Product;
public interface ProductDaoInterface 
{
  //DML ---> INSERT , UPDATE , DELETE	
  public  int updateProduct(Product p);
  public  int saveProduct(Product p);
  public  int deletProduct(Product p);
  //DQL ---> SELECT
  //public  void showAllProduct(); // other class
  public  List<Product> showAllProduct2();// anonmyous class
  public Product showProductById(int pid);
}
// DQL --->SELECT 
//1) ALL RECORDS [list]---->  SELECT * FROM PRODUCT; 
//2) SINGLE RECORD [object]---->  SELECT * FROM PRODUCT WHERE PID=?;
//3) INT ---->SELECT COUNT(*) FROM PRODUCT;
//4) LONG ---->SELECT PPRICE FROM PRODUCT;
//5) String ---->SELECT PNAME FROM PRODUCT WHERE PID=?;


