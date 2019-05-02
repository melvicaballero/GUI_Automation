package com.jala.test;

import com.jala.main.RomanNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumberTest {
    RomanNumber rn;

    @Before
    public void setup(){
    this.rn = new RomanNumber();
    }

    @Test
    public void convert_romanoL(){
        Assert.assertEquals(50,rn.convert("L"));
    }

    @Test
    public void convert_romanoXI(){
        Assert.assertEquals(11,rn.convert("XI"));
    }

    @Test
    public void convert_romanoCCC(){
        Assert.assertEquals(300,rn.convert("CCC"));
    }

    @Test
    public void convert_romanoXIX(){
        Assert.assertEquals(19,rn.convert("XIX"));
    }

    @Test
    public void convert_romanoDXCV(){
        Assert.assertEquals(595,rn.convert("DXCV"));
    }

    @Test
    public void convert_romanoCDXCV(){
        Assert.assertEquals(495,rn.convert("CDXCV"));
    }

    @Test
    public void convert_romanoMMXVI(){
        Assert.assertEquals(2016,rn.convert("MMXVI"));
    }

    @Test
    public void convert_romanoCXXXIV(){
        Assert.assertEquals(134,rn.convert("CXXXIV"));
    }

    @Test
    public void convert_romanoMMMCXXXIV(){
        Assert.assertEquals(3134,rn.convert("MMMCXXXIV"));
    }

    @Test
    public void convert_romanoMMMLXXV(){
        Assert.assertEquals(3075,rn.convert("MMMLXXV"));
    }

    @Test
    public void convert_romanoempty(){
        Assert.assertEquals(0,rn.convert(""));
    }

    @Test
    public void convert_romano_invalid(){
        Assert.assertEquals(0,rn.convert("S"));
    }

    @Test
    public void convert_romano_invalidIIII(){
        Assert.assertEquals(0,rn.convert("IIII"));
    }

    @Test
    public void convert_romano_invalidVV(){
        Assert.assertEquals(0,rn.convert("VV"));
    }

    @Test
    public void convert_romano_invalidVXV(){
        Assert.assertEquals(0,rn.convert("VXV"));
    }

    @Test
    public void convert_romano_invalidIIIIX(){
        Assert.assertEquals(0,rn.convert("IIIIX"));
    }

    @Test
    public void convert_romano_invalidIIIX(){
        Assert.assertEquals(0,rn.convert("IIIX"));
    }

    @Test
    public void convert_romano_invalidLC(){
        Assert.assertEquals(0,rn.convert("LC"));
    }
}
