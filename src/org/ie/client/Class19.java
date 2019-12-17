package org.ie.client;

/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class19 implements Runnable
{
    public byte[] aByteArray460;
    public static int anInt461;
    public OutputStream anOutputStream462;
    public int anInt463 = 0;
    public static int anInt464;
    public static int anInt465;
    public InputStream anInputStream466;
    public static int anInt467;
    public Signlink aClass51_468;
    public static int anInt469;
    public Socket aSocket470;
    public static RSString aClass16_471
	= Class37_Sub2.create_rsstring(" <col=ffff00>");
    public static Class37_Sub16 aClass37_Sub16_472 = new Class37_Sub16(0, 0);
    public static int anInt473;
    public static boolean aBoolean474;
    public boolean aBoolean475 = false;
    public static int anInt476;
    public static int anInt477;
    public static int anInt478;
    public int anInt479 = 0;
    public static RSString aClass16_480
	= Class37_Sub2.create_rsstring("m-Ochte mit Ihnen handeln)3");
    public static Deque aClass58_481;
    public static int anInt482;
    public static int anInt483;
    public static boolean[] currentHeldKeyCache = new boolean[112];
    public boolean aBoolean485 = false;
    public Class23 aClass23_486;
    public static int anInt487;
    public static RSString aClass16_488;
    public static Class73 aClass73_489;
    public static int anInt490;
    public static RSInterface aClass18_491;
    /*synthetic*/ public static Class aClass492;
    /*synthetic*/ public static Class aClass493;
    /*synthetic*/ public static Class aClass494;
    /*synthetic*/ public static Class aClass495;
    /*synthetic*/ public static Class aClass496;
    /*synthetic*/ public static Class aClass497;
    /*synthetic*/ public static Class aClass498;
    /*synthetic*/ public static Class aClass499;
    /*synthetic*/ public static Class aClass500;
    /*synthetic*/ public static Class aClass501;
    /*synthetic*/ public static Class aClass502;
    /*synthetic*/ public static Class aClass503;
    /*synthetic*/ public static Class aClass504;
    /*synthetic*/ public static Class aClass505;
    /*synthetic*/ public static Class aClass506;
    /*synthetic*/ public static Class aClass507;
    /*synthetic*/ public static Class aClass508;
    /*synthetic*/ public static Class aClass509;
    /*synthetic*/ public static Class aClass510;
    /*synthetic*/ public static Class aClass511;
    /*synthetic*/ public static Class aClass512;
    /*synthetic*/ public static Class aClass513;
    /*synthetic*/ public static Class aClass514;
    /*synthetic*/ public static Class aClass515;
    /*synthetic*/ public static Class aClass516;
    /*synthetic*/ public static Class aClass517;
    /*synthetic*/ public static Class aClass518;
    /*synthetic*/ public static Class aClass519;
    /*synthetic*/ public static Class aClass520;
    /*synthetic*/ public static Class aClass521;
    /*synthetic*/ public static Class aClass522;
    /*synthetic*/ public static Class aClass523;
    /*synthetic*/ public static Class aClass524;
    /*synthetic*/ public static Class aClass525;
    /*synthetic*/ public static Class aClass526;
    /*synthetic*/ public static Class aClass527;
    /*synthetic*/ public static Class aClass528;
    
    public static boolean method202(int i, int i_0_) {
	anInt461++;
	if (i_0_ != 65)
	    aBoolean474 = true;
	if ((i < 97 || i > 122) && (i < 65 || (i ^ 0xffffffff) < -91))
	    return false;
	return true;
    }
    
    public static Class method203(int i, boolean bool) {
	anInt477++;
	if (bool != false)
	    return null;
	int i_1_ = i;
    while_53_:
	do {
	while_52_:
	    do {
	    while_51_:
		do {
		while_50_:
		    do {
		    while_49_:
			do {
			while_48_:
			    do {
			    while_47_:
				do {
				while_46_:
				    do {
				    while_45_:
					do {
					while_44_:
					    do {
					    while_43_:
						do {
						while_42_:
						    do {
						    while_41_:
							do {
							while_40_:
							    do {
							    while_39_:
								do {
								while_38_:
								    do {
								    while_37_:
									do {
									while_36_:
									    do {
									    while_35_:
										do {
										while_34_:
										    do {
										    while_33_:
											do {
											while_32_:
											    do {
											    while_31_:
												do {
												while_30_:
												    do {
												    while_29_:
													do {
													while_28_:
													    do {
													    while_27_:
														do {
														while_26_:
														    do {
														    while_25_:
															do {
															while_24_:
															    do {
															    while_23_:
																do {
																while_22_:
																    do {
																    while_21_:
																	do {
																	while_20_:
																	    do {
																	    while_19_:
																		do {
																		    do {
																			if ((i_1_ ^ 0xffffffff) != -1) {
																			    if (i_1_ != 1) {
																				if ((i_1_ ^ 0xffffffff) != -3) {
																				    if (i_1_ != 3) {
																					if (i_1_ != 4) {
																					    if (i_1_ != 5) {
																						if (i_1_ != 6) {
																						    if (i_1_ != 7) {
																							if ((i_1_ ^ 0xffffffff) != -9) {
																							    if (i_1_ != 9) {
																								if ((i_1_ ^ 0xffffffff) != -11) {
																								    if ((i_1_ ^ 0xffffffff) != -12) {
																									if ((i_1_ ^ 0xffffffff) != -13) {
																									    if ((i_1_ ^ 0xffffffff) != -14) {
																										if ((i_1_ ^ 0xffffffff) != -15) {
																										    if (i_1_ != 15) {
																											if (i_1_ != 16) {
																											    if (i_1_ != 17) {
																												if ((i_1_ ^ 0xffffffff) != -20) {
																												    if (i_1_ != 20) {
																													if ((i_1_ ^ 0xffffffff) != -22) {
																													    if ((i_1_ ^ 0xffffffff) != -23) {
																														if (i_1_ != 23) {
																														    if ((i_1_ ^ 0xffffffff) != -25) {
																															if (i_1_ != 25) {
																															    if (i_1_ != 26) {
																																if ((i_1_ ^ 0xffffffff) != -28) {
																																    if (i_1_ != 30) {
																																	if (i_1_ != 31) {
																																	    if (i_1_ != 32) {
																																		if ((i_1_ ^ 0xffffffff) != -34) {
																																		    if ((i_1_ ^ 0xffffffff) != -35) {
																																			if ((i_1_ ^ 0xffffffff) != -36) {
																																			    if (i_1_ != 36) {
																																				if (i_1_ != 37) {
																																				    if (i_1_ != 38) {
																																					if ((i_1_ ^ 0xffffffff) == -40)
																																					    break while_52_;
																																					break while_53_;
																																				    }
																																				} else
																																				    break while_50_;
																																				break while_51_;
																																			    }
																																			} else
																																			    break while_48_;
																																			break while_49_;
																																		    }
																																		} else
																																		    break while_46_;
																																		break while_47_;
																																	    }
																																	} else
																																	    break while_44_;
																																	break while_45_;
																																    }
																																} else
																																    break while_42_;
																																break while_43_;
																															    }
																															} else
																															    break while_40_;
																															break while_41_;
																														    }
																														} else
																														    break while_38_;
																														break while_39_;
																													    }
																													} else
																													    break while_36_;
																													break while_37_;
																												    }
																												} else
																												    break while_34_;
																												break while_35_;
																											    }
																											} else
																											    break while_32_;
																											break while_33_;
																										    }
																										} else
																										    break while_30_;
																										break while_31_;
																									    }
																									} else
																									    break while_28_;
																									break while_29_;
																								    }
																								} else
																								    break while_26_;
																								break while_27_;
																							    }
																							} else
																							    break while_24_;
																							break while_25_;
																						    }
																						} else
																						    break while_22_;
																						break while_23_;
																					    }
																					} else
																					    break while_20_;
																					break while_21_;
																				    }
																				} else
																				    break;
																				break while_19_;
																			    }
																			} else {
																			    if (aClass492 != null)
																				return aClass492;
																			    return aClass492 = method210("org.ie.client.Class37_Sub9_Sub14");
																			}
																			if (aClass493 != null)
																			    return aClass493;
																			return aClass493 = method210("org.ie.client.Class37_Sub9_Sub7");
																		    } while (false);
																		    if (aClass494 != null)
																			return aClass494;
																		    return aClass494 = method210("org.ie.client.Class37_Sub9_Sub25");
																		} while (false);
																		if (aClass495 != null)
																		    return aClass495;
																		return aClass495 = method210("org.ie.client.Class37_Sub9_Sub35");
																	    } while (false);
																	    if (aClass496 != null)
																		return aClass496;
																	    return aClass496 = method210("org.ie.client.Class37_Sub9_Sub4");
																	} while (false);
																	if (aClass497 != null)
																	    return aClass497;
																	return aClass497 = method210("org.ie.client.Class37_Sub9_Sub18");
																    } while (false);
																    if (aClass498 != null)
																	return aClass498;
																    return aClass498 = method210("org.ie.client.Class37_Sub9_Sub31");
																} while (false);
																if (aClass499 != null)
																    return aClass499;
																return aClass499 = method210("org.ie.client.Class37_Sub9_Sub29");
															    } while (false);
															    if (aClass500 != null)
																return aClass500;
															    return aClass500 = method210("org.ie.client.Class37_Sub9_Sub15");
															} while (false);
															if (aClass501 != null)
															    return aClass501;
															return aClass501 = method210("org.ie.client.Class37_Sub9_Sub27");
														    } while (false);
														    if (aClass502 != null)
															return aClass502;
														    return aClass502 = method210("org.ie.client.Class37_Sub9_Sub13");
														} while (false);
														if (aClass503 != null)
														    return aClass503;
														return aClass503 = method210("org.ie.client.Class37_Sub9_Sub28");
													    } while (false);
													    if (aClass504 != null)
														return aClass504;
													    return aClass504 = method210("org.ie.client.Class37_Sub9_Sub11");
													} while (false);
													if (aClass505 != null)
													    return aClass505;
													return aClass505 = method210("org.ie.client.Class37_Sub9_Sub33");
												    } while (false);
												    if (aClass506 != null)
													return aClass506;
												    return aClass506 = method210("org.ie.client.Class37_Sub9_Sub19");
												} while (false);
												if (aClass507 != null)
												    return aClass507;
												return aClass507 = method210("org.ie.client.Class37_Sub9_Sub34");
											    } while (false);
											    if (aClass508 != null)
												return aClass508;
											    return aClass508 = method210("org.ie.client.Class37_Sub9_Sub24");
											} while (false);
											if (aClass509 != null)
											    return aClass509;
											return aClass509 = method210("org.ie.client.Class37_Sub9_Sub20");
										    } while (false);
										    if (aClass510 != null)
											return aClass510;
										    return aClass510 = method210("org.ie.client.Class37_Sub9_Sub10");
										} while (false);
										if (aClass511 != null)
										    return aClass511;
										return aClass511 = method210("org.ie.client.Class37_Sub9_Sub9");
									    } while (false);
									    if (aClass512 != null)
										return aClass512;
									    return aClass512 = method210("org.ie.client.Class37_Sub9_Sub1");
									} while (false);
									if (aClass513
									    != null)
									    return aClass513;
									return aClass513 = method210("org.ie.client.Class37_Sub9_Sub26");
								    } while (false);
								    if (aClass514
									!= null)
									return aClass514;
								    return (aClass514
									    = method210("org.ie.client.Class37_Sub9_Sub32"));
								} while (false);
								if (aClass515
								    != null)
								    return aClass515;
								return (aClass515
									= (method210
									   ("org.ie.client.Class37_Sub9_Sub22")));
							    } while (false);
							    if (aClass516
								!= null)
								return aClass516;
							    return (aClass516
								    = (method210
								       ("org.ie.client.Class37_Sub9_Sub17")));
							} while (false);
							if (aClass517 != null)
							    return aClass517;
							return (aClass517
								= (method210
								   ("org.ie.client.Class37_Sub9_Sub36")));
						    } while (false);
						    if (aClass518 != null)
							return aClass518;
						    return (aClass518
							    = (method210
							       ("org.ie.client.Class37_Sub9_Sub8")));
						} while (false);
						if (aClass519 != null)
						    return aClass519;
						return (aClass519
							= (method210
							   ("org.ie.client.Class37_Sub9_Sub5")));
					    } while (false);
					    if (aClass520 != null)
						return aClass520;
					    return (aClass520
						    = (method210
						       ("org.ie.client.Class37_Sub9_Sub3")));
					} while (false);
					if (aClass521 != null)
					    return aClass521;
					return (aClass521
						= (method210
						   ("org.ie.client.Class37_Sub9_Sub6")));
				    } while (false);
				    if (aClass522 != null)
					return aClass522;
				    return (aClass522
					    = method210("org.ie.client.Class37_Sub9_Sub2"));
				} while (false);
				if (aClass523 != null)
				    return aClass523;
				return (aClass523
					= method210("org.ie.client.Class37_Sub9_Sub16"));
			    } while (false);
			    if (aClass524 != null)
				return aClass524;
			    return aClass524 = method210("org.ie.client.Class37_Sub9_Sub23");
			} while (false);
			if (aClass525 != null)
			    return aClass525;
			return aClass525 = method210("org.ie.client.Class37_Sub9_Sub37");
		    } while (false);
		    if (aClass526 != null)
			return aClass526;
		    return aClass526 = method210("org.ie.client.Class37_Sub9_Sub30");
		} while (false);
		if (aClass527 != null)
		    return aClass527;
		return aClass527 = method210("org.ie.client.Class37_Sub9_Sub12");
	    } while (false);
	    if (aClass528 != null)
		return aClass528;
	    return aClass528 = method210("org.ie.client.Class37_Sub9_Sub21");
	} while (false);
	return null;
    }
    
    public void run() {
	anInt464++;
	try {
	    for (;;) {
		int i;
		int i_2_;
		synchronized (this) {
		    if (anInt479 == anInt463) {
			if (aBoolean475)
			    break;
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    i = anInt463;
		    if (anInt463 <= anInt479)
			i_2_ = -anInt463 + anInt479;
		    else
			i_2_ = -anInt463 + 5000;
		}
		if ((i_2_ ^ 0xffffffff) < -1) {
		    try {
			anOutputStream462.write(aByteArray460, i, i_2_);
		    } catch (IOException ioexception) {
			aBoolean485 = true;
		    }
		    anInt463 = (i_2_ + anInt463) % 5000;
		    try {
			if (anInt479 == anInt463)
			    anOutputStream462.flush();
		    } catch (IOException ioexception) {
			aBoolean485 = true;
		    }
		}
	    }
	    try {
		if (anInputStream466 != null)
		    anInputStream466.close();
		if (anOutputStream462 != null)
		    anOutputStream462.close();
		if (aSocket470 != null)
		    aSocket470.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	    aByteArray460 = null;
	} catch (Exception exception) {
	    Class37_Sub9_Sub3.method768(-92, null, exception);
	}
    }
    
    public void method204(int i, byte i_3_, byte[] is, int i_4_)
	throws IOException {
	if (i_3_ < 95)
	    anInt490 = -56;
	anInt467++;
	if (!aBoolean475) {
	    if (aBoolean485) {
		aBoolean485 = false;
		throw new IOException();
	    }
	    if (aByteArray460 == null)
		aByteArray460 = new byte[5000];
	    synchronized (this) {
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    aByteArray460[anInt479] = is[i + i_5_];
		    anInt479 = (anInt479 + 1) % 5000;
		    if (anInt479 == (4900 + anInt463) % 5000)
			throw new IOException();
		}
		if (aClass23_486 == null)
		    aClass23_486 = aClass51_468.method1119(this, 3, (byte) 65);
		this.notifyAll();
	    }
	}
    }
    
    public int method205(boolean bool) throws IOException {
	anInt469++;
	if (aBoolean475)
	    return 0;
	if (bool != false)
	    aClass73_489 = null;
	return anInputStream466.read();
    }
    
    public void finalize() {
	method209((byte) -128);
	anInt465++;
    }
    
    public int method206(int i) throws IOException {
	anInt482++;
	if (i > -104)
	    finalize();
	if (aBoolean475)
	    return 0;
	return anInputStream466.available();
    }
    
    public static void method207(int i) {
	currentHeldKeyCache = null;
	if (i == -3) {
	    aClass16_480 = null;
	    aClass16_471 = null;
	    aClass58_481 = null;
	    aClass16_488 = null;
	    aClass37_Sub16_472 = null;
	    aClass18_491 = null;
	    aClass73_489 = null;
	}
    }
    
    public void method208(int i, int i_6_, int i_7_, byte[] is)
	throws IOException {
	anInt476++;
	if (i_7_ != 122)
	    method207(126);
	if (!aBoolean475) {
	    while ((i ^ 0xffffffff) < -1) {
		int i_8_ = anInputStream466.read(is, i_6_, i);
		if (i_8_ <= 0)
		    throw new EOFException();
		i -= i_8_;
		i_6_ += i_8_;
	    }
	}
    }
    
    public void method209(byte i) {
	if (i < -127) {
	    anInt478++;
	    if (!aBoolean475) {
		synchronized (this) {
		    aBoolean475 = true;
		    this.notifyAll();
		}
		if (aClass23_486 != null) {
		    while (aClass23_486.anInt591 == 0)
			Class37_Sub9_Sub20.method846(1L, (byte) 58);
		    if (aClass23_486.anInt591 == 1) {
			try {
			    ((Thread) aClass23_486.anObject595).join();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		}
		aClass23_486 = null;
	    }
	}
    }
    
    public Class19(Socket socket, Signlink signlink) throws IOException {
	try {
	    aSocket470 = socket;
	    aClass51_468 = signlink;
	    aSocket470.setSoTimeout(30000);
	    aSocket470.setTcpNoDelay(true);
	    anInputStream466 = aSocket470.getInputStream();
	    anOutputStream462 = aSocket470.getOutputStream();
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("fd.<init>("
						    + (socket != null ? "{...}"
						       : "null")
						    + ','
						    + (signlink != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    /*synthetic*/ public static Class method210(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass58_481 = new Deque();
	anInt487 = 0;
	aClass16_488 = Class37_Sub2.create_rsstring("http:)4)4");
	anInt490 = 0;
    }
}
