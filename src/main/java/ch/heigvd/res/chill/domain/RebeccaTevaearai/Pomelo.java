package ch.heigvd.res.chill.domain.RebeccaTevaearai;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pomelo implements IProduct {
    public final static String NAME = "Pomelo";
    public final static BigDecimal PRICE = new BigDecimal(2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}