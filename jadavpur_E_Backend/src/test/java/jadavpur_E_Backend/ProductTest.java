package jadavpur_E_Backend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.jadavpur_E_Backend.DAO.ProductDAO;
import com.niit.jadavpur_E_Backend.modal.Product;

public class ProductTest 
{

	private static AnnotationConfigApplicationContext context;
	static Product product;
	static ProductDAO productDAO;	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.jadavpur_E_Backend");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	@Test
	public void testInsert()
	{
		product = new Product();
	
		product.setName("Nothing Phone (1)");
		product.setBrand("Apple");
		product.setDescription("HDR10+, Contrast Ratio: 1,000,000:1, Brightness: 500 nits");
		product.setUnitPrice(27499.00);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(2);
		product.setQuantity(3);
		
		assertEquals("Error" , true , productDAO.insert(product));
	}
	
	//@Test
	public void testGetProduct()
	{
		product = productDAO.getProduct(1);
		
		assertEquals("Error" , "PRDf311b4016544", product.getCode());
	}
	
	//@Test
	public void testActiveProduct()
	{
		assertEquals("Error" ,3, productDAO.listActiveProducts().size());
	}
	
	//@Test
	public void testActiveCategoryProduct()
	{
		assertEquals("Error" ,2, productDAO.listActiveProductsByCategory(5).size());
	}
	
	
}
