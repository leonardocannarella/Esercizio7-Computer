
/**
 * Computer
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 15/10/2019)
 */
public class Computer
{
    static int count=0;
    
    private int codice;
    private String marca;
    private String modello;
    private double vel_processore;
    private int dim_ram;
    private int dim_disco;
    private double dim_schermo;
    private int anno_di_acquisto;
    
    public Computer(String marca, String modello, double vel_processore, int dim_ram, int dim_disco, double dim_schermo, int anno_di_acquisto)
    {
        count++;
        codice=count;
        setMarca(marca);
        setModello(modello);
        setVelProcessore(vel_processore);
        setDimRam(dim_ram);
        setDimDisco(dim_disco);
        setDimSchermo(dim_schermo);
        setAnno(anno_di_acquisto);
    }
    
    private void setMarca(String m)
    {
        marca=m;
    }
    
    private void setModello(String m)
    {
        modello=m;
    }
    
    private void setVelProcessore(double v)
    {
        vel_processore=v;
    }
    
    private void setDimRam(int d)
    {
        dim_ram=d;
    }
    
    private void setDimDisco(int d)
    {
        dim_disco=d;
    }
    
    private void setDimSchermo(double d)
    {
        dim_schermo=d;
    }
    
    private void setAnno(int a)
    {
        anno_di_acquisto=a;
    }
    
    public int getCodice()
    {
       return codice; 
    }
    
    public String getMarca()
    {
       return marca; 
    }
    
    public String getModello()
    {
       return modello; 
    }
    
    public double getVelPro()
    {
       return vel_processore; 
    }
    
    public int getDimRam()
    {
       return dim_ram; 
    }
    
    public int getDimDisco()
    {
       return dim_disco; 
    }
    
    public double getDimSchermo()
    {
       return dim_schermo; 
    }
    
    public int getAnno()
    {
       return anno_di_acquisto; 
    }
    
    public String toString()
    {
        return "COMPUTER\n" + 
        "Codice: " + getCodice() + "\nMarca: " + getMarca() + 
        "\nModello: " + getModello() + "\nVelocità del processore: " + getVelPro() + " GHz" + 
        "\nDimensione della RAM: " + getDimRam() + " GB" + "\nDimensione del disco: " + getDimDisco() + " GB" + 
        "\nDimensioni del monitor: " + getDimSchermo() + " pollici" + "\nAnno di acquisto: " + getAnno() + "\n";
    }
}
