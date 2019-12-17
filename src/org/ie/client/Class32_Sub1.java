package org.ie.client;

/* Class32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Class32_Sub1 extends Class32
    implements ImageProducer, ImageObserver
{
    public static int anInt1771;
    public static int anInt1772;
    public static int anInt1773;
    public static int anInt1774;
    public static int anInt1775;
    public static int anInt1776;
    public static int anInt1777;
    public static int anInt1778;
    public static RSString aClass16_1779;
    public static Cache aClass65_1780;
    public static int anInt1781;
    public ImageConsumer anImageConsumer1782;
    public static int anInt1783;
    public static int anInt1784;
    public static Sprite[] aClass37_Sub4_Sub9_Sub3Array1785;
    public ColorModel aColorModel1786;
    public static int anInt1787;
    public static int anInt1788;
    public static int anInt1789 = 2;
    public static RSString aClass16_1790;
    public static int anInt1791;
    public static RSString aClass16_1792;
    public static RSString aClass16_1793;
    public static RSString aClass16_1794;
    
    public void clipDraw(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			  Graphics graphics) {
	anInt1776++;
	method294(i, (byte) -61, i_2_, i_3_, i_1_);
	int i_4_ = -38 % ((-64 - i_0_) / 42);
	Shape shape = graphics.getClip();
	graphics.clipRect(i, i_3_, i_2_, i_1_);
	graphics.drawImage(anImage735, 0, 0, this);
	graphics.setClip(shape);
    }
    
    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
	if (imageconsumer == anImageConsumer1782)
	    anImageConsumer1782 = null;
	anInt1788++;
    }
    
    public static void method293(byte i, RSString rSString, RSString class16_5_,
				 RSString class16_6_) {
	try {
	    Class37_Sub9_Sub33.aClass16_3528 = rSString;
	    Class37_Sub9_Sub33.aClass16_3520 = class16_5_;
	    anInt1774++;
	    if (i >= -119)
		aClass16_1792 = null;
	    Class37_Sub9_Sub33.aClass16_3521 = class16_6_;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("df.H(" + i + ','
			+ (rSString != null ? "{...}" : "null") + ','
			+ (class16_5_ != null ? "{...}" : "null") + ','
			+ (class16_6_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    public boolean imageUpdate(Image image, int i, int i_7_, int i_8_,
			       int i_9_, int i_10_) {
	anInt1791++;
	return true;
    }
    
    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
	anInt1772++;
	if (anImageConsumer1782 != imageconsumer)
	    return false;
	return true;
    }
    
    public void init(Component component, int i, int i_11_, byte i_12_) {
	anInt1784++;
	anIntArray745 = new int[1 + i * i_11_];
	int i_13_ = 44 / ((i_12_ - 53) / 32);
	anInt734 = i;
	anInt732 = i_11_;
	aColorModel1786 = new DirectColorModel(32, 16711680, 65280, 255);
	anImage735 = component.createImage(this);
	method295(2);
	component.prepareImage(anImage735, this);
	method295(2);
	component.prepareImage(anImage735, this);
	method295(2);
	component.prepareImage(anImage735, this);
	this.method291((byte) -10);
    }
    
    public synchronized void method294(int i, byte i_14_, int i_15_, int i_16_,
				       int i_17_) {
	anInt1771++;
	if (anImageConsumer1782 != null) {
	    if (i_14_ != -61)
		aClass16_1779 = null;
	    anImageConsumer1782.setPixels(i, i_16_, i_15_, i_17_,
					  aColorModel1786, anIntArray745,
					  i + i_16_ * anInt734, anInt734);
	    anImageConsumer1782.imageComplete(2);
	}
    }
    
    public synchronized void method295(int i) {
	anInt1787++;
	if (anImageConsumer1782 != null) {
	    anImageConsumer1782.setPixels(0, 0, anInt734, anInt732,
					  aColorModel1786, anIntArray745, 0,
					  anInt734);
	    anImageConsumer1782.imageComplete(i);
	}
    }
    
    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
	anInt1778++;
    }
    
    public static void method296(byte i) {
	aClass16_1793 = null;
	aClass16_1779 = null;
	aClass16_1794 = null;
	if (i != -78)
	    aClass16_1792 = null;
	aClass37_Sub4_Sub9_Sub3Array1785 = null;
	aClass16_1790 = null;
	aClass65_1780 = null;
	aClass16_1792 = null;
    }
    
    public static void drawScroller(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
    	try {
			Class56.aClass37_Sub4_Sub9_Sub1Array1092[0].method597(i_18_, i_20_);
			int i_22_ = (i_21_ - 32) * i_21_ / i_19_;
			if (i_22_ < 8)
				i_22_ = 8;
			Class56.aClass37_Sub4_Sub9_Sub1Array1092[1]
					.method597(i_18_, i_20_ + i_21_ + -16);
			int i_23_ = (-i_22_ + i_21_ + -32) * i / (-i_21_ + i_19_);
			Graphics2D.method578(i_18_, i_20_ + 16, 16, -32 + i_21_,
					Class37_Sub4_Sub7_Sub1_Sub1.anInt3950);
			Graphics2D.method578(i_18_, 16 + (i_20_ + i_23_), 16, i_22_,
					ByteVector.anInt2004);
			Graphics2D.method581(i_18_, i_23_ + (i_20_ + 16), i_22_,
					Class88.anInt1603);
			Graphics2D.method581(1 + i_18_, 16 + (i_20_ - -i_23_), i_22_,
					Class88.anInt1603);
			Graphics2D.method580(i_18_, i_23_ + (16 + i_20_), 16,
					Class88.anInt1603);
			Graphics2D.method580(i_18_, i_23_ + i_20_ - -17, 16,
					Class88.anInt1603);
			Graphics2D.method581(15 + i_18_, i_23_ + i_20_ + 16, i_22_,
					ByteVector.anInt2031);
			Graphics2D.method581(i_18_ - -14, i_23_ + (i_20_ - -17),
					i_22_ - 1, ByteVector.anInt2031);
			Graphics2D.method580(i_18_, i_20_ - -15 + (i_23_ - -i_22_), 16,
					ByteVector.anInt2031);
			Graphics2D.method580(1 + i_18_, i_22_ + i_23_ + 14 + i_20_, 15,
					ByteVector.anInt2031);
		} catch (Exception e) {}
    }
    
    public void draw(int i, Graphics graphics, int i_24_, boolean bool) {
	method295(2);
	anInt1773++;
	graphics.drawImage(anImage735, i, i_24_, this);
	if (bool != false)
	    aClass16_1790 = null;
    }
    
    public void startProduction(ImageConsumer imageconsumer) {
	addConsumer(imageconsumer);
	anInt1775++;
    }
    
    public synchronized void addConsumer(ImageConsumer imageconsumer) {
	anInt1781++;
	anImageConsumer1782 = imageconsumer;
	imageconsumer.setDimensions(anInt734, anInt732);
	imageconsumer.setProperties(null);
	imageconsumer.setColorModel(aColorModel1786);
	imageconsumer.setHints(14);
    }
    
    static {
	aClass16_1779
	    = Class37_Sub2.create_rsstring("No response from server)3");
	aClass16_1790 = aClass16_1779;
	aClass65_1780 = new Cache(260);
	aClass16_1792 = Class37_Sub2.create_rsstring("rot:");
	aClass16_1794
	    = Class37_Sub2.create_rsstring("Checking for updates )2 ");
	aClass16_1793 = aClass16_1794;
    }
}
