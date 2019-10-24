
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 15/08/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        Computer a, b;
        
        a = new Computer("Microsoft", "Surface Pro 3", 4.2, 4, 500, 10.4, 2017);
        b = new Computer("Apple", "Macbook Pro", 5.3, 4, 1000, 13.5, 2018);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
