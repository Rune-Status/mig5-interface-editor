package org.ie.client;

/* Class32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class32_Sub2 extends Class32
{
    public Component aComponent1795;
    
    public void draw(int i, Graphics graphics, int i_0_, boolean bool) {
	if (!bool)
	    graphics.drawImage(anImage735, i, i_0_, aComponent1795);
    }
    
    public void clipDraw(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			  Graphics graphics) {
	Shape shape = graphics.getClip();
	graphics.clipRect(i, i_4_, i_3_, i_2_);
	graphics.drawImage(anImage735, 0, 0, aComponent1795);
	int i_5_ = 54 / ((i_1_ - -64) / 42);
	graphics.setClip(shape);
    }
    
    public void init(Component component, int i, int i_6_, byte i_7_) {
	anInt734 = i;
	anInt732 = i_6_;
	anIntArray745 = new int[i_6_ * i - -1];
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray745, anIntArray745.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       (directcolormodel.createCompatibleSampleModel(anInt734,
							     anInt732),
		databufferint, null));
	int i_8_ = 6 % ((53 - i_7_) / 32);
	anImage735 = new BufferedImage(directcolormodel, writableraster, false,
				       new Hashtable());
	aComponent1795 = component;
	method291((byte) -10);
    }
}
