package dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import model.*;
public class ProductDaoImpl implements ProductDaoInterface 
{
    JdbcTemplate jt;
       
	public void setJt(JdbcTemplate jt) 
	{
		this.jt = jt;
	}

	@Override
	public int updateProduct(Product p) 
	{
	  String query="update product set pname='"+p.getPname()+"',pqty='"+p.getPqty()+"' where pid='"+p.getPid()+"'";
	  return  jt.update(query);
	}

	@Override
	public int saveProduct(Product p) 
	{
	   String query="insert into product values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPqty()+"')";
	   return  jt.update(query);
	  
	}

	@Override
	public int deletProduct(Product p) 
	{
		String query="delete from product where pid="+p.getPid();
		return jt.update(query);
	}
/*
	// other class
	@Override
	public void showAllProduct() 
	{
      String query="select * from product";
      RowMapper<Product> rmref = new RowMapperImpl();
      List <Product> plist = jt.query(query,rmref);
	  for(Product p:plist)
	  {
		  System.out.println(p);
	  }
	}
*/
	@Override                    // 102
	public Product showProductById(int pid) 
	{
	  String query="select * from product where pid=?";
	  
	  RowMapper<Product> rmref = new RowMapperImpl();               
	     
      Product p= jt.queryForObject(query,rmref,pid);
      
      System.out.println("Product Id:"+p.getPid());
      System.out.println("Product Name:"+p.getPname());
      System.out.println("Product Qty:"+p.getPqty());
      
      return p;
	}
	// anonmyous class
	@Override
	public List<Product> showAllProduct2() 
	{
       String query="select * from product";
       List<Product> plist=jt.query(query,
    		   new RowMapper<Product>()
    		   {

				@Override
				public Product mapRow(ResultSet rs, int rowNum) throws SQLException 
				{
					Product p = new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPqty(rs.getInt(3));
					System.out.println(p);
					return p;
				}  
    	     });
       return plist;
    }
}
