public interface PriceRelatable{
    int getPrice();
    
    default boolean isMoreExpensive(PriceRelatable p)
    {

        if(getPrice()>p.getPrice())
            return true;
        return false;
    }
}