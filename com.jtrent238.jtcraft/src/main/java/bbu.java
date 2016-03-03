/*     */ import com.ibm.icu.text.ArabicShaping;
/*     */ import com.ibm.icu.text.ArabicShapingException;
/*     */ import com.ibm.icu.text.Bidi;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbu
/*     */   implements bqz
/*     */ {
/*  27 */   private static final bqx[] c = new bqx['Ā'];
/*     */   
/*     */ 
/*     */ 
/*  31 */   private int[] d = new int['Ā'];
/*  32 */   public int a = 9;
/*  33 */   public Random b = new Random();
/*     */   
/*  35 */   private byte[] e = new byte[65536];
/*     */   
/*  37 */   private int[] f = new int[32];
/*     */   
/*     */   private final bqx g;
/*     */   
/*     */   private final bqf h;
/*     */   
/*     */   private float i;
/*     */   
/*     */   private float j;
/*     */   
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private float m;
/*     */   private float n;
/*     */   
/*     */   public bbu(bbj parambbj, bqx parambqx, bqf parambqf, boolean paramBoolean)
/*     */   {
/*  54 */     this.g = parambqx;
/*  55 */     this.h = parambqf;
/*  56 */     this.k = paramBoolean;
/*     */     
/*  58 */     parambqf.a(this.g);
/*     */     
/*     */ 
/*  61 */     for (int i1 = 0; i1 < 32; i1++) {
/*  62 */       int i2 = (i1 >> 3 & 0x1) * 85;
/*  63 */       int i3 = (i1 >> 2 & 0x1) * 170 + i2;
/*  64 */       int i4 = (i1 >> 1 & 0x1) * 170 + i2;
/*  65 */       int i5 = (i1 >> 0 & 0x1) * 170 + i2;
/*     */       
/*  67 */       if (i1 == 6) {
/*  68 */         i3 += 85;
/*     */       }
/*     */       
/*  71 */       if (parambbj.e) {
/*  72 */         int i6 = (i3 * 30 + i4 * 59 + i5 * 11) / 100;
/*  73 */         int i7 = (i3 * 30 + i4 * 70) / 100;
/*  74 */         int i8 = (i3 * 30 + i5 * 70) / 100;
/*  75 */         i3 = i6;
/*  76 */         i4 = i7;
/*  77 */         i5 = i8;
/*     */       }
/*     */       
/*  80 */       if (i1 >= 16) {
/*  81 */         i3 /= 4;
/*  82 */         i4 /= 4;
/*  83 */         i5 /= 4;
/*     */       }
/*     */       
/*  86 */       this.f[i1] = ((i3 & 0xFF) << 16 | (i4 & 0xFF) << 8 | i5 & 0xFF);
/*     */     }
/*     */     
/*  89 */     d();
/*     */   }
/*     */   
/*     */   public void a(bqy parambqy)
/*     */   {
/*  94 */     c();
/*     */   }
/*     */   
/*     */   private void c()
/*     */   {
/*     */     BufferedImage localBufferedImage;
/*     */     try {
/* 101 */       localBufferedImage = ImageIO.read(bao.B().Q().a(this.g).b());
/*     */     } catch (IOException localIOException) {
/* 103 */       throw new RuntimeException(localIOException);
/*     */     }
/*     */     
/* 106 */     int i1 = localBufferedImage.getWidth();
/* 107 */     int i2 = localBufferedImage.getHeight();
/* 108 */     int[] arrayOfInt = new int[i1 * i2];
/* 109 */     localBufferedImage.getRGB(0, 0, i1, i2, arrayOfInt, 0, i1);
/*     */     
/* 111 */     int i3 = i2 / 16;
/* 112 */     int i4 = i1 / 16;
/*     */     
/* 114 */     int i5 = 1;
/*     */     
/* 116 */     float f1 = 8.0F / i4;
/*     */     
/* 118 */     for (int i6 = 0; i6 < 256; i6++) {
/* 119 */       int i7 = i6 % 16;
/* 120 */       int i8 = i6 / 16;
/*     */       
/* 122 */       if (i6 == 32) { this.d[i6] = (3 + i5);
/*     */       }
/* 124 */       for (int i9 = i4 - 1; 
/* 125 */           i9 >= 0; i9--) {
/* 126 */         int i10 = i7 * i4 + i9;
/* 127 */         int i11 = 1;
/* 128 */         for (int i12 = 0; (i12 < i3) && (i11 != 0); i12++) {
/* 129 */           int i13 = (i8 * i4 + i12) * i1;
/*     */           
/* 131 */           if ((arrayOfInt[(i10 + i13)] >> 24 & 0xFF) != 0) {
/* 132 */             i11 = 0;
/*     */           }
/*     */         }
/* 135 */         if (i11 == 0) {
/*     */           break;
/*     */         }
/*     */       }
/* 139 */       i9++;
/*     */       
/*     */ 
/* 142 */       this.d[i6] = ((int)(0.5D + i9 * f1) + i5);
/*     */     }
/*     */   }
/*     */   
/*     */   private void d() {
/*     */     try {
/* 148 */       InputStream localInputStream = bao.B().Q().a(new bqx("font/glyph_sizes.bin")).b();
/* 149 */       localInputStream.read(this.e);
/*     */     } catch (IOException localIOException) {
/* 151 */       throw new RuntimeException(localIOException);
/*     */     }
/*     */   }
/*     */   
/*     */   private float a(int paramInt, char paramChar, boolean paramBoolean) {
/* 156 */     if (paramChar == ' ')
/* 157 */       return 4.0F;
/* 158 */     if (("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(paramChar) != -1) && (!this.k)) {
/* 159 */       return a(paramInt, paramBoolean);
/*     */     }
/* 161 */     return a(paramChar, paramBoolean);
/*     */   }
/*     */   
/*     */   private float a(int paramInt, boolean paramBoolean)
/*     */   {
/* 166 */     float f1 = paramInt % 16 * 8;
/* 167 */     float f2 = paramInt / 16 * 8;
/* 168 */     float f3 = paramBoolean ? 1.0F : 0.0F;
/*     */     
/* 170 */     this.h.a(this.g);
/*     */     
/* 172 */     float f4 = this.d[paramInt] - 0.01F;
/*     */     
/* 174 */     GL11.glBegin(5);
/* 175 */     GL11.glTexCoord2f(f1 / 128.0F, f2 / 128.0F);
/* 176 */     GL11.glVertex3f(this.i + f3, this.j, 0.0F);
/* 177 */     GL11.glTexCoord2f(f1 / 128.0F, (f2 + 7.99F) / 128.0F);
/* 178 */     GL11.glVertex3f(this.i - f3, this.j + 7.99F, 0.0F);
/* 179 */     GL11.glTexCoord2f((f1 + f4 - 1.0F) / 128.0F, f2 / 128.0F);
/* 180 */     GL11.glVertex3f(this.i + f4 - 1.0F + f3, this.j, 0.0F);
/* 181 */     GL11.glTexCoord2f((f1 + f4 - 1.0F) / 128.0F, (f2 + 7.99F) / 128.0F);
/* 182 */     GL11.glVertex3f(this.i + f4 - 1.0F - f3, this.j + 7.99F, 0.0F);
/* 183 */     GL11.glEnd();
/*     */     
/* 185 */     return this.d[paramInt];
/*     */   }
/*     */   
/*     */   private bqx a(int paramInt) {
/* 189 */     if (c[paramInt] == null) {
/* 190 */       c[paramInt] = new bqx(String.format("textures/font/unicode_page_%02x.png", new Object[] { Integer.valueOf(paramInt) }));
/*     */     }
/*     */     
/* 193 */     return c[paramInt];
/*     */   }
/*     */   
/*     */   private void b(int paramInt) {
/* 197 */     this.h.a(a(paramInt));
/*     */   }
/*     */   
/*     */   private float a(char paramChar, boolean paramBoolean) {
/* 201 */     if (this.e[paramChar] == 0) {
/* 202 */       return 0.0F;
/*     */     }
/*     */     
/* 205 */     int i1 = paramChar / 'Ā';
/*     */     
/* 207 */     b(i1);
/*     */     
/*     */ 
/* 210 */     int i2 = this.e[paramChar] >>> 4;
/*     */     
/* 212 */     int i3 = this.e[paramChar] & 0xF;
/*     */     
/* 214 */     float f1 = i2;
/* 215 */     float f2 = i3 + 1;
/*     */     
/* 217 */     float f3 = paramChar % '\020' * 16 + f1;
/* 218 */     float f4 = (paramChar & 0xFF) / '\020' * 16;
/* 219 */     float f5 = f2 - f1 - 0.02F;
/* 220 */     float f6 = paramBoolean ? 1.0F : 0.0F;
/*     */     
/* 222 */     GL11.glBegin(5);
/* 223 */     GL11.glTexCoord2f(f3 / 256.0F, f4 / 256.0F);
/* 224 */     GL11.glVertex3f(this.i + f6, this.j, 0.0F);
/* 225 */     GL11.glTexCoord2f(f3 / 256.0F, (f4 + 15.98F) / 256.0F);
/* 226 */     GL11.glVertex3f(this.i - f6, this.j + 7.99F, 0.0F);
/* 227 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, f4 / 256.0F);
/* 228 */     GL11.glVertex3f(this.i + f5 / 2.0F + f6, this.j, 0.0F);
/* 229 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, (f4 + 15.98F) / 256.0F);
/* 230 */     GL11.glVertex3f(this.i + f5 / 2.0F - f6, this.j + 7.99F, 0.0F);
/* 231 */     GL11.glEnd();
/*     */     
/* 233 */     return (f2 - f1) / 2.0F + 1.0F;
/*     */   }
/*     */   
/*     */   public int a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 237 */     return a(paramString, paramInt1, paramInt2, paramInt3, true);
/*     */   }
/*     */   
/*     */   public int b(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 241 */     return a(paramString, paramInt1, paramInt2, paramInt3, false);
/*     */   }
/*     */   
/*     */   public int a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 245 */     GL11.glEnable(3008);
/* 246 */     e();
/*     */     
/*     */     int i1;
/*     */     
/* 250 */     if (paramBoolean) {
/* 251 */       i1 = b(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3, true);
/* 252 */       i1 = Math.max(i1, b(paramString, paramInt1, paramInt2, paramInt3, false));
/*     */     } else {
/* 254 */       i1 = b(paramString, paramInt1, paramInt2, paramInt3, false);
/*     */     }
/*     */     
/* 257 */     return i1;
/*     */   }
/*     */   
/*     */   private String b(String paramString) {
/*     */     try {
/* 262 */       Bidi localBidi = new Bidi(new ArabicShaping(8).shape(paramString), 127);
/* 263 */       localBidi.setReorderingMode(0);
/* 264 */       return localBidi.writeReordered(2);
/*     */     }
/*     */     catch (ArabicShapingException localArabicShapingException) {}
/*     */     
/* 268 */     return paramString;
/*     */   }
/*     */   
/*     */   private void e() {
/* 272 */     this.r = false;
/* 273 */     this.s = false;
/* 274 */     this.t = false;
/* 275 */     this.u = false;
/* 276 */     this.v = false;
/*     */   }
/*     */   
/*     */   private float o;
/*     */   private float p;
/*     */   private int q;
/*     */   private boolean r;
/*     */   private boolean s;
/*     */   private boolean t;
/*     */   private boolean u;
/*     */   private boolean v;
/*     */   private void a(String paramString, boolean paramBoolean) {
/* 288 */     for (int i1 = 0; i1 < paramString.length(); i1++) {
/* 289 */       char c1 = paramString.charAt(i1);
/*     */       int i2;
/* 291 */       int i3; if ((c1 == '§') && (i1 + 1 < paramString.length())) {
/* 292 */         i2 = "0123456789abcdefklmnor".indexOf(paramString.toLowerCase().charAt(i1 + 1));
/*     */         
/* 294 */         if (i2 < 16) {
/* 295 */           this.r = false;
/* 296 */           this.s = false;
/* 297 */           this.v = false;
/* 298 */           this.u = false;
/* 299 */           this.t = false;
/* 300 */           if ((i2 < 0) || (i2 > 15)) { i2 = 15;
/*     */           }
/* 302 */           if (paramBoolean) { i2 += 16;
/*     */           }
/* 304 */           i3 = this.f[i2];
/* 305 */           this.q = i3;
/* 306 */           GL11.glColor4f((i3 >> 16) / 255.0F, (i3 >> 8 & 0xFF) / 255.0F, (i3 & 0xFF) / 255.0F, this.p);
/* 307 */         } else if (i2 == 16) {
/* 308 */           this.r = true;
/* 309 */         } else if (i2 == 17) {
/* 310 */           this.s = true;
/* 311 */         } else if (i2 == 18) {
/* 312 */           this.v = true;
/* 313 */         } else if (i2 == 19) {
/* 314 */           this.u = true;
/* 315 */         } else if (i2 == 20) {
/* 316 */           this.t = true;
/* 317 */         } else if (i2 == 21) {
/* 318 */           this.r = false;
/* 319 */           this.s = false;
/* 320 */           this.v = false;
/* 321 */           this.u = false;
/* 322 */           this.t = false;
/*     */           
/* 324 */           GL11.glColor4f(this.m, this.n, this.o, this.p);
/*     */         }
/*     */         
/* 327 */         i1++;
/*     */       }
/*     */       else
/*     */       {
/* 331 */         i2 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(c1);
/*     */         
/* 333 */         if ((this.r) && (i2 != -1))
/*     */         {
/*     */           do {
/* 336 */             i3 = this.b.nextInt(this.d.length);
/* 337 */           } while (this.d[i2] != this.d[i3]);
/* 338 */           i2 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 344 */         float f1 = this.k ? 0.5F : 1.0F;
/* 345 */         int i4 = ((c1 == 0) || (i2 == -1) || (this.k)) && (paramBoolean) ? 1 : 0;
/*     */         
/* 347 */         if (i4 != 0) {
/* 348 */           this.i -= f1;
/* 349 */           this.j -= f1;
/*     */         }
/* 351 */         float f2 = a(i2, c1, this.t);
/* 352 */         if (i4 != 0) {
/* 353 */           this.i += f1;
/* 354 */           this.j += f1;
/*     */         }
/*     */         
/* 357 */         if (this.s) {
/* 358 */           this.i += f1;
/* 359 */           if (i4 != 0) {
/* 360 */             this.i -= f1;
/* 361 */             this.j -= f1;
/*     */           }
/* 363 */           a(i2, c1, this.t);
/* 364 */           this.i -= f1;
/* 365 */           if (i4 != 0) {
/* 366 */             this.i += f1;
/* 367 */             this.j += f1;
/*     */           }
/* 369 */           f2 += 1.0F;
/*     */         }
/*     */         bmh localbmh;
/* 372 */         if (this.v) {
/* 373 */           localbmh = bmh.a;
/* 374 */           GL11.glDisable(3553);
/* 375 */           localbmh.b();
/* 376 */           localbmh.a(this.i, this.j + this.a / 2, 0.0D);
/* 377 */           localbmh.a(this.i + f2, this.j + this.a / 2, 0.0D);
/* 378 */           localbmh.a(this.i + f2, this.j + this.a / 2 - 1.0F, 0.0D);
/* 379 */           localbmh.a(this.i, this.j + this.a / 2 - 1.0F, 0.0D);
/* 380 */           localbmh.a();
/* 381 */           GL11.glEnable(3553);
/*     */         }
/*     */         
/* 384 */         if (this.u) {
/* 385 */           localbmh = bmh.a;
/* 386 */           GL11.glDisable(3553);
/* 387 */           localbmh.b();
/* 388 */           int i5 = this.u ? -1 : 0;
/* 389 */           localbmh.a(this.i + i5, this.j + this.a, 0.0D);
/* 390 */           localbmh.a(this.i + f2, this.j + this.a, 0.0D);
/* 391 */           localbmh.a(this.i + f2, this.j + this.a - 1.0F, 0.0D);
/* 392 */           localbmh.a(this.i + i5, this.j + this.a - 1.0F, 0.0D);
/* 393 */           localbmh.a();
/* 394 */           GL11.glEnable(3553);
/*     */         }
/*     */         
/* 397 */         this.i += (int)f2;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 402 */   private int a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) { if (this.l) {
/* 403 */       int i1 = a(b(paramString));
/* 404 */       paramInt1 = paramInt1 + paramInt3 - i1;
/*     */     }
/* 406 */     return b(paramString, paramInt1, paramInt2, paramInt4, paramBoolean);
/*     */   }
/*     */   
/*     */   private int b(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 410 */     if (paramString == null) {
/* 411 */       return 0;
/*     */     }
/* 413 */     if (this.l) {
/* 414 */       paramString = b(paramString);
/*     */     }
/*     */     
/* 417 */     if ((paramInt3 & 0xFC000000) == 0) { paramInt3 |= 0xFF000000;
/*     */     }
/* 419 */     if (paramBoolean) {
/* 420 */       paramInt3 = (paramInt3 & 0xFCFCFC) >> 2 | paramInt3 & 0xFF000000;
/*     */     }
/*     */     
/* 423 */     this.m = ((paramInt3 >> 16 & 0xFF) / 255.0F);
/* 424 */     this.n = ((paramInt3 >> 8 & 0xFF) / 255.0F);
/* 425 */     this.o = ((paramInt3 & 0xFF) / 255.0F);
/* 426 */     this.p = ((paramInt3 >> 24 & 0xFF) / 255.0F);
/*     */     
/* 428 */     GL11.glColor4f(this.m, this.n, this.o, this.p);
/*     */     
/* 430 */     this.i = paramInt1;
/* 431 */     this.j = paramInt2;
/* 432 */     a(paramString, paramBoolean);
/*     */     
/* 434 */     return (int)this.i;
/*     */   }
/*     */   
/*     */   public int a(String paramString) {
/* 438 */     if (paramString == null) return 0;
/* 439 */     int i1 = 0;
/* 440 */     int i2 = 0;
/*     */     
/* 442 */     for (int i3 = 0; i3 < paramString.length(); i3++) {
/* 443 */       char c1 = paramString.charAt(i3);
/*     */       
/* 445 */       int i4 = a(c1);
/* 446 */       if ((i4 < 0) && (i3 < paramString.length() - 1)) {
/* 447 */         c1 = paramString.charAt(++i3);
/*     */         
/* 449 */         if ((c1 == 'l') || (c1 == 'L')) {
/* 450 */           i2 = 1;
/* 451 */         } else if ((c1 == 'r') || (c1 == 'R')) {
/* 452 */           i2 = 0;
/*     */         }
/* 454 */         i4 = 0;
/*     */       }
/* 456 */       i1 += i4;
/* 457 */       if ((i2 != 0) && (i4 > 0)) { i1++;
/*     */       }
/*     */     }
/* 460 */     return i1;
/*     */   }
/*     */   
/*     */   public int a(char paramChar) {
/* 464 */     if (paramChar == '§') {
/* 465 */       return -1;
/*     */     }
/*     */     
/* 468 */     if (paramChar == ' ') {
/* 469 */       return 4;
/*     */     }
/*     */     
/* 472 */     int i1 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(paramChar);
/* 473 */     if ((paramChar > 0) && (i1 != -1) && (!this.k)) {
/* 474 */       return this.d[i1];
/*     */     }
/*     */     
/*     */ 
/* 478 */     if (this.e[paramChar] != 0) {
/* 479 */       int i2 = this.e[paramChar] >>> 4;
/* 480 */       int i3 = this.e[paramChar] & 0xF;
/*     */       
/* 482 */       if (i3 > 7) {
/* 483 */         i3 = 15;
/* 484 */         i2 = 0;
/*     */       }
/* 486 */       i3++;
/*     */       
/* 488 */       return (i3 - i2) / 2 + 1;
/*     */     }
/*     */     
/* 491 */     return 0;
/*     */   }
/*     */   
/*     */   public String a(String paramString, int paramInt) {
/* 495 */     return a(paramString, paramInt, false);
/*     */   }
/*     */   
/*     */   public String a(String paramString, int paramInt, boolean paramBoolean) {
/* 499 */     StringBuilder localStringBuilder = new StringBuilder();
/* 500 */     int i1 = 0;
/* 501 */     int i2 = paramBoolean ? paramString.length() - 1 : 0;
/* 502 */     int i3 = paramBoolean ? -1 : 1;
/* 503 */     int i4 = 0;
/* 504 */     int i5 = 0;
/*     */     
/* 506 */     for (int i6 = i2; (i6 >= 0) && (i6 < paramString.length()) && (i1 < paramInt); i6 += i3) {
/* 507 */       char c1 = paramString.charAt(i6);
/* 508 */       int i7 = a(c1);
/*     */       
/* 510 */       if (i4 != 0) {
/* 511 */         i4 = 0;
/*     */         
/* 513 */         if ((c1 == 'l') || (c1 == 'L')) {
/* 514 */           i5 = 1;
/* 515 */         } else if ((c1 == 'r') || (c1 == 'R')) {
/* 516 */           i5 = 0;
/*     */         }
/* 518 */       } else if (i7 < 0) {
/* 519 */         i4 = 1;
/*     */       } else {
/* 521 */         i1 += i7;
/* 522 */         if (i5 != 0) { i1++;
/*     */         }
/*     */       }
/* 525 */       if (i1 > paramInt)
/*     */         break;
/* 527 */       if (paramBoolean) {
/* 528 */         localStringBuilder.insert(0, c1);
/*     */       } else {
/* 530 */         localStringBuilder.append(c1);
/*     */       }
/*     */     }
/*     */     
/* 534 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private String c(String paramString)
/*     */   {
/* 545 */     while ((paramString != null) && (paramString.endsWith("\n"))) {
/* 546 */       paramString = paramString.substring(0, paramString.length() - 1);
/*     */     }
/* 548 */     return paramString;
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 552 */     e();
/* 553 */     this.q = paramInt4;
/* 554 */     paramString = c(paramString);
/*     */     
/* 556 */     c(paramString, paramInt1, paramInt2, paramInt3, false);
/*     */   }
/*     */   
/*     */   private void c(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 560 */     List localList = c(paramString, paramInt3);
/* 561 */     for (String str : localList) {
/* 562 */       a(str, paramInt1, paramInt2, paramInt3, this.q, paramBoolean);
/* 563 */       paramInt2 += this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public int b(String paramString, int paramInt) {
/* 568 */     return this.a * c(paramString, paramInt).size();
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 572 */     this.k = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 576 */     return this.k;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 580 */     this.l = paramBoolean;
/*     */   }
/*     */   
/*     */   public List c(String paramString, int paramInt) {
/* 584 */     return Arrays.asList(d(paramString, paramInt).split("\n"));
/*     */   }
/*     */   
/*     */   String d(String paramString, int paramInt) {
/* 588 */     int i1 = e(paramString, paramInt);
/* 589 */     if (paramString.length() <= i1) { return paramString;
/*     */     }
/* 591 */     String str1 = paramString.substring(0, i1);
/*     */     
/* 593 */     int i2 = paramString.charAt(i1);
/* 594 */     int i3 = (i2 == 32) || (i2 == 10) ? 1 : 0;
/* 595 */     String str2 = d(str1) + paramString.substring(i1 + (i3 != 0 ? 1 : 0));
/*     */     
/* 597 */     return str1 + "\n" + d(str2, paramInt);
/*     */   }
/*     */   
/*     */   private int e(String paramString, int paramInt) {
/* 601 */     int i1 = paramString.length();
/* 602 */     int i2 = 0;
/* 603 */     int i3 = 0;
/* 604 */     int i4 = -1;
/* 605 */     int i5 = 0;
/* 608 */     for (; 
/*     */         
/* 608 */         i3 < i1; i3++) {
/* 609 */       char c1 = paramString.charAt(i3);
/*     */       
/* 611 */       switch (c1) {
/*     */       case '§': 
/* 613 */         if (i3 < i1 - 1) {
/* 614 */           char c2 = paramString.charAt(++i3);
/* 615 */           if ((c2 == 'l') || (c2 == 'L')) {
/* 616 */             i5 = 1;
/* 617 */           } else if ((c2 == 'r') || (c2 == 'R') || (b(c2)))
/* 618 */             i5 = 0;
/*     */         }
/* 620 */         break;
/*     */       
/*     */       case '\n': 
/* 623 */         i3--;
/* 624 */         break;
/*     */       case ' ': 
/* 626 */         i4 = i3;
/*     */       default: 
/* 628 */         i2 += a(c1);
/* 629 */         if (i5 != 0) i2++;
/*     */         break;
/*     */       }
/* 632 */       if (c1 == '\n') {
/* 633 */         i3++;i4 = i3;
/*     */       }
/*     */       else
/*     */       {
/* 637 */         if (i2 > paramInt) {
/*     */           break;
/*     */         }
/*     */       }
/*     */     }
/* 642 */     if ((i3 != i1) && (i4 != -1) && (i4 < i3)) {
/* 643 */       return i4;
/*     */     }
/* 645 */     return i3;
/*     */   }
/*     */   
/*     */   private static boolean b(char paramChar) {
/* 649 */     return ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'a') && (paramChar <= 'f')) || ((paramChar >= 'A') && (paramChar <= 'F'));
/*     */   }
/*     */   
/*     */   private static boolean c(char paramChar) {
/* 653 */     return ((paramChar >= 'k') && (paramChar <= 'o')) || ((paramChar >= 'K') && (paramChar <= 'O')) || (paramChar == 'r') || (paramChar == 'R');
/*     */   }
/*     */   
/*     */   private static String d(String paramString) {
/* 657 */     String str = "";
/* 658 */     int i1 = -1;
/* 659 */     int i2 = paramString.length();
/*     */     
/* 661 */     while ((i1 = paramString.indexOf('§', i1 + 1)) != -1) {
/* 662 */       if (i1 < i2 - 1) {
/* 663 */         char c1 = paramString.charAt(i1 + 1);
/*     */         
/* 665 */         if (b(c1)) {
/* 666 */           str = "§" + c1;
/* 667 */         } else if (c(c1)) {
/* 668 */           str = str + "§" + c1;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 673 */     return str;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 677 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */