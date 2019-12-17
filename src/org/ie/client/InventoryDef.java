package org.ie.client;

/* Class37_Sub4_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InventoryDef extends NodeSub
{
    public static int[] anIntArray2872;
    public static RSString aClass16_2873;
    public int size = 0;
    public static RSString aClass16_2875;
    public static int anInt2876;
    public static RSString aClass16_2877;
    public static RSString aClass16_2878;
    public static RSString aClass16_2879
	= Class37_Sub2.create_rsstring("red:");
    public static RSString aClass16_2880
	= Class37_Sub2.create_rsstring("Ihr Spielkonto wurde deaktiviert)3");
    public static int anInt2881;
    public static RSString aClass16_2882;
    public static RSString aClass16_2883;
    public static int anInt2884;
    
    public static void method725(Class37_Sub11_Sub1 class37_sub11_sub1, int i,
				 int i_0_) {
	if (i_0_ != -21)
	    method728((byte) -117);
	anInt2876++;
	for (;;) {
	    Class37_Sub20 class37_sub20
		= ((Class37_Sub20)
		   Class37_Sub4_Sub7.aClass58_2633.getFirst());
	    if (class37_sub20 == null)
		break;
	    boolean bool = false;
	    for (int i_1_ = 0; class37_sub20.anInt2205 > i_1_; i_1_++) {
		if (class37_sub20.aClass23Array2209[i_1_] != null) {
		    if ((class37_sub20.aClass23Array2209[i_1_].anInt591
			 ^ 0xffffffff)
			== -3)
			class37_sub20.anIntArray2212[i_1_] = -5;
		    if ((class37_sub20.aClass23Array2209[i_1_].anInt591
			 ^ 0xffffffff)
			== -1)
			bool = true;
		}
		if (class37_sub20.aClass23Array2206[i_1_] != null) {
		    if ((class37_sub20.aClass23Array2206[i_1_].anInt591
			 ^ 0xffffffff)
			== -3)
			class37_sub20.anIntArray2212[i_1_] = -6;
		    if (class37_sub20.aClass23Array2206[i_1_].anInt591 == 0)
			bool = true;
		}
	    }
	    if (bool)
		break;
	    class37_sub11_sub1.method989(i);
	    class37_sub11_sub1.method964(119, 0);
	    int i_2_ = class37_sub11_sub1.pos;
	    class37_sub11_sub1.method947(class37_sub20.anInt2207);
	    for (int i_3_ = 0; class37_sub20.anInt2205 > i_3_; i_3_++) {
		if (class37_sub20.anIntArray2212[i_3_] != 0)
		    class37_sub11_sub1
			.method964(115, class37_sub20.anIntArray2212[i_3_]);
		else {
		    try {
			int i_4_ = class37_sub20.anIntArray2214[i_3_];
			if (i_4_ != 0) {
			    if ((i_4_ ^ 0xffffffff) == -2) {
				Field field
				    = (Field) (class37_sub20.aClass23Array2209
					       [i_3_].anObject595);
				field.setInt(null, (class37_sub20
						    .anIntArray2204[i_3_]));
				class37_sub11_sub1.method964(i_0_ ^ ~0x68, 0);
			    } else if ((i_4_ ^ 0xffffffff) == -3) {
				Field field
				    = (Field) (class37_sub20.aClass23Array2209
					       [i_3_].anObject595);
				int i_5_ = field.getModifiers();
				class37_sub11_sub1.method964(100, 0);
				class37_sub11_sub1.method947(i_5_);
			    }
			} else {
			    Field field
				= (Field) (class37_sub20.aClass23Array2209
					   [i_3_].anObject595);
			    int i_6_ = field.getInt(null);
			    class37_sub11_sub1.method964(116, 0);
			    class37_sub11_sub1.method947(i_6_);
			}
			if ((i_4_ ^ 0xffffffff) != -4) {
			    if ((i_4_ ^ 0xffffffff) == -5) {
				Method method
				    = (Method) (class37_sub20.aClass23Array2206
						[i_3_].anObject595);
				int i_7_ = method.getModifiers();
				class37_sub11_sub1.method964(111, 0);
				class37_sub11_sub1.method947(i_7_);
			    }
			} else {
			    Method method
				= (Method) (class37_sub20.aClass23Array2206
					    [i_3_].anObject595);
			    byte[][] is
				= class37_sub20.aByteArrayArrayArray2213[i_3_];
			    Object[] objects = new Object[is.length];
			    for (int i_8_ = 0; is.length > i_8_; i_8_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_8_])));
				objects[i_8_] = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (object != null) {
				if (object instanceof Number) {
				    class37_sub11_sub1.method964(i_0_ ^ ~0x6c,
								 1);
				    class37_sub11_sub1.method949
					(((Number) object).longValue(),
					 (byte) 98);
				} else if (!(object instanceof RSString))
				    class37_sub11_sub1.method964(108, 4);
				else {
				    class37_sub11_sub1.method964(i_0_ + 137,
								 2);
				    class37_sub11_sub1.method977(((RSString)
								  object),
								 i_0_ ^ ~0x14);
				}
			    } else
				class37_sub11_sub1.method964(103, 0);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class37_sub11_sub1.method964(121, -10);
		    } catch (java.io.InvalidClassException invalidclassexception) {
			class37_sub11_sub1.method964(112, -11);
		    } catch (java.io.StreamCorruptedException streamcorruptedexception) {
			class37_sub11_sub1.method964(108, -12);
		    } catch (java.io.OptionalDataException optionaldataexception) {
			class37_sub11_sub1.method964(i_0_ ^ ~0x75, -13);
		    } catch (IllegalAccessException illegalaccessexception) {
			class37_sub11_sub1.method964(120, -14);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class37_sub11_sub1.method964(104, -15);
		    } catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			class37_sub11_sub1.method964(102, -16);
		    } catch (SecurityException securityexception) {
			class37_sub11_sub1.method964(i_0_ ^ ~0x61, -17);
		    } catch (java.io.IOException ioexception) {
			class37_sub11_sub1.method964(118, -18);
		    } catch (NullPointerException nullpointerexception) {
			class37_sub11_sub1.method964(101, -19);
		    } catch (Exception exception) {
			class37_sub11_sub1.method964(127, -20);
		    } catch (Throwable throwable) {
			class37_sub11_sub1.method964(110, -21);
		    }
		}
	    }
	    class37_sub11_sub1.method937(i_2_, (byte) -87);
	    class37_sub11_sub1.method948(-i_2_ + class37_sub11_sub1.pos);
	    class37_sub20.unlink();
	}
    }
    
    public void method726(int i, int i_9_, ByteVector class37_sub11) {
	anInt2884++;
	if (i < 53)
	    anIntArray2872 = null;
	if ((i_9_ ^ 0xffffffff) == -3)
	    size = class37_sub11.getUnsignedShort();
    }
    
    public void method727(ByteVector class37_sub11, boolean bool) {
	anInt2881++;
	for (;;) {
	    int i = class37_sub11.getUnsignedByte();
	    if (i == 0)
		break;
	    method726(85, i, class37_sub11);
	}
	if (bool != false)
	    anIntArray2872 = null;
    }
    
    public static void method728(byte i) {
	if (i <= 90)
	    method725(null, 35, -71);
	aClass16_2873 = null;
	aClass16_2877 = null;
	aClass16_2878 = null;
	aClass16_2879 = null;
	aClass16_2883 = null;
	anIntArray2872 = null;
	aClass16_2882 = null;
	aClass16_2875 = null;
	aClass16_2880 = null;
    }
    
    static {
	aClass16_2873
	    = (Class37_Sub2.create_rsstring
	       ("Account locked as we suspect it has been stolen)3"));
	aClass16_2878 = aClass16_2879;
	aClass16_2877 = aClass16_2873;
	aClass16_2883
	    = Class37_Sub2.create_rsstring("Login server offline)3");
	aClass16_2875 = aClass16_2883;
	aClass16_2882 = aClass16_2879;
    }
}
