package org.ie.client;

/* Signlink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import org.ie.Main;

public class Signlink implements Runnable {
	public Interface2 anInterface2_1030;
	public static String aString1031;
	public File aFile1032 = null;
	public static String aString1033;
	public Class70 aClass70_1034;
	public static Method aMethod1035;
	public EventQueue anEventQueue1036;
	public Class70 aClass70_1037 = null;
	public Thread aThread1038;
	public static String aString1039;
	public File aFile1040;
	public static int anInt1041 = 3;
	public Class70 aClass70_1042;
	public boolean aBoolean1043 = false;
	public static Method aMethod1044;
	public Applet anApplet1045;
	public Class70[] aClass70Array1046;
	public Class23 aClass23_1047;
	public Class23 aClass23_1048;
	public static String serverIp = "0.0.0.0";

	@SuppressWarnings("unchecked")
	public void run() {
		for (;;) {
			Class23 class23;
			synchronized (this) {
				for (;;) {
					if (aBoolean1043)
						return;
					if (aClass23_1047 != null) {
						class23 = aClass23_1047;
						aClass23_1047 = aClass23_1047.aClass23_592;
						if (aClass23_1047 == null)
							aClass23_1048 = null;
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				int i = class23.anInt593;
				if (i == 1)
					class23.anObject595 = new Socket(InetAddress
							.getByName((String) (class23.anObject594)),
							class23.anInt590);
				else if (i == 2) {
					Thread thread = new Thread((Runnable) class23.anObject594);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(class23.anInt590);
					class23.anObject595 = thread;
				} else if ((i ^ 0xffffffff) == -5)
					class23.anObject595 = new DataInputStream(
							((URL) class23.anObject594).openStream());
				else if (i != 8) {
					if (i != 9)
						throw new Exception();
					Object[] objects = (Object[]) class23.anObject594;
					class23.anObject595 = ((Class) objects[0])
							.getDeclaredField((String) objects[1]);
				} else {
					Object[] objects = (Object[]) class23.anObject594;
					class23.anObject595 = ((Class) objects[0])
							.getDeclaredMethod(((String) objects[1]),
									((Class[]) objects[2]));
				}
				class23.anInt591 = 1;
			} catch (Throwable throwable) {
				class23.anInt591 = 2;
			}
		}
	}

	public Interface2 method1116(int i) {
		if (i >= -121)
			aMethod1044 = null;
		return anInterface2_1030;
	}

	public Class23 method1117(String string, int i, boolean bool) {
		if (bool != true)
			return null;
		return method1121(0, string, i, (byte) -112, 1);
	}

	@SuppressWarnings("unchecked")
	public Class23 method1118(byte i, String string, Class var_class,
			Class[] var_classes) {
		if (i <= 59)
			aBoolean1043 = false;
		return method1121(0, new Object[] { var_class, string, var_classes },
				0, (byte) -93, 8);
	}

	public Class23 method1119(Runnable runnable, int i, byte i_0_) {
		if (i_0_ != 65)
			aFile1032 = null;
		return method1121(0, runnable, i, (byte) -110, 2);
	}

	public Class23 method1120(int i, byte i_1_) {
		if (i_1_ < 6)
			aString1033 = null;
		return method1121(0, null, i, (byte) -108, 3);
	}

	public Class23 method1121(int i, Object object, int i_2_, byte i_3_,
			int i_4_) {
		Class23 class23 = new Class23();
		class23.anInt593 = i_4_;
		class23.anInt590 = i_2_;
		class23.anObject594 = object;
		synchronized (this) {
			if (aClass23_1048 != null) {
				aClass23_1048.aClass23_592 = class23;
				aClass23_1048 = class23;
			} else
				aClass23_1048 = aClass23_1047 = class23;
			this.notify();
		}
		return class23;
	}

	public Class23 method1122(byte i, URL url) {
		return method1121(0, url, 0, (byte) 122, 4);
	}

	static String cache614 = "C:\\Users\\Chris\\Desktop\\SpawnScape\\cache614\\runescape/";
	static String cache530 = "C:\\Users\\Chris\\Desktop\\WildScape Server 530\\data\\cache/";
	static String cache508 = "C:\\Users\\Chris\\Desktop\\Zaros\\Cache Editor_New\\caches\\508/";
	static String ourCache = "C:\\Users\\Chris\\Desktop\\Zaros\\Zaros_Server\\data\\cache/";
	static String cache562 = "C:\\Users\\Chris\\Desktop\\562_cache/";
	
	public static String findCacheDirectory() {
		return cache614;
	}

	public void findCacheDirectory(int i, int i_7_, int i_8_, String string) {
		if ((i ^ 0xffffffff) > -33 || (i ^ 0xffffffff) < -35)
			i = 32;
		String[] strings = { cache614 };
		if (i_8_ == -19218) {
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -3; i_10_++) {
					for (int i_12_ = 0; (strings.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
						try {
							String string_13_ = strings[i_12_];
							if (aClass70_1037 == null) {
								try {
									File file_14_ = new File("random.dat");
									if ((i_10_ ^ 0xffffffff) == -2 || file_14_.exists())
										aClass70_1037 = new Class70(file_14_, "rw", 25L);
								} catch (Exception exception) {
									aClass70_1037 = null;
								}
							}
							if (aFile1040 == null) {
								try {
									File file = new File(string_13_);
									if (i_10_ == 1 && !file.exists()) {
										boolean bool = file.mkdir();
										if (!bool)
											continue;
									}
									File file_15_ = new File(file,
											"main_file_cache.dat2");
									if ((i_10_ ^ 0xffffffff) == -1
											&& !file_15_.exists())
										continue;
									aClass70_1034 = new Class70(file_15_, "rw",
											52428800L);
									aClass70Array1046 = new Class70[i_7_];
									for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)); i_16_++)
										aClass70Array1046[i_16_] = (new Class70(
												new File(
														file,
														("main_file_cache.idx" + i_16_)),
												"rw", 1048576L));
									aClass70_1042 = (new Class70(new File(file,
											"main_file_cache.idx255"), "rw",
											1048576L));
									aFile1032 = aFile1040 = file;
								} catch (Exception exception) {
									try {
										aClass70_1034.method1257(12);
										for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)); i_17_++)
											aClass70Array1046[i_17_]
													.method1257(i_8_ + 19282);
										aClass70_1042.method1257(-121);
									} catch (Exception exception_18_) {
										/* empty */
									}
									aClass70Array1046 = null;
									aFile1032 = aFile1040 = null;
									aClass70_1034 = aClass70_1042 = null;
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
						if (aClass70_1037 != null && aFile1040 != null)
							return;
					}
			}
			if (aFile1040 == null) {
				System.out.println("No CACHE.");
				throw new RuntimeException();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Class23 method1124(Class var_class, int i, String string) {
		if (i >= -71)
			aMethod1044 = null;
		return method1121(0, new Object[] { var_class, string }, 0, (byte) 114,
				9);
	}

	public void method1125(byte i) {
		synchronized (this) {
			aBoolean1043 = true;
			this.notifyAll();
		}
		try {
			aThread1038.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		if (aClass70_1034 != null) {
			try {
				aClass70_1034.method1257(111);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
		}
		if (aClass70_1042 != null) {
			try {
				aClass70_1042.method1257(-123);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
		}
		if (i == -111) {
			if (aClass70Array1046 != null) {
				for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (aClass70Array1046.length ^ 0xffffffff)); i_19_++) {
					if (aClass70Array1046[i_19_] != null) {
						try {
							aClass70Array1046[i_19_].method1257(-118);
						} catch (java.io.IOException ioexception) {
							/* empty */
						}
					}
				}
			}
			do {
				if (aClass70_1037 != null) {
					try {
						aClass70_1037.method1257(52);
					} catch (java.io.IOException ioexception) {
						break;
					}
					break;
				}
			} while (false);
		}
	}

	public Signlink(boolean bool, Applet applet, int i, String string, int i_20_) {
		aClass70_1034 = null;
		aFile1040 = null;
		anApplet1045 = null;
		aClass70_1042 = null;
		aClass23_1047 = null;
		aClass23_1048 = null;
		aString1039 = "Unknown";
		anApplet1045 = applet;
		aString1033 = "1.1";
		try {
			aString1039 = System.getProperty("java.vendor");
			aString1033 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aString1031 = System.getProperty("user.home");
			if (aString1031 != null)
				aString1031 += "/";
		} catch (Exception exception) {
			/* empty */
		}
		if (aString1031 == null)
			aString1031 = "~/";
		try {
			anEventQueue1036 = Toolkit.getDefaultToolkit()
					.getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			if (applet != null)
				aMethod1035 = (applet.getClass().getMethod(
						"setFocusTraversalKeysEnabled",
						new Class[] { Boolean.TYPE }));
			else
				aMethod1035 = (Class.forName("java.awt.Component")
						.getDeclaredMethod("setFocusTraversalKeysEnabled",
								new Class[] { Boolean.TYPE }));
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (applet == null)
				aMethod1044 = (Class.forName("java.awt.Container")
						.getDeclaredMethod("setFocusCycleRoot",
								new Class[] { Boolean.TYPE }));
			else
				aMethod1044 = applet.getClass().getMethod("setFocusCycleRoot",
						(new Class[] { Boolean.TYPE }));
		} catch (Exception exception) {
			/* empty */
		}
		if (bool)
			findCacheDirectory(i, i_20_, -19218, string);
		aBoolean1043 = false;
		aThread1038 = new Thread(this);
		aThread1038.setPriority(10);
		aThread1038.setDaemon(true);
		aThread1038.start();
	}
}
